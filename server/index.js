const express = require("express");
const path = require("node:path");
const fs = require("node:fs/promises");

const projectRoot = path.resolve(__dirname, "..");

require("dotenv").config({
  path: path.join(projectRoot, ".env"),
});

const app = express();
const port = process.env.PORT || 3000;

const videosDirectory = path.resolve(
  projectRoot,
  process.env.VIDEOS_DIR || "processor/sampleInput"
);

const videoExtensions = new Set([
  ".mp4",
  ".mov",
  ".avi",
  ".mkv",
  ".webm",
  ".m4v",
]);

app.get("/api/videos", async (req, res) => {
  try {
    const files = await fs.readdir(videosDirectory, {
      withFileTypes: true,
    });

    const videos = files
      .filter(
        (file) =>
          file.isFile() &&
          videoExtensions.has(path.extname(file.name).toLowerCase())
      )
      .map((file) => file.name)
      .sort();

    res.json(videos);
  } catch (error) {
    console.error(error);
    res.status(500).json({
      error: "Error reading video directory",
    });
  }
});

app.use("/videos", express.static(videosDirectory));

app.listen(port, () => {
  console.log(`Server listening on http://localhost:${port}`);
});
