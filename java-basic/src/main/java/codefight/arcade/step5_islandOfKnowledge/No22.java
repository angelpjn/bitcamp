/*
For inputArray = [5, 3, 6, 7, 9], the output should be
avoidObstacles(inputArray) = 4.

*/
package codefight.arcade.step5_islandOfKnowledge;

public class No22 {
    int avoidObstacles(int[] inputArray) {
        int temp = 0;
        int result = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] > inputArray[j]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        
        int count = 2;
        for (int i = 0; i < inputArray.length; i++) {
            count++;
        }
        
        if (count == inputArray[inputArray.length - 1] + 1)
            return count;
        
        end: for (int i = 2; i < inputArray[inputArray.length - 1] + 1; i++) {
            loop: for (int j = 1; j < inputArray[inputArray.length - 1] * 2 + 1; j++) {
                for (int k = 0; k < inputArray.length; k++) {
                    if (i * j == inputArray[k]) {
                        System.out.println(j);
                        break loop;
                    } else if (i * j > inputArray[inputArray.length - 1] + 1) {
                        result = i;
                        break end;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        No22 no = new No22();

        int[] inputArray = { 2, 3 };

        System.out.println(no.avoidObstacles(inputArray));
    }

}
