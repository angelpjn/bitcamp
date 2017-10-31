package bitcamp.java100.ch08.ex7;

public class C4 extends C3 {

    @Override
    void m1() {
        System.out.println("C4.m1()");
    }
    
    @Override
    void m2() {
        System.out.println("C4.m2()");
    }

    void test1() {
        this.m1();
        super.m1(); // 바로 위는 super.m1(); 그러나 두개 위 이상의 조상의 메서드를 super로 바로 호출할 수 있는 방법은 없다.

        this.m2();
        super.m2();
        
        this.m3();
        super.m3();
        
        this.m4();
        super.m4();
    }
    
    public static void main(String[] args) {
        C4 obj = new C4();
        obj.test1();
    }
}
