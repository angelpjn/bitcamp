/*
2진수를 문자열로 : 
0.72와 같이 0과 1 사이의 실수가 double 타입으로 주어졌을 때,
그 값을 2진수 형태로 출력하는 코드를 작성하라.
길이가 32 이하인 문자열로 2진수를 정확하게 표현할 수 없다면 ERROR를 출력하라.
 */

package ch05;

public class No2 {

    public static void main(String[] args) {
        double d1 = 0.372;

        int g = 0b0;
        for (int i = 0; i < 23; i++) {
            d1 *= 2;
            
            if (d1 > 1) {
                d1 = d1 - 1;
                
            }
            
            double d2 = 0;
        }
    }

}
