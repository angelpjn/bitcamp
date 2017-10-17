
package bitcamp.java100.Test17_17.step3;

public class Test {

	static class Rect {
		int width;
		int height;
	}
	
	static float area(Rect r) { // 파라미터 로컬 변수를 선언하는 대신 클래스를 만들고
		                        // 파라미터 로컬 변수로 클래스의 레퍼런스 선언
		return (r.width * r.height) / 10000f;
	}
	
	static float pyeong(Rect r) {
		return (r.width * r.height) / 10000f / 3.3f;
	}
	
	public static void main(String[] args) {
		Rect rect; // Rect class의 레퍼런스 선언
		rect = new Rect(); // new Rect();로 인스턴스 생성 => 클래스 메모리
		rect.width = 390; // 단위 : cm
		rect.height = 420;
		
		System.out.println(area(rect));
		
		System.out.println(pyeong(rect));
	}
}

