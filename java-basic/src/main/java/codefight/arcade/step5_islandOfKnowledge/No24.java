/*
For inputArray = [5, 3, 6, 7, 9], the output should be
avoidObstacles(inputArray) = 4.

*/
package codefight.arcade.step5_islandOfKnowledge;

public class No24 {
    int[][] minesweeper(boolean[][] matrix) {

        int[][] chage = new int[matrix.length][matrix[0].length];
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < chage.length; i++) {
            for (int j = 0; j < chage[i].length; j++) {
                if (matrix[i][j])
                    chage[i][j]++;
            }
        }
        
        for (int i = 0; i < chage.length; i++) {
            for (int j = 0; j < chage[i].length; j++) {
                
                if (i == 0) {
                    for (int k = i; k < i + 2; k++) {
                        if (j == 0) {
                            for (int l = j; l < j + 2; l++) {
                                if (i == k && j == l) 
                                    continue;
                                else 
                                    result[i][j] += chage[k][l];
                            }

                        } else if (j == chage[i].length - 1){
                            for (int l = j - 1; l < j + 1; l++) {
                                if (i == k && j == l) 
                                    continue;
                                else 
                                    result[i][j] += chage[k][l];
                            }
                            
                        }  else if (0 < j && j < chage[0].length - 1) {
                            for (int l = j - 1; l < j + 2; l++) {
                                if (i == k && j == l) 
                                    continue;
                                else 
                                    result[i][j] += chage[k][l];
                            }
                        }
                    }
                    
                } else if (i == chage.length - 1){
                    for (int k = i - 1; k < i + 1; k++) {
                        if (j == 0) {
                            for (int l = j; l < j + 2; l++) {
                                if (i == k && j == l) 
                                    continue;
                                else 
                                    result[i][j] += chage[k][l];
                            }

                        } else if (j == chage[i].length - 1){
                            for (int l = j - 1; l < j + 1; l++) {
                                if (i == k && j == l) 
                                    continue;
                                else 
                                    result[i][j] += chage[k][l];
                            }
                            
                        } else if (0 < j && j < chage[0].length - 1)  {
                            for (int l = j - 1; l < j + 2; l++) {
                                if (i == k && j == l) 
                                    continue;
                                else 
                                    result[i][j] += chage[k][l];
                            }
                            
                        }
                    }
                    
                } else if (0 < i && i < chage.length - 1) {
                    for (int k = i - 1; k < i + 2; k++) {
                        if (j == 0) {
                            for (int l = j; l < j + 2; l++) {
                                if (i == k && j == l) 
                                    continue;
                                else 
                                    result[i][j] += chage[k][l];
                            }

                        } else if (j == chage[i].length - 1){
                            for (int l = j - 1; l < j + 1; l++) {
                                if (i == k && j == l) 
                                    continue;
                                else 
                                    result[i][j] += chage[k][l];
                            }
                            
                        } else if (0 < j && j < chage[0].length - 1) {
                            for (int l = j - 1; l < j + 2; l++) {
                                if (i == k && j == l) 
                                    continue;
                                else 
                                    result[i][j] += chage[k][l];
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        No24 no = new No24();

        boolean[][] matrix = { { true, false, false }, { false, true, false }, { false, false, false } };

        System.out.println(no.minesweeper(matrix));
    }

}
