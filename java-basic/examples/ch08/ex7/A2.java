package bitcamp.java100.ch08.ex7;

public class A2 extends A {

    public void test1() {
        m4();
        m3();
        m2();
//      m1(); => 사용 불가 A클래스의 private 멤버 메소드
    }
    
    private void m1() { // 그러므로 A2클래스의 m1() 메서드는 A2클래스 자체의 m1()메서드이지 상속받은 A클래스의 m1()메서드가 아님
        System.out.println("B.m1()");
    }
    
    void m2() {}
    
    protected void m3() {}
    
    public void m4() {}
}
