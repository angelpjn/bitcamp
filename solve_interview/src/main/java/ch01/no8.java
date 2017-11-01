/*
1.8 0행렬 : M * N 행렬의 한 원소가 0일 경우, 해당 원소가 속한 행과 열의 모든 원소를 0으로 설정하는 알고리즘을 작성하라.
 */
package ch01;

public class no8 {

    public static void main(String[] args) {

        int m = 3, n = 3;

        int[] arr = new int[m * n];
        int[][] arr2 = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * m * n);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                }
            }

        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr2[i].length; j++) {
//                System.out.print(arr2[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}