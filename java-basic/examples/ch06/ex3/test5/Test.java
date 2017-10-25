package bitcamp.java100.ch06.ex3.test5;

public class Test {

        static int v1 = 100;
        static void m1() {
            System.out.println("m1()");
        }
        
        int v2 = 200;
        void m2() {
            System.out.println("m2()");
        }
        
        public static void main(String[] args) {
            
//            static 멤버는  다른 static 멤버 바로 접근 가능
            System.out.println(v1);
            m1();
            
//            System.out.println(v2); // 컴파일 오류! => 인스턴스 변수는 인스턴스 주소를 통해서만 접근 가능
//            m2(); // 컴파일 오류! => 인스턴스 메서드는 인스턴스 주소를 통해서만 접근 가능
            
//            static 멤버에서 인스턴스 멤버 사용 시 => 인스턴스 만들 것!
            Test obj1 = new Test();
            obj1.v2 = 300;
            obj1.m2();
    }
}
