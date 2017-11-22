/*
For inputArray = [5, 3, 6, 7, 9], the output should be
avoidObstacles(inputArray) = 4.

*/
package codefight.arcade.step5_islandOfKnowledge;

import java.util.Arrays;

public class No22 {
    int avoidObstacles(int[] inputArray) {

        int temp = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] > inputArray[j]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }

        int[] jump = new int[inputArray.length];

        int count = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] - inputArray[i - 1] > 1) {
                count++;
                jump[i] = inputArray[i - 1] + 1;
            }
        }
        System.out.println(count);

        System.out.println(Arrays.toString(inputArray));
        System.out.println(Arrays.toString(jump));

        int result = 0;
        loop: for (int i = 0; i < jump.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (jump[i] == 0 || jump[i] * (j + 1) == inputArray[j])
                    break;
                else if (jump[i] * (j + 1) > inputArray[inputArray.length - 1]) {
                    result = jump[i];
                    break loop;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        No22 no = new No22();

        int[] inputArray = { 1, 4, 10, 6, 2 };

        System.out.println(no.avoidObstacles(inputArray));
    }

}
