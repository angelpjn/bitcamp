package bitcamp.java100.ch08.ex2;

public class Test4 {

    public static void main(String[] args) {
        
        Car c = new Car();
        c.model = "티코";
        c.capacity = 4;
        c.engineType = 1;
        c.cylinder = 4;
        c.valve = 16;
        
        Sedan c2 = (Sedan)c; // 컴파일러를 속인 것. c는 Car 객체를 가리키고 Car 객체에는 auto와 sunroof가 없으므로 c2.auto와 c2.sunroof는 null
        c2.auto = true;
        c2.sunroof = false;
        
        System.out.printf("%s, %d, %d, %d, %d, %b, %b\n",
                c2.model,
                c2.capacity,
                c2.engineType,
                c2.cylinder,
                c2.valve,
                c2.auto,
                c2.sunroof);
    }
}
