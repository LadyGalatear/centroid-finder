## DfsBinaryGroupFinder

- This class takes a binary rectangular array that represents an image. It is 0-indexed and returns a list of sorted groups. The size of the group is the number of pixels in that group. The centroid is the coordinates determining the center of that group. This should be determined using integer division!

## EuclideanColorDistance

- This class takes two hexadecimal values and finds the Euclidean distance between those two values. The form is 0xRRGGBB. A larger number means the values are far from each other; a smaller number means they are more similar.

## DistanceImageBinarizer

- This class uses color distance to determine if a pixel should be black or white in a binary image. Black is the default; white only appears in areas that are less than the threshold for that color.

## BinarizingImageGroupFinder

- This class converts an RGB image into a 2D array, then runs through that array to connect white pixel groups together.

