/*
Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar.

For a = [1, 2, 3] and b = [1, 2, 3], the output should be
areSimilar(a, b) = true.

The arrays are equal, no need to swap any elements.

Input:
a: [1, 2, 3]
b: [1, 2, 3]
Expected Output: true

We can obtain b from a by swapping 2 and 1 in b.

For a = [1, 2, 2] and b = [2, 1, 1], the output should be
areSimilar(a, b) = false.

Input:
a: [1, 2, 3]
b: [2, 1, 3]
Expected Output: true

Input:
a: [1, 2, 2]
b: [2, 1, 1]
Expected Output: false

Input:
a: [1, 1, 4]
b: [1, 2, 3]
Expected Output: false

Input:
a: [832, 998, 148, 570, 533, 561, 894, 147, 455, 279]
b: [832, 570, 148, 998, 533, 561, 455, 147, 894, 279]
Expected Output: false

Input:
a: [4, 6, 3]
b: [3, 4, 6]
Expected Output: false
*/
package codefight.arcade.step4_exploringTheWaters;

import java.util.Arrays;

public class No16 {

    boolean areSimilar(int[] a, int[] b) {

        int count = 0;
        int count2 = 0;
        for (int i = 0; i < b.length; i++) {
            if (a[i] == b[i]) {
                count++;
            }
        }
        if (count > b.length - 2)
            return true;
        if (count < b.length - 2)
            return false;

        if (count == b.length - 2) {
            int[] c = { -1234, -1234 };
            int[] d = { -1234, -1234 };
            for (int i = 0; i < b.length; i++) {
                if (a[i] != b[i] && c[0] == -1234) {
                    c[0] = a[i];
                    d[0] = b[i];
                } else if (a[i] != b[i] && c[1] == -1234) {
                    c[1] = a[i];
                    d[1] = b[i];
                }
            }
            if (c[0] > c[1]) {
                int temp = c[0];
                c[0] = c[1];
                c[1] = temp;
            }
            if (d[0] > d[1]) {
                int temp = d[0];
                d[0] = d[1];
                d[1] = temp;
            }

            for (int i = 0; i < 2; i++) {
                if (c[i] == d[i])
                    count2++;
            }
        }

        if (count2 == 2)
            return true;
        return false;
    }

    public static void main(String[] args) {
        No16 no = new No16();

        int[] a = {1, 2, 3};
        int[] b = {2, 1, 3};

        System.out.println(no.areSimilar(a, b));
    }

}
