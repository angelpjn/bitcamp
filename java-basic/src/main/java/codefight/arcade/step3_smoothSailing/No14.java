/*
Several people are standing in a row and need to be divided into two teams.
The first person goes into team 1, the second goes into team 2,
the third goes into team 1 again, the fourth into team 2, and so on.

You are given an array of positive integers 
- the weights of the people. Return an array of two integers, 
where the first element is the total weight of team 1, 
and the second element is the total weight of team 2 after the division is complete.

For a = [50, 60, 60, 45, 70], the output should be
alternatingSums(a) = [180, 105].
*/
package codefight.arcade.step3_smoothSailing;

import java.util.Arrays;

public class No14 {

    int[] alternatingSums(int[] a) {

        int arr[] = new int[2];
        
        for (int i = 0; i < a.length; i++) {
            if ((i + 1) % 2 ==0)
                arr[1] += a[i];
            else
                arr[0] += a[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        No14 no = new No14();

        int[] a = {50, 60, 60, 45, 70};
        
        System.out.println(no.alternatingSums(a));
    }

}
