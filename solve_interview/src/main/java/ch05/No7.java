/*
쌍끼리 맞바꾸기 : 
명령어를 가능한 한 적게 사용해서 주어진 정수의 짝수 번째 비트의 값과
홀수 번째 비트의 값을 바꾸는 프로그램을 작성하라.

(예: 0번째 비트와 1번째 비트를 바꾸고, 2번째 비트와 3번째 비트를 바꾸는 식으로).

*/
package ch05;

public class No7 {
    
    public static void main(String[] args) {
        int a = 10;
        int b = a >> 2;
        int c = b << 2;
        int d = a ^ c;
        int e = ~d & 0x000000ff;
        int f = c | e;
        
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(d));
        System.out.println(Integer.toBinaryString(e));
        System.out.println(Integer.toBinaryString(f));
        System.out.println();
    }

}
