package bitcamp.java100.ch07.ex1.test3;

public class Test {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        calc.result = 1;
        calc.multiple(10);
        calc.multiple(17);
        calc.divide(3);
        calc.remainder(5);
        
        System.out.println(calc.result);
        
    }
}