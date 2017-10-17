
package bitcamp.java100;

public class Test17_4 {

	static void m1(int... values) {
		System.out.printf("argument 개수 : %d\n", values.length);
		for (int v : values) {
			System.out.println(v);
		}
		System.out.println("--------------------");
	}
	
//	static void m2(int... values, int...values2) {}
//	static void m2(int... values, String...values2) {}
	
	static void m3(String name, int age, int... values) {}  // 가변 길이 파라미터는 무조건 맨 뒤에 사용
	
//	static void m4(int... values, String name, int age) {}
//	static void m5(String name, int... values, int age) {}
//	static void m6(String name, int... values, String tel) {}
	
	static void sum(int... values) {
		int s = 0;
		for (int v : values) {
			s += v;
		}
		System.out.printf("합계 : %d\n", s);
	}
		
    public static void main(String[] args) {
    	m1();
    	m1(1);
    	m1(1, 2);
    	m1(1, 2, 3);
    	m1(1, 2, 3, 4);
    	m1(1, 2, 3, 4, 5);
    	
    	sum();
    	sum(1, 2, 3, 4, 5);
    	sum(100, 80, 70, 90);
    	
//    	m1(10 ,"hello");

    }
}


























