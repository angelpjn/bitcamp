package bitcamp.java100.ch06.ex4.test3;

public class Test {

    static int result;
    
    static void plus(int value) {
        result += value;
    }
    
    static void minus(int value) {
        result -= value;
    }
    
    static void multiple(int value) {
        result *= value;
    }
    
    static void devide(int value) {
        result /= value;
    }
    
    public static void main(String[] args) {

        plus(2);
        plus(5);
        multiple(3);
        minus(7);
        devide(2);
        
        System.out.println(result);
    }
}
