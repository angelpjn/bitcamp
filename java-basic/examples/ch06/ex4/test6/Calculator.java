package bitcamp.java100.ch06.ex4.test6;

public class Calculator {
    
    int result;
    
    static void plus(Calculator that, int value) {
        that.result += value;
    }
    
    static void minus(Calculator that, int value) {
        that.result -= value;
    }
    
    static void multiple(Calculator that, int value) {
        that.result *= value;
    }
    
    static void devide(Calculator that, int value) {
        that.result /= value;
    }
}
