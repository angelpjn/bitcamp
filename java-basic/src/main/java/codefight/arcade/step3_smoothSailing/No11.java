/*
Ticket numbers usually consist of an even number of digits. 
A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.
 */

package codefight.arcade.step3_smoothSailing;

import java.util.Arrays;

public class No11 {
    
    boolean isLucky(int n) {
        String digit = Integer.toString(n);
        String frontDigit = digit.substring(0, digit.length() / 2);
        String backDigit = digit.substring(digit.length() / 2);

        int[] front = new int[frontDigit.length()];
        int[] back = new int[backDigit.length()];
        
        for (int i = 0; i < digit.length() / 2; i++) {
            front[i] = Integer.parseInt(frontDigit.substring(i, i + 1));
            back[i] = Integer.parseInt(backDigit.substring(i, i + 1));
        }
        
        int sum = 0;
        for (int i = 0; i < digit.length() / 2; i++) {
            sum += front[i] - back[i];
        }
        
        if (sum == 0)
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        No11 no = new No11();
        
        int n = 1230;
        
        System.out.println(no.isLucky(n));
    }

}
