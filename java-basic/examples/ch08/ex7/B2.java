package bitcamp.java100.ch08.ex7;

public class B2 extends B {

//    void m1(int a, String s) {}
//    protected void m1(int a, String s) {}
//    public void m1(int a, String s) {}
//    void m1(int x, String y) {} => 파라명 다른 것은 상관 없음
    
//    int m1(int a, String s) {} => 리턴 타입 불일치

    void m1_1(int a, String s) {} // 새 메서드 추가한 것. 오버라이딩 아님. 오버로딩 아님.
    void m1(String a, String s) {} // 새 메서드 추가한 것. 오버로딩
    void m1(String s, int a) {} // 새 메서드 추가한 것. 오버로딩
    void m1(int a) {} // 새 메서드 추가한 것. 오버로딩
}
