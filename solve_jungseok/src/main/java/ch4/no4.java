/*
[4-4]
1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.

*/

package ch4;

public class no4 {

    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        
        int i = 1;
        while (true) {
            if (sum1 + sum2 >= 100) {
                break;
            } else if (i % 2 == 0) {
                sum2 += (- 1) * i;
                i++;
            } else if (i % 2 != 0) {
                sum1 += i;
                i++;
            } else {}
        }
        System.out.println(i);
        if (i % 2 != 0) {
            int last = i;
            System.out.println(last);
        } else if (i % 2 == 0) {
            int last = (- 1) * i;
            System.out.println(last);
        } else {}
    }
}
