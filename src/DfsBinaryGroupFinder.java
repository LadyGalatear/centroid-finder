import java.util.List;

public class DfsBinaryGroupFinder implements BinaryGroupFinder {
   /**
    * Finds connected pixel groups of 1s in an integer array representing a binary image.
    * 
    * The input is a non-empty rectangular 2D array containing only 1s and 0s.
    * If the array or any of its subarrays are null, a NullPointerException
    * is thrown. If the array is otherwise invalid, an IllegalArgumentException
    * is thrown.
    *
    * Pixels are considered connected vertically and horizontally, NOT diagonally.
    * The top-left cell of the array (row:0, column:0) is considered to be coordinate
    * (x:0, y:0). Y increases downward and X increases to the right. For example,
    * (row:4, column:7) corresponds to (x:7, y:4).
    *
    * The method returns a list of sorted groups. The group's size is the number 
    * of pixels in the group. The centroid of the group
    * is computed as the average of each of the pixel locations across each dimension.
    * For example, the x coordinate of the centroid is the sum of all the x
    * coordinates of the pixels in the group divided by the number of pixels in that group.
    * Similarly, the y coordinate of the centroid is the sum of all the y
    * coordinates of the pixels in the group divided by the number of pixels in that group.
    * The division should be done as INTEGER DIVISION.
    *
    * The groups are sorted in DESCENDING order according to Group's compareTo method.
    * 
    * @param image a rectangular 2D array containing only 1s and 0s
    * @return the found groups of connected pixels in descending order
    */
    @Override
    public List<Group> findConnectedGroups(int[][] image) {
        validateArray(image);

        return null;
    }

    private void validateArray(int[][] image) {
        if (image == null) throw new NullPointerException("Image array cannot be null!");
        if (image.length == 0) throw new IllegalArgumentException("Image array cannot be empty!");
        if (image[0] == null) throw new NullPointerException("Image subarray 0 reads as null!");
        if (image[0].length == 0) throw new IllegalArgumentException("Image subarray cannot be empty!");
        for (int i = 1; i < image.length; i++) {
            if (image[i] == null) {
                throw new NullPointerException("Image subarray " + i + " reads as null!");
            }

            if (image[i].length != image[0].length) {
                throw new IllegalArgumentException("Image array is not rectangular!");
            }
        }

        for (int row = 0; row < image.length; row++) {
            for (int column = 0; column < image[0].length; column++) {
                if (image[row][column] != 0 && image[row][column] != 1) {
                    throw new IllegalArgumentException("Image array contains non-binary integers!");
                }
            }
        }
    }
    
}
