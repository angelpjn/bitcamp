/*
Given array of integers, find the maximal possible sum of some of its k consecutive elements.

Example

For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
arrayMaxConsecutiveSum(inputArray, k) = 8.
All possible sums of 2 consecutive elements are:

2 + 3 = 5;
3 + 5 = 8;
5 + 1 = 6;
1 + 6 = 7.
Thus, the answer is 8.

Array of positive integers.

Guaranteed constraints:
3 ≤ inputArray.length ≤ 105,
1 ≤ inputArray[i] ≤ 1000.
*/
package codefight.arcade.step8_divingDeeper;

public class No37 {
    int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        
        int[] sumArr = new int[inputArray.length - k + 1];

        for (int i = 0; i < inputArray.length - k + 1; i++) {
            for (int j = i; j < i + k; j++) {
                sumArr[i] += inputArray[j];
            }
        }
        int max = 0;
        for (int i = 0; i < sumArr.length; i++) {
            max = Math.max(sumArr[i], max);
        }
        return max;
    }

    public static void main(String[] args) {
        No37 no = new No37();

        int[] inputArray = {3, 2, 1, 1};
        int k = 1;

        System.out.println(no.arrayMaxConsecutiveSum(inputArray, k));
    }

}
