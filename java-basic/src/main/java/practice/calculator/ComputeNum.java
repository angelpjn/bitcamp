package practice.calculator;

public class ComputeNum {

    static int result;
    
    void plus(int value) {
        result += value;
    }
    
    void minus(int value) {
        result -= value;
    }
    
    void multiple(int value) {
        result *= value;
    }
    
    void devide(int value) {
        result /= value;
    }
    
    boolean confirm(String message) {
        if (message.equals("y")) {
            return true;
        }
        return false;
    }
}
