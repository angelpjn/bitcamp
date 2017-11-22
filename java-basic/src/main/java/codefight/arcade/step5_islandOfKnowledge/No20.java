/*
Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.


*/
package codefight.arcade.step5_islandOfKnowledge;

public class No20 {

    int arrayMaximalAdjacentDifference(int[] inputArray) {

        int maxAbs = 0;
        
        for (int i = 1; i < inputArray.length; i++) {
            maxAbs = Math.max(maxAbs, Math.abs(inputArray[i - 1] - inputArray[i]));
        }
//        System.out.println(maxAbs);
        return maxAbs;
    }

    public static void main(String[] args) {
        No20 no = new No20();

        int[] inputArray = {2, 4, 1, 0};
        
        System.out.println(no.arrayMaximalAdjacentDifference(inputArray));
    }

}
