
package bitcamp.java100;

public class Test17_3 {

	static void m1(String name) {  // name => parameter(매개변수) : argument를 받는 통. ex. 쓰레기통.
		System.out.printf("%s님 반갑습니다!\n", name);
	}
	
	static void m2(String name, int age) {
		System.out.printf("%s(%d)님 반갑습니다!\n", name, age);
	}
	
    public static void main(String[] args) {
    	
    	m1("홍길동");; // 홍길동, 임꺽정, 유관순 => argument(인자) : 넘겨주는 값. 
    	m1("임꺽정"); // parameter가 아님에 주의 할 것. ex. 라면봉투.
    	m1("유관순"); 
    	
    	m2("홍길동", 20);
    	m2("임꺽정", 30);
    	m2("유관순", 16);
    }
}






























