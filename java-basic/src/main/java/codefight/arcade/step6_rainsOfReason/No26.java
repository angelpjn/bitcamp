/*
Check if all digits of the given integer are even.

For n = 248622, the output should be
evenDigitsOnly(n) = true;
For n = 642386, the output should be
evenDigitsOnly(n) = false
*/
package codefight.arcade.step6_rainsOfReason;

public class No26 {
    boolean evenDigitsOnly(int n) {
        int count = 0;
        for (int i = n; i > 0; i /= 10) {
            if (i % 2 != 0) {
                count++;
                break;
            }
        }
        if (count == 1)
            return false;
        return true;
    }

    public static void main(String[] args) {
        No26 no = new No26();

        int n = 248622;
        System.out.println(no.evenDigitsOnly(n));
    }

}
