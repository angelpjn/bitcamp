/*
Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.

Given an integer, find its digit degree.

Example

For n = 5, the output should be
digitDegree(n) = 0;
For n = 100, the output should be
digitDegree(n) = 1.
1 + 0 + 0 = 1.
For n = 91, the output should be
digitDegree(n) = 2.
9 + 1 = 10 -> 1 + 0 = 1.
*/
package codefight.arcade.step9_darkWilderness;

public class No41 {
    int digitDegree(int n) {
        int sum = n;
        int count = 0;

        while (true) {
            if (sum >= 10) {
                StringBuffer buf = new StringBuffer(Integer.toString(sum));
                sum = 0;
                for (int i = 0; i < buf.length(); i++) {
                    sum += buf.charAt(i) - '0';
                }
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        No41 no = new No41();
        
        int n = 99;
        
        System.out.println(no.digitDegree(n));
    }

}
