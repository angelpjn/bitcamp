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

        int[] result = new int[votes.length];
        int max = -1;
        for (int i = 0; i < votes.length; i++) {
            result[i] = votes[i] + k;
            max = Math.max(max, votes[i]);
        }
        
        int countMax = 0;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] == max) {
                countMax++;
            }
        }
        
        int count = 0;

        for (int i = 0; i < votes.length; i++) {
            if (result[i] > max) {
                count++;
            }
        }
        if (k == 0 && count > 1) return 0;
        if (k == 0 && count == 0 && countMax == 1) return 1;

        return count;
    }


    public static void main(String[] args) {
        No46 no = new No46();

        int[] votes = {1, 3, 3, 1, 1};
        int k = 0;

        System.out.println(no.electionsWinners(votes, k));
    }

}
