package ch08.practiceCode;

public class PracticeCode02 {

    static int fibonacci(int n) {
        int[] arr = new int[n + 1];
        return fibonacci(n, arr);
    }
    
    static int fibonacci(int i, int[] memo) {
        if (i == 0 || i == 1)
            return i;
        if (memo[i] == 0) {
            memo[i] = fibonacci(i - 1, memo) + fibonacci(i - 2, memo);
        }
        return memo[i];
    }
    
    public static void main(String[] args) {
        System.out.println(fibonacci(5)); 
    }
}
