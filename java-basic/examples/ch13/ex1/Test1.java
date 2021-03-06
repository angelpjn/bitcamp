package bitcamp.java100.ch13.ex1;

import java.io.Console;

public class Test1 {

    public static void main(String[] args) {
        Console console = System.console(); // System.console()의 리턴 값이 null
        
        int a = Integer.parseInt(console.readLine("a? ")); // 그러므로 readLine() 메서드 호출 불가
        String op = console.readLine("연산자? ");
        int b = Integer.parseInt(console.readLine("b? "));

        switch (op) {
        case "+": System.out.printf("결과=%d\n", a + b); break;
        case "-": System.out.printf("결과=%d\n", a - b); break;
        case "*": System.out.printf("결과=%d\n", a * b); break;
        case "/": System.out.printf("결과=%d\n", a / b); break;
        case "%": System.out.printf("결과=%d\n", a % b); break;
        default: System.out.println("지원하지 않는 연산자입니다.");
        
        }
        
    }

}
