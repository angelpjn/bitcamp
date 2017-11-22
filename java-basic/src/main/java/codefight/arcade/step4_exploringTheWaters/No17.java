/*
You are given an array of integers. 
On each move you are allowed to increase exactly one of its element by one. 
Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

Example

For inputArray = [1, 1, 1], the output should be
arrayChange(inputArray) = 3.

Input:
inputArray: [-1000, 0, -2, 0]
Expected Output: 5

Input:
inputArray: [2, 1, 10, 1]
Expected Output: 12

Input:
inputArray: [2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15]
Expected Output: 13
*/
package codefight.arcade.step4_exploringTheWaters;

public class No17 {

    int arrayChange(int[] inputArray) {

        int sum = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] >= inputArray[i + 1]) {
                sum += inputArray[i] - inputArray[i + 1] + 1;
                inputArray[i + 1] = inputArray[i] + 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        No17 no = new No17();

        int[] a = {2, 1, 10, 1};

        System.out.println(no.arrayChange(a));
    }

}
