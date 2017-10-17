
package bitcamp.java100.test17;

public class Test17_2 {

	static void m1() {
		System.out.println("m1() 메서드 실행됨!");
	}
	
    public static void main(String[] args) {
    	m1(); // m1() 메서드 호출 = m1() 메서드 사용
    	      // => m1() 메서드 호출 시 m1() 메서드로 이동 -> {} 안의 코드 실행 -> 되돌아 옴 -> 다음 코드 이동
    	m1(); 
    	m1(); 
    	m1(); 
    	
//    	m1(100);
    	
//    	int r = m1();
    	
    	
    }
}


























