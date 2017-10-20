/*
   primitive type의 값을 wrapper 클래스를 사용하는 이유
   - 클래스에서 제공하는 다양한 메서드 이용 가능
   - 좀 더 정교하게 값을 다룰 수 있음
   - 값이나 객체의 주소를 구분하지 않고 주고 받고 싶을 때 : 문자와 숫자도 함께 넘길 수 있음
*/
package bitcamp.java100.test19;

import java.util.ArrayList;
//import java.lang.String; => java.lang 패키지는 자동 import 단, java.lang의 sub-package들은 자동 import되지 않는다.

public class Test19_2 {

    public static void main(String[] args) {
    	ArrayList<String> list = new ArrayList<>();
    	list.add("홍길동");
    }
}


















