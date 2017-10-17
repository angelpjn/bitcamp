
package bitcamp.java100.Test17_17.step5;

public class Test {
	
	public static void main(String[] args) {
		Rect rect; // Rect class의 레퍼런스 선언
		rect = new Rect(); // new Rect();로 인스턴스 생성 => 클래스 메모리
		rect.width = 390; // 단위 : cm
		rect.height = 420;
		
		System.out.println(Rect.area(rect));
		
		System.out.println(Rect.pyeong(rect));
	}
}

