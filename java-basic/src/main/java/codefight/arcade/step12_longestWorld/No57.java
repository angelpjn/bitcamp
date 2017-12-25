/*
six groups of two hexadecimal digits
0 to 9 or A to F
separated by hyphens
01-23-45-67-89-AB
*/
package codefight.arcade.step12_longestWorld;

import java.util.Arrays;

public class No57 {

    String[] fileNaming(String[] names) {
        
        String[] tempNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            tempNames[i] = "";
        }

        tempNames[0] = names[0];
        int count = 0;
        for (int i = 1; i < names.length; i++) {
            count = 0;
            for (int j = 0; j < i; j++) {
//                System.out.println(names[i]);
//                System.out.println(tempNames[j]);
                if (names[i].equals(tempNames[j])) {
                    tempNames[i] = names[i] + "(";
                    count++;
//                    System.out.println("1  " + count);
                } 
                if (tempNames[i].length() != 0 && 
                        tempNames[i].equals(tempNames[j].substring(0, tempNames[i].length()))) {
                    count++;
//                    System.out.println("2  " + count);
                }
            }
            System.out.println(tempNames[i]);
            if (count != 0)
                tempNames[i] = names[i] + "(" + count + ")";
            else
                tempNames[i] = names[i];
        }
        System.out.println(Arrays.toString(tempNames));
        return tempNames;
    }

    public static void main(String[] args) {
        No57 no = new No57();

        String[] names = {"dd", "dd(1)", "dd(2)", "dd", "dd(1)", "dd(1)(2)", "dd(1)(1)", "dd", "dd(1)"};
//        String[] names = {"doc", "doc", "image", "doc(1)", "doc"};

        System.out.println(no.fileNaming(names));
    }

}
