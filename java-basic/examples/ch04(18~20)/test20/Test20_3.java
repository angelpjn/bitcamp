/*
   primitive type의 값을 wrapper 클래스를 사용하는 이유
   - 클래스에서 제공하는 다양한 메서드 이용 가능
   - 좀 더 정교하게 값을 다룰 수 있음
   - 값이나 객체의 주소를 구분하지 않고 주고 받고 싶을 때 : 문자와 숫자도 함께 넘길 수 있음
*/

package bitcamp.java100.test20;

import java.io.File;

public class Test20_3 {
	
	static void print1(String value) {
		System.out.println(value);
	}
	
	static void print2(int value) {
		System.out.println(value);
	}
	
	static void print3(float value) {
		System.out.println(value);
	}
	
	static void print4(Object value) {
		// Object의 레퍼런스는 자바의 모든 (클래스의/타입의) 객체(의 주소)를 저장할 수 있다.
		System.out.println(value);
	}

    public static void main(String[] args) {
    	
    	print1("문자열");
    	print2(300);
    	print3(3.14f);
    	
    	String v1 = "홍길동";
    	StringBuffer v2 = new StringBuffer("임꺽정");
    	File v3 = new File(".");
    	
    	print1(v1);
//    	print1(v2);
//    	print1(v3);

    	print4(v1);
    	print4(v2);
    	print4(v3);
    	
    	//auto-boxing
    	
    	print4(new Integer(100));
    	print4(100); // print4(new Integer(100))
    	
    	print4(new Float(3.14f));
    	print4(3.14f); // print4(new Float(3.14f))

    	print4(new Boolean(true));
    	print4(true); // print4(new Boolean(true))
    	
    	

	}
}


















