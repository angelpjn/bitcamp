package bitcamp.java100.ch08.ex2;

public class Test2 {

    public static void main(String[] args) {
        
//        클래스명1 변수 = new 클래스명2();
//        변수가 클래스명2 클래스를 카리키다로 독해할 것
        
        Vehicle v;
        v = new Vehicle();
        v = new Boat(); // 사람에게 너는 영장류다 => 가능
        v = new Car(); // 원숭이에게 너는 영장류다 => 가능
        v = new Truck(); // 긴꼬리 원숭이에게 너는 영장류다 => 가능
        v = new Sedan(); // 일본원숭이에게 너는 영장류다 => 가능
        
        Boat b;
//        b = new Vehicle(); => 영장류에게 너는 사람이다. => 불가능
        b = new Boat();
//        b = new Car(); => 원숭이에게 너는 사람이다 => 불가능
//        b = new Truck(); => 긴꼬리 원숭이에게 너는 사람이다 => 불가능
//        b = new Sedan(); => 일본원숭이에게 너는 사람이다 => 불가능

        Car c;
//        c = new Vehicle(); 
//        c = new Boat(); 
        c = new Car();  
        c = new Truck(); 
        c = new Sedan(); 
        
        c.model = "티코";
        c.capacity = 4;
        c.engineType = 1;
        c.cylinder = 4;
        c.valve = 16;
        
//        c.auto = true;
        
        c = new Truck();
        c.model = "타이탄";
        c.capacity  = 3;
        c.engineType = 2;
        c.cylinder = 8;
        c.valve = 32;
        
//        c.weight = 15;
//        c.dump = true;
        
        c = new Sedan();
    }
}
