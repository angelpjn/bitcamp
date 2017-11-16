/*
For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.

회문 체크


*/
package codefight.arcade.step1_journeyBegins;

public class No3 {

    boolean checkPalindrome(String inputString) {

        int len = inputString.length() / 2;
        int count = 0;

        int end = inputString.length() - 1;

        for (int i = 0; i < len; i++) {
            if (inputString.charAt(i) == inputString.charAt(end - i)) {
                count++;
            }
        }
        if (count == len)
            return true;
        return false;
    }

    public static void main(String[] args) {
        No3 no = new No3();
        System.out.println(no.checkPalindrome("abac"));
    }
}
