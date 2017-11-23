/*
Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.

For inputArray = [1, 2, 1], elemToReplace = 1 and substitutionElem = 3, the output should be
arrayReplace(inputArray, elemToReplace, substitutionElem) = [3, 2, 3].
*/
package codefight.arcade.step6_rainsOfReason;

import java.util.Arrays;

public class No25 {
    int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        int[] result = Arrays.copyOf(inputArray, inputArray.length);
        
        for (int i = 0; i < inputArray.length; i++) {
            if (result[i] == elemToReplace)
                result[i] = substitutionElem;
        }
        return result;
    }

    public static void main(String[] args) {
        No25 no = new No25();

        int[] inputArray = {1, 2, 3, 4, 5};
        System.out.println(no.arrayReplace(inputArray, 3, 0));
    }

}
