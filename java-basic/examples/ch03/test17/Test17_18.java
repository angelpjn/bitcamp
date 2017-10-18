
package bitcamp.java100.test17;

public class Test17_18 {

	static class My { 
		int value;
		
		static void print(My ref) { // 내장변수 this가 생성되지 않는다.
			System.out.println(ref.value);
//			System.out.println(this.value);
		}
	}
	
	public static void main(String[] args) {
		My r1 = new My();
		My r2 = new My();
		My r3 = new My();
		
		r1.value = 100;
		r2.value = 200;
		r3.value = 300;
		
		My.print(r1);
		My.print(r2);
		My.print(r3);
		
		r1.print(r1); // 레퍼런스를 이용하여 print() 메서드를 호출할 수 있으나, 메소드 앞 r1은 의미 없음
	}
}