/*
1.8 0행렬 : M * N 행렬의 한 원소가 0일 경우, 해당 원소가 속한 행과 열의 모든 원소를 0으로 설정하는 알고리즘을 작성하라.
 */
package ch1;
import java.util.Arrays;
import java.util.Scanner;

public class no8 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
//        int m = scan.nextInt();
//        int n = scan.nextInt();
//        int o = m * n;
        
        int[][] arr1 = {
                {0, 2, 3}, 
                {4, 5, 6},
                {7, 8, 9}
                };
        
        int[] arr2 = new int[9];
        
        for (int i = 0; i < arr1.length; i++) { 
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = arr2[3 * i + j];
            }
        }
        
        int[][] arr3 = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        } 
    }
}

/*
        if (arr1[0][0] == 0) {
            arr2[0 + 1] = 0;
            arr2[0 + 2] = 0;
            arr2[0 + 3] = 0;
            arr2[0 + 6] = 0;
        } else if (arr1[0][1] == 0) {
            arr2[1 - 1] = 0;
            arr2[1 + 1] = 0;
            arr2[1 + 3] = 0;
            arr2[1 + 6] = 0;
        } else if (arr1[0][2] == 0) {
            arr2[2 - 1] = 0;
            arr2[2 + 2] = 0;
            arr2[2 + 3] = 0;
            arr2[2 + 6] = 0;
        } else if (arr1[1][0] == 0) {
            arr2[3 + 1] = 0;
            arr2[3 + 2] = 0;
            arr2[3 - 3] = 0;
            arr2[3 + 3] = 0;
        } else if (arr1[1][1] == 0) {
            arr2[4 - 1] = 0;
            arr2[4 + 1] = 0;
            arr2[4 - 3] = 0;
            arr2[4 + 3] = 0;
        } else if (arr1[1][2] == 0) {
            arr2[5 - 1] = 0;
            arr2[5 - 2] = 0;
            arr2[5 - 3] = 0;
            arr2[5 + 3] = 0;
        } else if (arr1[2][0] == 0) {
            arr2[6 + 1] = 0;
            arr2[6 + 2] = 0;
            arr2[6 - 3] = 0;
            arr2[6 - 6] = 0;
        } else if (arr1[2][1] == 0) {
            arr2[7 - 1] = 0;
            arr2[7 + 1] = 0;
            arr2[7 - 3] = 0;
            arr2[7 - 6] = 0;
        } else if (arr1[2][2] == 0) {
            arr2[8 - 1] = 0;
            arr2[8 - 2] = 0;
            arr2[8 - 3] = 0;
            arr2[8 - 6] = 0;
        } else {}
 */