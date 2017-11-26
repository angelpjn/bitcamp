/*
마지막 히든 열어서 확인
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

        int[][] countSpelling = new int[inputArray.length][inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (i == j)
                    continue;
                else {
                    for (int k = 0; k < inputArray[0].length(); k++) {
                        if (inputArray[i].charAt(k) != inputArray[j].charAt(k)) {
                            countSpelling[i][j]++;
                        }
                    }
                }
            }
        }
        
        int count = 0;
        int[] countResult = new int[2];
        for (int i = 0; i < countSpelling.length; i++) {
            count = 0;
            for (int j = 0; j < countSpelling[0].length; j++) {
                if(countSpelling[i][j] == 1)
                    count++;
            }
            if (count == 1) 
                countResult[0] += 1;

            else if (count > 1) 
                countResult[1] += 1;
        }

        System.out.println(Arrays.deepToString(countSpelling));
        System.out.println(Arrays.toString(countResult));
        if (countResult[1] == inputArray.length) {
            System.out.println(1);
            return true;
        }
        else if (countResult[1] == inputArray.length - 1 && countResult[0] == 1) {
            System.out.println(2);
            return true;
        }
        else if (countResult[1] == inputArray.length - 2 && countResult[0] == 2) {
            System.out.println(3);
            return true;
        }
        System.out.println(4);
        return false;
    }

    public static void main(String[] args) {
        No33 no = new No33();
        
        String[] inputArray = {"abc", 
                "bef", 
                "bcc", 
                "bec", 
                "bbc", 
                "bdc"};
        
        System.out.println(no.stringsRearrangement(inputArray));
    }

}
