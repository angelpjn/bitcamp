/*
[4-12] 구구단의 일부분을 다음과 같이 출력하시오.

[실행결과]
2*1=2 3*1=3 4*1=4
2*2=4 3*2=6 4*2=8
2*3=6 3*3=9 4*3=12

5*1=5 6*1=6 7*1=7
5*2=10 6*2=12 7*2=14
5*3=15 6*3=18 7*3=21

8*1=8 9*1=9
8*2=16 9*2=18
8*3=24 9*3=27

*/

package ch04_BanIf;

public class no12 {

    public static void main(String[] args) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 4; j++) {
                for (int k = 1; k < 4; k++) {
                    int dan = (i * 3 + k + 1);
                    if (dan == 10) {
                        break;
                    }
                    System.out.printf("%d * %d = %d\t", dan, j, dan * j);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
