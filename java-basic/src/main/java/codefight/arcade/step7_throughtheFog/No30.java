/*
Consider integer numbers from 0 to n - 1 written down 
along the circle in such a way that
the distance between 
any two neighbouring numbers is equal 
(note that 0 and n - 1 are neighbouring, too).

Given n and firstNumber, 
find the number which is written in the radially opposite position to firstNumber.

For n = 10 and firstNumber = 2, the output should be
circleOfNumbers(n, firstNumber) = 7.

4 ≤ n ≤ 20.
0 ≤ firstNumber ≤ n - 1.
*/
package codefight.arcade.step7_throughtheFog;

public class No30 {
    int circleOfNumbers(int n, int firstNumber) {
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        if (firstNumber + arr.length / 2 >= arr.length)
            return arr[firstNumber - arr.length / 2];
        else 
            return arr[firstNumber + arr.length / 2];
    }

    public static void main(String[] args) {
        No30 no = new No30();
        
        int n = 10;
        int firstNumber = 7;
        
        System.out.println(no.circleOfNumbers(n, firstNumber));
    }

}
