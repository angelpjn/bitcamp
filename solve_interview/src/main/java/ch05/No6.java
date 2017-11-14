/*
변환 : 
정수 A와 B를 2진수로 표현했을 때, A를 B로 바꾸기 위해 뒤집어야 하는 비트의 개수를 구하는 함수를 작성하라.

*/
package ch05;

public class No6 {

    public static void main(String[] args) {
        
        int a = 29;
        int b = 15;
        
        int count = 0;
        
        for (int c = a ^ b; c != 0; c = c >> 1) {
            count += c & 1;
        }
        
        System.out.println(count);
    }
    
}
