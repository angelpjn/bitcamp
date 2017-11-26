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

public class No36 {
    int differentSymbolsNaive(String s) {
        char[] ch = s.toCharArray();

        char temp = ' ';
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        
        int count = 1;
        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] != ch[i])
                count++;
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        No36 no = new No36();

        String s = "cabca";

        System.out.println(no.differentSymbolsNaive(s));
    }

}
