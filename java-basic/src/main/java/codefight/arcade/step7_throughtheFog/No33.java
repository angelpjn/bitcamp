/*
Given an array of equal-length strings,
check if it is possible to rearrange 
the strings in such a way that
after the rearrangement the strings 
at consecutive positions would differ by exactly one character.

For inputArray = ["aba", "bbb", "bab"], the output should be
stringsRearrangement(inputArray) = false;

Example

For a = [2, 4, 7], the output should be
absoluteValuesSumMinimization(a) = 4.
*/
package codefight.arcade.step7_throughtheFog;

import java.util.Arrays;

public class No33 {
    boolean stringsRearrangement(String[] inputArray) {
        
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
        No33 no = new No33();
        
        String[] inputArray = {-2, -1, 0, 1, 2};
        
        System.out.println(no.stringsRearrangement(inputArray));
    }

}
