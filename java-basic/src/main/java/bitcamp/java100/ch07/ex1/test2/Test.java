package bitcamp.java100.ch07.ex1.test2;

public class Test {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.plus(10);
        calc.plus(20);
        calc.minus(7);
        calc.multiple(2);
        calc.divide(3);
        
        System.out.println(calc.result);
        
    }
}
