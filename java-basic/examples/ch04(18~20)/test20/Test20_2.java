/*
   primitive type의 값을 wrapper 클래스를 사용하는 이유
   - 클래스에서 제공하는 다양한 메서드 이용 가능
   - 좀 더 정교하게 값을 다룰 수 있음
   - 값이나 객체의 주소를 구분하지 않고 주고 받고 싶을 때 : 문자와 숫자도 함께 넘길 수 있음
*/

package bitcamp.java100.test20;

public class Test20_2 {

    public static void main(String[] args) {
    	int i = 100;

    	// auto-boxing : 자동으로 wrapper 객체로 만들어 주소 저장
    	Integer r1 = 100; // 100 => new Integer(100);
    	
    	Integer r2 = new Integer(300);
    	
    	// auto-unboxing : 자동으로 wrapper 객체의 값(primitive type)을 꺼냄
    	int i2 = r2; // r2 => r2.intValue()
    	// thread : 프로그램 실행
    	// thread safe : 한 프로그램의 실행 종료 전까지 다른 프로그램 실행되지 않는 것
    }
}


















