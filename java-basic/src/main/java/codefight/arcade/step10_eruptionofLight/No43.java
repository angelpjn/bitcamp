/*
A string is said to be beautiful if b occurs in it no more times than a; c occurs in it no more times than b; etc.

Given a string, check whether it is beautiful.

Example

For inputString = "bbbaacdafe", the output should be
isBeautifulString(inputString) = true;
For inputString = "aabbb", the output should be
isBeautifulString(inputString) = false;
For inputString = "bbc", the output should be
isBeautifulString(inputString) = false.
*/
package codefight.arcade.step10_eruptionofLight;

public class No43 {
    boolean isBeautifulString(String inputString) {

        int[] arr = new int[26];
        for (int i = 0; i < inputString.length(); i++) {
            arr[inputString.charAt(i) - 'a']++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        No43 no = new No43();
        
        String inputString = "bbbaacdafe";
        
        System.out.println(no.isBeautifulString(inputString));
    }

}
