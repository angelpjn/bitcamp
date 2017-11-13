/*
삽입 : 
두 개의 32비트 수 N과 M이 주어지고, 비트 위치 i와 j가 주어졌을 때,
M을 N에 삽입하는 메서드를 구현하라.
M은 N의 j번째 비트에서 시작하여 i번째 비트에서 끝난다.
j번째 비트에서 i번째 비트까지에는 M을 담기 충분한 공간이 있다고 가정한다. 
다시 말해, M = 10011이라면, j 와 i 사이에 적어도 다섯 비트가 있다고 가정해도 된다는 것이다.
j=3이고, i=2인 경우처럼 M을 삽입할 수 없는 상황은 생기지 않는다고 봐도 된다.

예제
입력 : N = 10000000000, M = 10011, i = 2, j = 6
출력 : n = 10001001100

 */


package ch05;

public class No1 {

    static int compute(int n, int m, int j, int i) {
        int m2 = m << i;
        int n2 = m2 | n;
        return n2;
    }
    
    public static void main(String[] args) {
        int n = 0b100_0000_0000;
        int m = 0b1_0011;
        int i = 2;
        int j = 6;
        
        System.out.println(Integer.toBinaryString(compute(n, m, j, i)));
        
    }

}
