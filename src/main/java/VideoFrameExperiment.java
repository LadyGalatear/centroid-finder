import java.io.File;
import java.io.IOException;
import org.jcodec.containers.mp4.MP4Util;
import org.jcodec.containers.mp4.MP4Util.Movie;

public class VideoFrameExperiment {
    public static void main(String[] args) throws IOException {
        File videoFile = new File("sampleInput/sample.mp4");
        Movie movie = MP4Util.parseFullMovie(videoFile);
        double duration = (double) movie.getMoov().getDuration() / 
            movie.getMoov().getTimescale();
        System.out.println("Video duration: " + duration + " seconds");
    }
}