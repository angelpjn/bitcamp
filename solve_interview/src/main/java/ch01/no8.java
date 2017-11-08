/*
1.8 0행렬 : M * N 행렬의 한 원소가 0일 경우, 해당 원소가 속한 행과 열의 모든 원소를 0으로 설정하는 알고리즘을 작성하라.
 */
package ch01;

public class No8 {

    public static void main(String[] args) {

        int m = 3;
        int n = 4;
        
        System.out.println(m + "\t" + n);

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = i + j + 1;
            }
        }
        
        arr[1][2] = 0;

        for (int o = 0; o < m; o++) {
            for (int p = 0; p < n; p++) {
                System.out.print(arr[o][p]);
            }
            System.out.println();
        }
        
        System.out.println("--------------------");

        int i = 0;
        int j = 0;
        loop: for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    break loop;
                }
            }
        }

        int k = 0;
        int l = 0;

        for (k = 0; k < m; k++) {
            for (l = 0; l < n; l++) {
                if (k == i || l == j) {
                    arr[k][l] = 0;
                }
            }
        }

        for (int o = 0; o < m; o++) {
            for (int p = 0; p < n; p++) {
                System.out.print(arr[o][p]);
            }
            System.out.println();
        }
    }
}