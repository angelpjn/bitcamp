/*
Given a string, find out if its characters can be rearranged to form a palindrome.

inputString: "aabb"
Expected Output: true

inputString: "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"
Expected Output: false

inputString: "abbcabb"
Expected Output: true


inputString: "zyyzzzzz"
Expected Output: true

inputString: "z"
Expected Output: true


inputString: "zaa"
Expected Output: true

inputString: "abca"
Expected Output: false
*/
package codefight.arcade.step4_exploringTheWaters;

public class No18 {

    boolean palindromeRearranging(String inputString) {
        
        int[] al = new int[26];
        
        for (int i = 0; i < inputString.length(); i++) {
            al[inputString.charAt(i) - 'a']++;
        }
//        System.out.println(Arrays.toString(al));
        int odd = 0;
        int even = 0;
        for (int i = 0; i < al.length; i++) {
            if (al[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        
        if (odd > 1)
            return false;
        return true;
    }


    public static void main(String[] args) {
        No18 no = new No18();

        String inputString = "zyyzzzzz";

        System.out.println(no.palindromeRearranging(inputString));
    }

}
