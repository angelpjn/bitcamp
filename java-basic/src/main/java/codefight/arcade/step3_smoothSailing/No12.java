/*
Some people are standing in a row in a park. 
There are trees between them which cannot be moved. 
Your task is to rearrange the people by their heights in a non-descending order without moving the trees.

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

For a = [4, 2, 9, 11, 2, 16] the output should be
sortByHeight(a) = [2, 2, 4, 9, 11, 16].



 */

package codefight.arcade.step3_smoothSailing;

import java.util.Arrays;

public class No12 {

    int[] sortByHeight(int[] a) {

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1)
                count++;
        }

        int[] b = Arrays.copyOf(a, a.length);

        int[] arr = new int[count];

        int countMinus = 0;
        int temp = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] > b[j]) {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
            if (b[i] == -1) {
                countMinus++;
                continue;
            }
        }

        for (int i = 0; i < count; i++) {
            arr[i] = b[i + countMinus];
        }

        countMinus = 0;
        int ii = 0;
        for (int i = 0; i < count; i++) {
            for (int j = i + countMinus + 1; j < a.length; j++) {
                if (a[j] == -1) {
                    countMinus++;
                }
                if (a[j] > -1) {
                    a[j] = arr[i];
                    ii++;
                    System.out.println("cou " + countMinus);
                    System.out.println("ii " + ii);
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(a));
        return a;
    }

    public static void main(String[] args) {
        No12 no = new No12();

        int[] a = { 2, -1, -1, -1, -1, 3, -1, -1, -1, -1, -1, -1, -1, 1 };

        System.out.println(no.sortByHeight(a));
    }

}
