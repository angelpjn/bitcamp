
package bitcamp.java100.test17.Test17_17.step6;

public class Test {

	public static void main(String[] args) {
		Rect r; 
		r = new Rect();
		r.width = 390; 
		r.height = 420;
		
		System.out.println(r.area()); // arg 삭제 후, 메서드 앞에 레퍼런스 지정. r은 해당 메서드 내장 변수 this에 보관
		
		System.out.println(r.pyeong());
	}
}

