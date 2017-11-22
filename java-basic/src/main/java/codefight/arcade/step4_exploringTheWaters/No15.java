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
package codefight.arcade.step4_exploringTheWaters;

public class No15 {

    String[] addBorder(String[] picture) {

        int init = picture.length + 2;
        
        String[] arr = new String[init];
        String[] arr2 = new String[init];

        for (int i = 0; i < init; i++) {
            arr[i] = "";
            arr2[i] = "";
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < picture[0].length() + 2; j++) {
                arr[i] += "*";
            }
        }
        
        
        for (int i = 1; i < arr.length - 1; i++) {
            arr2[i] = arr[i].replace(arr[i].substring(0, arr[i].length() - 1), "*" + picture[i - 1]);
        }
        arr2[0] = arr[0];
        arr2[arr.length - 1] = arr[arr.length - 1];
        return arr2;
    }

    public static void main(String[] args) {
        No15 no = new No15();

        String[] picture = {"abc",
                "ded"};

        System.out.println(no.addBorder(picture));
    }

}
