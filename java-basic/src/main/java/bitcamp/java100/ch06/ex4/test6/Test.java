package bitcamp.java100.ch06.ex4.test6;

public class Test {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Calculator calculator2 = new Calculator();
        
        Calculator.plus(calculator, 2);
        Calculator.plus(calculator, 5);
        Calculator.multiple(calculator, 3);
        Calculator.minus(calculator, 7);
        Calculator.devide(calculator, 2);
        
        System.out.println(calculator.result);
        
        Calculator.plus(calculator2, 3);
        Calculator.multiple(calculator2, 6);
        Calculator.minus(calculator2, 5);
        Calculator.plus(calculator2, 11);
        Calculator.devide(calculator2, 2);
        
        System.out.println(calculator2.result);
    }
}
