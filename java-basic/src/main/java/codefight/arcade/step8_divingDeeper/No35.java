/*
Find the leftmost digit that occurs in a given string.

For inputString = "var_1__Int", the output should be
firstDigit(inputString) = '1';
For inputString = "q2q-q", the output should be
firstDigit(inputString) = '2';
For inputString = "0ss", the output should be
firstDigit(inputString) = '0'.
Input/Output

[time limit] 3000ms (java)
[input] string inputString

A string containing at least one digit.

Guaranteed constraints:
3 ≤ inputString.length ≤ 10.
*/
package codefight.arcade.step8_divingDeeper;

public class No35 {
    char firstDigit(String inputString) {
        char ch = ' ';
        for (int i = 0; i < inputString.length(); i++) {
            if ('0' <= inputString.charAt(i) && inputString.charAt(i) <= '9') {
                ch = inputString.charAt(i);
                break;
            }
            else 
                continue;
        }
        
        return ch;
    }

    public static void main(String[] args) {
        No35 no = new No35();

        String inputString = "var_2__I1nt";

        System.out.println(no.firstDigit(inputString));
    }

}
