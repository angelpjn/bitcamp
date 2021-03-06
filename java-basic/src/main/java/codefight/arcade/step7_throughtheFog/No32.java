/*
Given a sorted array of integers a, find an integer x from a such that the value of

abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)
is the smallest possible (here abs denotes the absolute value).
If there are several possible answers, output the smallest one.

Example

For a = [2, 4, 7], the output should be
absoluteValuesSumMinimization(a) = 4.
*/
package codefight.arcade.step7_throughtheFog;

import java.util.Arrays;

public class No32 {
    int absoluteValuesSumMinimization(int[] a) {
        
        int[] arr = new int[a.length];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                arr[i] += Math.abs(a[j] - a[i]);
            }
        }
        
        int minimum = 10000000;
        for (int i = 0; i < a.length; i++) {
            minimum = Math.min(minimum, arr[i]);
        }
        int result = 0;
        int count = 0;
        int min = 10000000;
        for (int i = 0; i < a.length; i++) {
            if (minimum == arr[i]) {
                result = a[i];
                min = Math.min(min, a[i]);
                count++;
            }
        }
        if (count == 1)
            return result;
        else 
            return min;
    }

    public static void main(String[] args) {
        No32 no = new No32();
        
        int[] a = {-2, -1, 0, 1, 2};
        
        System.out.println(no.absoluteValuesSumMinimization(a));
    }

}
