/*
six groups of two hexadecimal digits
0 to 9 or A to F
separated by hyphens
01-23-45-67-89-AB
*/
package codefight.arcade.step12_longestWorld;

import java.util.HashSet;
import java.util.Set;

public class No55 {

    int differentSquares(int[][] matrix) {
        int range = (matrix.length - 1) * (matrix[0].length - 1);
        String[] matrixArr = new String[range];
        for (int i = 0; i < range; i++) {
            matrixArr[i] = "";
        }
        
        int index = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        matrixArr[index] += Integer.toString(matrix[i + k][j + l]);
                    }
                }
                index++;
            }
        }
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i < matrixArr.length; i++) {
            set.add(matrixArr[i]);
        }
        return set.size();
    }
    
    public static void main(String[] args) {
        No55 no = new No55();

//        int[][] matrix = {{1,2,1}, 
//                          {2,2,2}, 
//                          {2,2,2}, 
//                          {1,2,3}, 
//                          {2,2,1}};
        
//        int[][] matrix = {{9,9,9,9,9}, 
//                          {9,9,9,9,9}, 
//                          {9,9,9,9,9}, 
//                          {9,9,9,9,9}, 
//                          {9,9,9,9,9}, 
//                          {9,9,9,9,9}};
        
        int[][] matrix = {{2,5,3,4,3,1,3,2}, 
                          {4,5,4,1,2,4,1,3}, 
                          {1,1,2,1,4,1,1,5}, 
                          {1,3,4,2,3,4,2,4}, 
                          {1,5,5,2,1,3,1,1}, 
                          {1,2,3,3,5,1,2,4}, 
                          {3,1,4,4,4,1,5,5}, 
                          {5,1,3,3,1,5,3,5}, 
                          {5,4,4,3,5,4,4,4}};

        System.out.println(no.differentSquares(matrix));
    }

}
