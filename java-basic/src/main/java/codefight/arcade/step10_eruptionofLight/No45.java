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

public class No45 {
    String buildPalindrome(String st) {
        if (st.equals(new StringBuffer(st).reverse().toString()))
            return st;
        
        String result = "";
        for (int i = 0; i < st.length(); i++) {
            StringBuffer buf = new StringBuffer(st.substring(0, i + 1)).reverse();
            result = st + buf.toString();
            if (result.substring(0, result.length() / 2)
                    .equals(new StringBuffer(result).reverse().toString().substring(0, result.length() / 2)))
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        No45 no = new No45();
        
        String st = "abcdc";
        
        System.out.println(no.buildPalindrome(st));
    }

}
