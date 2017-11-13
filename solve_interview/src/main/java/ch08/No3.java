/*
마술 인덱스 :
배열 A[0...n-1]에서 A[i] = i인 인덱스를 마술 인덱스(magic index)라 정의한다.
정렬된 상태의 배열이 주어졌을 때, 마술 인덱스가 존재한다면 그 값을 찾는 메서드를 작성하라.
배열 안에 중복된 값은 없다.

 연관문제 : 중복된 값을 허용한다면?
 
 */

package ch08;

import java.util.Arrays;

public class No3 {

    public static void main(String[] args) {

        int n = 100;
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * n * 10);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (i == arr[i])
                System.out.printf("i = %d\narr[%d] = %d\n\n", i, i, arr[i]);
        }
    }
}
