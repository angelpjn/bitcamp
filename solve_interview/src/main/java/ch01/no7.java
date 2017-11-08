/*
1.7 행렬 회전 : 이미지를 표현하는 N * N 행렬이 있다.
이미지의 각 픽셀은 4바이트로 표현된다.
이 때, 이미지를 90도 회전시키는 메서드를 작성하라.
행렬을 추가로 사용하지 않고서도 할 수 있겠는가?
 */
package ch01;

import java.util.Scanner;

public class No7 {

    static Scanner scan = new Scanner(System.in);
    
    static int prompt(String message) {
        System.out.print(message);
        return Integer.parseInt(scan.nextLine());
    }
    
    public static void main(String[] args) {
        
        int m = prompt("M 행 수 : ");
        int n = prompt("N 열 수 : ");
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[n][m];
        
        System.out.printf("%d * %d 행렬의 원 출력 : \n", m, n);
        System.out.println();
        
        for (int col = 0; col < m; col++) {
            for (int row = 0; row < n; row++) {
                arr1[col][row] = col + row;
            }
        }

        for (int col = 0; col < m; col++) {
            for (int row = 0; row < n; row++) {
                System.out.print(arr1[col][row] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.printf("%d * %d 행렬의 90도 회전  출력 : \n", m, n);
        System.out.println();
        
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                arr2[row][col] = arr1[m - 1 - col][row];
            }
        }
        
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print(arr2[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
