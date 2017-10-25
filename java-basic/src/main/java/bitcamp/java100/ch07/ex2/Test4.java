package bitcamp.java100.ch07.ex2;

public class Test4 {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        calc.result = 1;
        calc.multiple(5);
        
        // 0으로 나눔
       
        calc.divide(0); // 실행오류 발생하므로 예외 조건 필요 => java.lang.ArithmeticException
        
        calc.multiple(17);
        
        System.out.println(calc.result);
    }
}