/*
Given a string, 
find the shortest possible string 
which can be achieved 
by adding characters to the end of initial string to make it a palindrome.

Example

For st = "abcdc", the output should be
buildPalindrome(st) = "abcdcba".
*/
package codefight.arcade.step10_eruptionofLight;

public class No46 {

    int electionsWinners(int[] votes, int k) {

        int center = st.length() / 2;
        String strEven = checkEven(st, center);
        String strOdd = checkOdd(st, center);
        if (strEven.length() > strOdd.length())
            return strOdd;
        return strEven;
    }

    public static void main(String[] args) {
        No46 no = new No46();

        // String st = "abcdc";
        String st = "abcdefgfhihghih";

        System.out.println(no.buildPalindrome(st));
    }

}
