package bitcamp.java100.ch06.ex6.test1;

public class Car {
    
    static int count;
    
    long no;
    String model;
    int cc;
    
    Car(String model, int cc) {
        count++;
        this.model = model;
        this.cc = cc;
        this.no = System.currentTimeMillis(); // 1970년 1월 1일 0시 0분 0초부터 현재까지 경과된 시간을 MilliSecond로 리턴
        
        try {
            Thread.currentThread().sleep(50); // 0.05초 동안 미실행
        } catch (Exception e) {}
    }
}
