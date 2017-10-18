
package bitcamp.java100.test17;

public class Test17_10 {
	
	static void m1() {
		System.out.println("m1() --->"); 
		m2();
		System.out.println("m1() <---");
	}
	
	static void m2() {
		System.out.println("    m2() --->"); 
		m3();
		System.out.println("    m2() <---");
	}
	
	static void m3() {
		System.out.println("        m3() --->"); 
		m4();
		System.out.println("        m3() <---");
	}
	
	static void m4() {
		System.out.println("            m4()..."); 
	}
	
    public static void main(String[] args){
    	System.out.println("메소드 실행 후에는 반드시 되돌아간다.");
    	System.out.println("main() ===>");
    	m1();
    	System.out.println("main() <===");
    	
    }
}















