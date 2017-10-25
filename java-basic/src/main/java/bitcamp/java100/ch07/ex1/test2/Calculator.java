package bitcamp.java100.ch07.ex1.test2;

public class Calculator {
    
    int result;
    
    void multiple(int value) {
        this.result *= value;
    }
    
    void divide(int value) {
        this.result /= value;
    }

    void plus(int value) {
        this.result += value;
    }

    void minus(int value) {
        this.result -= value;
    }
    
}
