package codefight;

import java.util.ArrayList;

public class Test {

    int kthDivisor(int n, int k) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int i = 1;
        while (i <= n) {
          if (n % i == 0) {
            divisors.add(i);
          }
          i++;
        }
//        if (i * i > n) {
//          i--;
//        }
//        while (i > 0) {
//          if (n % i == 0) {
//            divisors.add(n / i);
//          }
//          i++;
//        }
        System.out.println(divisors.size());
        if (divisors.size() < k) {
          return -1;
        }
        return divisors.get(k - 1);
      }
    
    public static void main(String[] args) {
        Test test = new Test();
        
        int n = 63;
        int k = 4;
        
        System.out.println(test.kthDivisor(n, k));
    }
}
