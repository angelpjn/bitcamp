package bitcamp.java100.ch07.ex3.before;

public class CalculatorB {
    
    int value;
    
    void multiple(int value) {
        this.value *= value;
    }

// 원래는 이 코드였는데, Test4.java에서 0으로 나눌 때 시스템이 멈추는 
// 버그가 발견되어 다음과 같이 변경하였다.
// 변경 전 코드
//     void divide(int value) {
//         this.result /= value;
//     }
    
    void divide(int value) {
        if (value == 0) {
            System.err.println("0으로 나누면 안됩니다!");
            return;
        }
        this.value /= value;
    }
    
    void remainder(int value) {
        this.value %= value;
    }
}
