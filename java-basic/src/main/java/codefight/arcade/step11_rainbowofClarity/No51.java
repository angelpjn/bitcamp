/*
six groups of two hexadecimal digits
0 to 9 or A to F
separated by hyphens
01-23-45-67-89-AB
*/
package codefight.arcade.step11_rainbowofClarity;

import java.util.ArrayList;
import java.util.Arrays;

public class No51 {

    String longestWord(String text) {
        String[] arr = text.split(", ");
        
        ArrayList<Integer> countList = new ArrayList<>();
        
        System.out.println(Arrays.toString(arr));
        return "ss";
    }


    public static void main(String[] args) {
        No51 no = new No51();

        String text = "Ready, steady, go!";

        System.out.println(no.longestWord(text));
    }

}


















