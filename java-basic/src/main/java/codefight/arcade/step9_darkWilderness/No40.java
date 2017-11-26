/*
Given a string, output its longest prefix which contains only digits.

Example

For inputString="123aa1", the output should be
longestDigitsPrefix(inputString) = "123".
*/
package codefight.arcade.step9_darkWilderness;

public class No40 {
    String longestDigitsPrefix(String inputString) {
        
        String result = "";
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(0) < '0' || inputString.charAt(0) > '9') {
                result = "";
                break;
            } else if (inputString.charAt(i) < '0' || inputString.charAt(i) > '9') {
                break;
            } else if ('0' <= inputString.charAt(i) && inputString.charAt(i) <= '9') {
                count++;
                result = inputString.substring(0, count);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        No40 no = new No40();
        
        String inputString = "  3) always check for whitespaces";
        
        System.out.println(no.longestDigitsPrefix(inputString));
    }

}
