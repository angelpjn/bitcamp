/*
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
*/
package codefight.arcade.step3_smoothSailing;

import java.util.Arrays;

public class No15 {

    String[] addBorder(String[] picture) {

        int init = picture.length + 2;
        
        String[] arr = new StringBuffer(arr.clone());

        for (int i = 0; i < init; i++) {
            arr[i] = "";
        }
        
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < picture[0].length() + 2; j++) {
                arr[i] += "*";
            }
        }
        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            
//            if (i == 0 || i == arr.length - 1) {
//                for (int j = 0; j < picture[0].length(); j++) {
//                    arr[i] += "*";
//                }
//            }
//            if (i != 0 && i != arr.length - 1) {
//                arr[i].replace(arr[i].charAt(picture[0].length() + 1), '*');
//                String n = arr[i].replace(arr[i].substring(1, arr[i].length() - 1), arr[i].substring(0, arr[i].length() - 2));
//                n.replace(n.charAt(0), '*');
//            }
//        }
//        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        No15 no = new No15();

        String[] picture = { "abc", "ded" };

        System.out.println(no.addBorder(picture));
    }

}
