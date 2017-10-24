package bitcamp.java100.ch06.ex6.test3;

public class Car {
    
    public final static int TYPE_TRUCK = 1;
    public final static int TYPE_SEDAN = 2;
    public final static int TYPE_BUS = 3;

    public final static int USE_PRIVATE = 1;
    public final static int USE_COMPANY = 2;
    public final static int USE_COMMERCIAL = 3;
    
    static int count;
    
    long no;
    String model;
    int cc;
    int type; // 트럭 = 1, 승용 = 2, 승합 = 3
    int use; // 개인 = 1, 법인 = 2, 영업 = 3
    
    Car(String model, int cc, int type, int use) {
        count++;
        this.model = model;
        this.cc = cc;
        this.type = type;
        this.use = use;
        
        this.no = System.currentTimeMillis(); // 1970년 1월 1일 0시 0분 0초부터 현재까지 경과된 시간을 MilliSecond로 리턴
        
        try {
            Thread.currentThread().sleep(50); // 0.05초 동안 미실행
        } catch (Exception e) {}
    }
}
