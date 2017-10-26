package bitcamp.java100.ch07.ex4;

public class Test2 extends Object {
//  모든 클래스를 java.lang.Object 클래스를 상속한다. 단, 상속하는 클래스가 없을 때만.
//  Class 내장변수 class
//  · 모든 클래스에는 그 클래스의 정보가 담겨있는 인스턴스의 주소를 가지고 있음
//  · static Class class = new Class(); 
//    => class가 가리키는 인스턴스에는 클래스 정보가 담겨 있음
    
    public static void main(String[] args) {

        Test2 obj = new Test2();
        System.out.println(obj.toString()); // return null => Object는 최상위 클래스. 모든 클래스는 직계 또는 직계의 자손이다
        System.out.println(Integer.toHexString(obj.hashCode()));
        System.out.println("----------------");

        
        System.out.println("해시코드" + obj.hashCode());
        
        System.out.println();
        Test2 obj2 = new Test2();
        Test2 obj3 = obj;
        System.out.println(obj.equals(obj2));
        System.out.println(obj.equals(obj3));
        System.out.println("----------------");
        
        System.out.println();
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2)); // equals()는 인스턴스를 비교하는 용도이지만 String과 Wrapper 클래스에서는 
        System.out.println("----------------"); // 이를 재정의하여 내용을 비교하는 용도로 사용한다.
        
        System.out.println();
        StringBuffer sb1 = new StringBuffer("hello"); // StringBuffer는 equals()를 재정의 하지 않았기 때문에 Object와 마찬가지로 인스턴스를 비교한다.
        StringBuffer sb2 = new StringBuffer("hello");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println("----------------"); 
        
        System.out.println();
        Class c = obj.getClass();
        
        System.out.println(c.getName());
    }
}
