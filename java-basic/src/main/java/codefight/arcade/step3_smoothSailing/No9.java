/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
*/
package codefight.arcade.step3_smoothSailing;

import java.util.ArrayList;

public class No9 {

    String[] allLongestStrings(String[] inputArray) {

        ArrayList<String> list = new ArrayList<>();
        
        int check = 0;
        for (int i = 1; i < inputArray.length; i++) {
            check = Math.max(inputArray[i - 1].length(), inputArray[i].length());
        }

        for (int i = 0; i < inputArray.length; i++) {
            if (check == inputArray[i].length())
                list.add(inputArray[i]);
        }

        return list.toArray(String[] list2);
    }

    public static void main(String[] args) {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba" };
        No9 no = new No9();
        System.out.println(no.allLongestStrings(inputArray));
    }
}
