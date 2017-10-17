
package bitcamp.java100;

public class Test17_16 {
	public static void main(String[] args) {
		Test17_16_A.m1();
		Test17_16_B.m1();
		Test17_16_A.m2();
		Test17_16_B.m2();
		Test17_16_A.m3();
		Test17_16_B.m3();
		Test17_16_B.m4();
		
//		Test17_16_C.m4(); => 타 패키지의 클래스 파일 속 메서드. 컴파일 오류. 반드시 전체 패키지명과 클래스명 입력.
//		                  => 해당 클래스의 메서드는 public 선언 해야 함

		bitcamp.java100.other.Test17_16_C.m1();
		bitcamp.java100.other.Test17_16_C.m2();
		bitcamp.java100.other.Test17_16_C.m3();
		bitcamp.java100.other.Test17_16_C.m4();
		
		
		// 상속은 클래스 활용의 하나일 뿐, 클래스 문법의 존재 이유가 아니다.
	}
}

