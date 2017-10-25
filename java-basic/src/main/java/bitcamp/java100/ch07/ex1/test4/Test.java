package bitcamp.java100.ch07.ex1.test4;

public class Test {

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
