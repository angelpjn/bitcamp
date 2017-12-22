/*
six groups of two hexadecimal digits
0 to 9 or A to F
separated by hyphens
01-23-45-67-89-AB
*/
package codefight.arcade.step12_longestWorld;

import java.util.ArrayList;

public class No52 {

    String longestWord(String text) {
        String str = "";
        
        for (int i = 0; i < text.length(); i++) {
            if (('A' <= text.charAt(i) && text.charAt(i) <= 'Z') ||
                    ('a' <= text.charAt(i) && text.charAt(i) <= 'z')) 
                str += text.charAt(i);
            else
                str += ',';
        }
        System.out.println(str);
        
        String[] arr = str.split(",");

        ArrayList<Integer> countList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) < 'A' || arr[i].charAt(j) > 'z' ||
                        ('Z' < arr[i].charAt(j) && arr[i].charAt(j) < 'a')) 
                    break;
                else
                    count++;
            }
            countList.add(count);
        }
        int max = -1;
        for (int i = 0; i < countList.size(); i++) {
            max = Math.max(max, countList.get(i));
        }

        for (int i = 0; i < countList.size(); i++) {
            if (max == countList.get(i))
                return arr[i];
        }
        return null;
    }

    public static void main(String[] args) {
        No52 no = new No52();

        String text = "A!! AA[]z";

        System.out.println(no.longestWord(text));
    }

}
