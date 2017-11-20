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

        int check = -1;
        for (int i = 0; i < inputArray.length; i++) {
            check = Math.max(check, inputArray[i].length());
        }

        for (int i = 0; i < inputArray.length; i++) {
            if (check == inputArray[i].length())
                list.add(inputArray[i]);
        }

        String[] result = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] inputArray = {"aa"};
        No9 no = new No9();
        System.out.println(no.allLongestStrings(inputArray));
    }
}
