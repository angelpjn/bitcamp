/*
six groups of two hexadecimal digits
0 to 9 or A to F
separated by hyphens
01-23-45-67-89-AB
*/
package codefight.arcade.step12_longestWorld;

import java.util.Arrays;

public class No52 {

    int deleteDigit(int n) {
        String no = new StringBuffer(Integer.toString(n)).toString();
        
        String[] nums = new String[no.length()];
        String temp = "";
        for (int i = 0; i < nums.length; i++) {
            if (i > 0)
                temp = no.substring(0, i);
            nums[i] = temp + no.substring(i + 1);
            temp = "";
        }
        
        int max = -1;
        
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, Integer.parseInt(nums[i]));
        }
            
        return max;
    }


    public static void main(String[] args) {
        No52 no = new No52();

        int n = 1110110;

        System.out.println(no.deleteDigit(n));
    }

}


















