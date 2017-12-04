/*

*/
package codefight.interview.sorting;

import java.util.Arrays;

public class No2_Merge {

    void merge(int[] sequence, int left, int middle, int right) {
        int[] result = new int[right - left];
        int i, j;
        int k = 0;

        for (i = left, j = middle; i < middle && j < right; ) {
          if (sequence[i] < sequence[j]) {
            result[k++] = sequence[i];
            i++;
          }
          else {
            result[k++] = sequence[j];
            j++;
          }
        }

        while (i < middle) {
          result[k++] = sequence[i];
          i++;
        }

        while (j < right) {
          result[k++] = sequence[j];
          j++;
        }

        for (i = left; i < right; i++) {
          sequence[i] = result[i - left];
        }
      }

      void split(int[] sequence, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            split(sequence, left, middle);
            split(sequence, middle + 1, right);
            merge(sequence, left, right, middle);
            System.out.println(Arrays.toString(sequence));
        }
      }

      int[] mergeSort(int[] sequence) {
        split(sequence, 0, sequence.length);

//        System.out.println(Arrays.toString(sequence));
        return sequence;
      }
    
    public static void main(String[] args) {
        No2_Merge no = new No2_Merge();
        int[] sequence = {3, 6, 1, 5, 3, 6};
        
        System.out.println(no.mergeSort(sequence));
    }
    
}
