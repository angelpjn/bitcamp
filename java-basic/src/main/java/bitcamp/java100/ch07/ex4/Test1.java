package bitcamp.java100.ch07.ex4;

public class Test1 extends Object {
//  모든 클래스를 java.lang.Object 클래스를 상속한다. 단, 상속하는 클래스가 없을 때만.
//  Class 내장변수 class
//  · 모든 클래스에는 그 클래스의 정보가 담겨있는 인스턴스의 주소를 가지고 있음
//  · static Class class = new Class(); 
//    => class가 가리키는 인스턴스에는 클래스 정보가 담겨 있음
    
    public static void main(String[] args) {

        Test1 obj = new Test1();
        if (obj instanceof Test1) {
            System.out.println("obj는 Test1의 인스턴스이다.");
        }

        if (obj instanceof Object) {
            System.out.println("obj는 Object의 인스턴스이다.");
        }
        
        Class c = Test1.class; // Test1클래스의 내장변수 class => Test1 클래스의 정보를 담은 인스턴스 주소(레퍼런스)가 저장되어 있음
        
        Class sc = c.getSuperclass(); // Test1의 수퍼 클래스 정보를 담은 인스턴스 주소(레퍼런스)가 저장되어 있음
        System.out.println(sc.getName()); // 그 수퍼 클래스의 정보를 담은 인스턴스를 사용하여 클래스의 이름을 뽑아냄
        
        Class sc2 = sc.getSuperclass(); // Object 클래스의 수퍼클래스는?
        System.out.println(sc2); // return null => Object는 최상위 클래스. 모든 클래스는 직계 또는 직계의 자손이다
    }

}
