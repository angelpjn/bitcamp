
package bitcamp.java100.test17;

public class Test17_5 {

	static String m1() {
		return "Hello";
	}
	
	static int m2() {
		return 100;
	}
	
	static boolean m3() {
		return true;
	}
	
//	static int m4() {return "hello";} => type 불일치
//	static int m5() {} => return type이 있는데 return하지 않은 예 
		
	static int m6() {
		return 100;
//		int a = 100;
//		a++;
	}
    public static void main(String[] args) {
    	String v = m1();
    	int v2 = m2();
    	System.out.println(v + "\t" + v2); // debugging에는 이게 더 유리하다.
    	System.out.println(m1()); // m1() return -> System.out.println(); 실행. 가독성에는 이게 더 유리하다.
    	m1(); // return, 미저장 -> 값 소멸
    	
//    	String s = m2(); => return 값과 type mismatch 
    }
}















