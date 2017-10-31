package bitcamp.java100.ch07.ex5;

public class E extends A {
    String name;
    int age;

    E() {
        super();
        this.name = "홍길동";
        this.age = 20;
    }
    
    E(int age) {
//        super();
        this("홍길동", age); // => super()나 this() 둘 중 하나만 호출 가능
//        this.name = "홍길동";
//        this.age = age;
    }
    
    E(String name) {
//        super();
        this(name, 20); // => super()나 this() 둘 중 하나만 호출 가능
        
        this.name = name;
    }
    
    E(String name, int age) {
        super(); // 다른 생성자가 this()로 호출한 최 상단의 생성자는 무조건 super() 생성자 호출해야함.
//        this(name); => 딴 생성자가 여기를 호출하는데 여기서도 그 생성자를 호출하면 순환 호출로 컴파일 오류
//        this(); // => 그래서 얘는 가능하다.
        this.name = name;
        this.age = age;
    }
}
