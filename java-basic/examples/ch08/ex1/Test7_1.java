package bitcamp.java100.ch08.ex1;

// Gym 회원 추상화
class Member {
    String name;
    int age;
    float weight;
    float height;
}

public class Test7_1 {

    public static void main(String[] args) {
        Member m = new Member();
        m.name = "홍길동";
        m.age = 20;
        
        // 추상화가 무너진 코드 => 왜곡된 정보
        m.weight = 900.70f;
        m.height = 16.0f;
    }

}
