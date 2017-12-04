/*
마지막 히든 열어서 확인
Given an array of equal-length strings,
check if it is possible to rearrange 
the strings in such a way that
after the rearrangement the strings 
at consecutive positions would differ by exactly one character.

For inputArray = ["aba", "bbb", "bab"], the output should be
stringsRearrangement(inputArray) = false;

Example

For a = [2, 4, 7], the output should be
absoluteValuesSumMinimization(a) = 4.
*/
package codefight.arcade.step7_throughtheFog;

import java.util.ArrayList;
import java.util.List;

public class No33_2 {
    boolean stringsRearrangement(String[] inputArray) {
        List<String> arr = new ArrayList<String>();
        for (String s: inputArray) {
            arr.add(s);
        }
        premutations(new ArrayList<String>(), arr);
        boolean ans = false;
        for (ArrayList<String> current: premutations) {
            if(check(current)) ans = true;
        }
        
        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
        }
        return ans;
    }

    boolean check(ArrayList<String> ar) {
        for (int i = 1; i < ar.size(); i++) {
            int diffCount = count(ar.get(i-1), ar.get(i));
            if (diffCount != 1) return false;
//            System.out.println(ar.get(i));
        }
        return true;
    }

    int count(String s1, String s2) {
        int count = 0;
        for(int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) count++;
//            System.out.println(s1.charAt(i));
//            System.out.println(s2.charAt(i));
        }
        return count;
    }

    ArrayList<ArrayList<String>> premutations = new ArrayList<ArrayList<String>>();
                                    
    void premutations (ArrayList<String> current, List<String> notUsed) {
        if (notUsed.size() == 0) {
            premutations.add(new ArrayList<String>(current));
            return;
        }
        for (String s: notUsed) {
            ArrayList<String> newCurr = new ArrayList<>(current);
            List<String> newNotUsed = new ArrayList<String>(notUsed);
            newCurr.add(s);
            newNotUsed.remove(s);
            premutations(newCurr, newNotUsed);
        }
    }

    public static void main(String[] args) {
        No33_2 no = new No33_2();
        
        String[] inputArray = {"abc", 
                "xbc", 
                "xxc", 
                "xbc", 
                "aby", 
                "ayy", 
                "aby", 
                "azc"};
        
        System.out.println(no.stringsRearrangement(inputArray));
    }

}
