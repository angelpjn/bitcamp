/*
Given array of integers, remove each kth element from it.

For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].
-20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1,
                0,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
*/
package codefight.arcade.step8_divingDeeper;

import java.util.Arrays;

public class No34 {
    int[] extractEachKth(int[] inputArray, int k) {
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if ((i + 1) % k == 0) {
//                System.out.println(inputArray[i]);
                count++;
            }
        }
//        System.out.println(count);
        
        int[] result = new int[inputArray.length - count];
        int range = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if ((i + 1) % k == 0) {
                range++;
                continue;
            }
            else {
                for (int j = i - range; j < inputArray.length - count; j++) {
                    result[j] = inputArray[i];
                }
            }
        }
//        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        No34 no = new No34();

        int[] inputArray = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;

        System.out.println(no.extractEachKth(inputArray, k));
    }

}
