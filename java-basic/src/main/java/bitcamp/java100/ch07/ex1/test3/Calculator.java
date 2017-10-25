package bitcamp.java100.ch07.ex1.test3;

public class Calculator {
    
    int result;
    
    void multiple(int value) {
        this.result *= value;
    }
    
    void divide(int value) {
        this.result /= value;
    }

    void remainder(int value) {
        this.result %= value;
    }
    
}
