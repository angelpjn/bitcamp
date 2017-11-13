/*
6.9 100라커 : 복도에 100개의 라커가 있다. 어떤 남자가 100개의 라커 문을 전부 연다. 그러고 나서 짝수 번호의 라커를
전부 닫는다. 그 다음에는 번호가 3의 배수인 라커를 순서대로 찾아다니며 열려 있으면 닫고, 닫혀 있으면 연다.
이런 식으로 복도를 100번 지나가면(마지막에는 100번째 라커의 문을 열거나 닫을 것이다) 열린 라커문은 몇 개가 되겠는가?
*/

package ch06;

public class No9 {

    public static void main(String[] args) {

        int oddNumber = 0;
        for (int i = 1; i <= 100; i++) {
            int aliquot = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) aliquot++;
            }
            if (aliquot % 2 != 0) {
                System.out.println(i + "는 홀수");
                oddNumber++;
            }
        }
        System.out.println("홀수의 개수는 " + oddNumber);
    }
}
