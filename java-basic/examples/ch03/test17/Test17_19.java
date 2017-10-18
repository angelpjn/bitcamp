
package bitcamp.java100.test17;

public class Test17_19 {

	static class My { 
		int value;
		
		void print() {
//			My this = new My(); => r1.print(); 실행 시
//			                       main()에서 print() 호출 시 자동으로 레퍼런스 변수인 this를 생성하고 r1, r2, r3
//			                       각각 실행 시 해당 레퍼런스 주소를 받은 후 print()의 결과를 보내준다.
//			                       자동 생성되기 떄문에 그냥 쓰면 된다.
//			My this = new My(); => r2.print(); 실행 시
//			My this = new My(); => r3.print(); 실행 시
			System.out.println(this.value);
		}
	}
	
	public static void main(String[] args) {
		My r1 = new My();
		My r2 = new My();
		My r3 = new My();
		
		r1.value = 100;
		r2.value = 200;
		r3.value = 300;
		
		// 인스턴스 메서드는 클래스 이름으로 호출 불가
//		My.print();
		
		r1.print();
		/*
		r1.print();의 호출 순서 : r1의 클래스 찾는다.(My r1으로 이동. 클래스가 "My"임을 확인) -> My클래스로 이동
		-> print() 메서드로 이동 -> print()의 내장 변수 this에 r1의 레퍼런스 주소 저장 -> print() 메서드 호출
		- r1.print();의 관계는 "r1(피연산자).print()(연산자);"의 관계와 흡사.(ex. i++; => i : 피연산자, ++ : 연산자)
		  => 피연산자.연산자 : 피연산자에 대해서 연산을 가한다.
		*/
		r2.print();
		r3.print();
		
		My m4 = null;
//		m4.print(); => m4의 클래스를 찾으려고하나 레퍼런스 주소가 null이므로 실행 오류가 발생한다.
		
		String s1 = "hello";
//		s1.print(); => 컴파일러는 print()의 레퍼런스인 s1의 클래스인 String 클래스를 찾는다.
	}
}


