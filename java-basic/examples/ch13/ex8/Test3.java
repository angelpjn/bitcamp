package bitcamp.java100.ch13.ex8;

public class Test3 {

    static void m1() { 
        m2();          // m2()에서 Exception으로 던졌으므로 예외 처리 or 던지기가 강제 됨
    }

    static void m2() throws Exception { // Exception으로 던져서 m1이 던지든 처리든 강제함
        m3();          // 상위 호출자에게 예외 떠넘김
    }

    static void m3() { // Runtime이라 던지기 생략
        m4();          // 상위 호출자에게 예외 떠넘김
    }

    static void m4() throws RuntimeException { // Runtime이면 던지기 생략 가능. 그러나 Exception으로 던지면 던지기 강제 됨
        throw new RuntimeException(); // Runtime 예외 발생
    }

    public static void main(String[] args) {
        try {
            m1();           // main에서 처리 안하면 다음은 JVM. JVM은 모든 예외 발생 시 프로그램 종료. 그러므로 메인에서는 처리해야 함
        } catch (Exception e) {
        }
    }
}
