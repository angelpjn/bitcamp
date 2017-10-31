/* 
[5-7] 문제 5-6에 동전의 개수를 추가한 프로그램이다. 

커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다. 
보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름돈이 부족합니다.’라고 출력하고 종료한다. 
지불할 돈이 충분히 있으면, 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다.
(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.

C:\jdk1.8\work\ch5>java Exercise5_7
USAGE: java Exercise5_7 3120
C:\jdk1.8\work\ch5>java Exercise5_7 3170
money=3170
500원: 5
100원: 5
50원: 3
10원: 2
=남은 동전의 개수 =
500원:0
100원:0
50원:2
10원:3
C:\jdk1.8\work\ch5>java Exercise5_7 3510
money=3510
500원: 5
100원: 5
50원: 5
10원: 5
거스름돈이 부족합니다.

(1) 아래의 로직에 맞게 코드를 작성하시오.
1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
2. 배열 coin에서 coinNum만큼의 동전을 뺀다. (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.) 
3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.

*/

package ch05_Array;

import java.util.Scanner;

class no7 {
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("금액을 입력하세요 : ");
        int money = scan.nextInt();
        System.out.println("money=" + money);
        int[] coinUnit = { 500, 100, 50, 10 }; // 동전의 단위
        int[] coin = { 5, 5, 5, 5 }; // 단위별 동전의 개수
        for (int i = 0; i < coinUnit.length; i++) {
            int coinNum = money / coinUnit[i];
            if (coinNum >= coin[i]) {
                coinNum = coin[i];
            } else {
                coinNum = money / coinUnit[i];
            }
            System.out.println(coinUnit[i] + "원: " + coinNum);
            money -= coinNum * coinUnit[i];
            if (coinNum == 5) {
                coin[i] = 0;
            } else {
                coin[i] -= coinNum;
            }
        }
        if (money > 0) {
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0);
        }
        System.out.println("=남은 동전의 개수 =");
        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원:" + coin[i]);
        }
    }
}