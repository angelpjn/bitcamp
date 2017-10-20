/*
   primitive type의 값을 wrapper 클래스를 사용하는 이유
   - 클래스에서 제공하는 다양한 메서드 이용 가능
   - 좀 더 정교하게 값을 다룰 수 있음
   - 값이나 객체의 주소를 구분하지 않고 주고 받고 싶을 때 : 문자와 숫자도 함께 넘길 수 있음
*/
package bitcamp.java100.test19;

public class Test19_1 {

    public static void main(String[] args) throws Exception {
    	int i = 10;
    	
    	java.lang.Integer i2 = new java.lang.Integer(10);
    }
}


















