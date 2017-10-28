/*
[4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1)
에 알맞은 코드를 넣으시오.
[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
[실행결과]
15
*/

package ch04_BanIf;

public class no10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        int i = 0;
        while (i < 5) {
            sum += num % 10;
            num /= 10;
            i++;
        }
        System.out.println("sum="+sum);
    }
}

/*
[문자열 사용]
String str = Integer.toString(num);
int[] arr = new int[5];
for (int i = 0; i < 5; i++) {
    arr[i] = (int) str.charAt(i) - '0';
}

for (int i = 0; i < 5; i++) {
    sum += arr[i];
}
*/