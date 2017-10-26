package bitcamp.java100.ch08.ex2;

public class Test1 {

    public static void main(String[] args) {
        Class c1 = Test1.class;
        System.out.println(c1);
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

        Sedan s;
//        s = new Vehicle(); 
//        s = new Boat(); 
//        s = new Car();  
//        s = new Truck(); 
        s = new Sedan(); 
        
//      현재 분류 상 Sedan이 최 하위 분류이므로 Sedan 타입으로 선언한 레퍼런스 변수 s는 다형적 변수로 쓰이지는 않았지만
//      언제든 Sedan 분류 하위 분류를 생성할 수 있으므로 "다형적 변수"로 사용 가능하다고 할 수 있다.
//      그러므로 굳이 동일 클래스 상의 타입으로 선언된 레퍼런스 변수라고 할지라도 "다형적 변수"가 아니라고 표현하지는 않는다.
      
      // Sedan 클래스의 obj, ve, car 등이 다형적 변수로 사용됨. sed는 다형적 변수로 사용될 가능성이 있음
      Object obj = new Sedan();
      Vehicle ve = new Sedan();
      Car car = new Sedan();
      Sedan sed = new Sedan();
//      Truck tr = new Sedan();
    }
}
