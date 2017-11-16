/*
Input: inputArray: [-23, 4, -3, 8, -12]
Output: -24
Expected Output: -12
*/
package codefight.arcade.step2_edgeOfTheOcean;

public class No4 {

    int adjacentElementsProduct(int[] inputArray) {

        int[] arr = new int[inputArray.length - 1];
        int result = 0;
        if (arr.length < 3) {
            return inputArray[0] * inputArray[1];
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = inputArray[i] * inputArray[i + 1];
                if (i == 0)
                    result = arr[i];
                else 
                    result = Math.max(result, arr[i]);
            }
            return result;
        }
    }


    public static void main(String[] args) {
        int[] arr = {-23, 4, -3, 8, -12};
        No4 no = new No4();
        System.out.println(no.adjacentElementsProduct(arr));
    }
}
