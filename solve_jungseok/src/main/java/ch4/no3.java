/*
[4-3]
1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
*/

package ch4;

public class no3 {
    public static void main(String[] args) {
        int sum1 = 0;
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                sum1 += j;
            }
            System.out.println(sum1);
        }
    }
}
