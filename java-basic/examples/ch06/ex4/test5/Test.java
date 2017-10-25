package bitcamp.java100.ch06.ex4.test5;

public class Test {

    public static void main(String[] args) {

        Calculator.plus(2);
        Calculator.plus(5);
        Calculator.multiple(3);
        Calculator.minus(7);
        Calculator.devide(2);
        
        System.out.println(Calculator.result);
        
        Calculator.result = 0;
        Calculator.plus(3);
        Calculator.multiple(6);
        Calculator.minus(5);
        Calculator.plus(11);
        Calculator.devide(2);
        
        System.out.println(Calculator.result);
    }
}
