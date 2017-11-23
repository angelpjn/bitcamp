/*
For inputArray = [5, 3, 6, 7, 9], the output should be
avoidObstacles(inputArray) = 4.

*/
package codefight.arcade.step5_islandOfKnowledge;

public class No23 {
    int[][] boxBlur(int[][] image) {

        int[][] result = new int[image.length - 2][image[0].length - 2];
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        result[i][j] += image[k][l];
                    }
                }
            }
        }
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] /= 9;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        No23 no = new No23();

        int[][] image = { { 36, 0, 18, 9 },
                          { 27, 54, 9, 0 },
                          { 81, 63, 72, 45 } };

        System.out.println(no.boxBlur(image));
    }

}
