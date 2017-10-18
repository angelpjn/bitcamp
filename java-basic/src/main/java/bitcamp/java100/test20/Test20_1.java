/*
   primitive type의 값을 wrapper 클래스를 사용하는 이유
   - 클래스에서 제공하는 다양한 메서드 이용 가능
   - 좀 더 정교하게 값을 다룰 수 있음
   - 값이나 객체의 주소를 구분하지 않고 주고 받고 싶을 때 : 문자와 숫자도 함께 넘길 수 있음
*/

package bitcamp.java100.test20;

public class Test20_1 {

    public static void main(String[] args) {
		int i = 10;
    	Integer i2 = new Integer(10);
    	
    	int i3 = i2.intValue();
    	
    	float f1 = i2.floatValue();
    	
    	System.out.println(Integer.MIN_VALUE);
    	System.out.println(Integer.MAX_VALUE);
    	
    	int value = Integer.parseInt("2345");
    	System.out.println(value + 100);
    	
    	System.out.println(Integer.toBinaryString(44032));
    	System.out.println(Integer.toOctalString(44032));
    	System.out.println(Integer.toHexString(44032));
    	
    	System.out.println((char)0xac00);
    	
    }
}


















