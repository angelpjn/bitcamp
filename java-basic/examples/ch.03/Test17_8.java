
package bitcamp.java100;

public class Test17_8 {
	
	static class Member {
		String name;
		int age;
		boolean working;
		float score;
		char level;
		
	}
	
	static Member m1() { // 사용자 정의 객체 리턴 메서드
		
		Member ref = new Member();
		ref.name = "홍길동";
		ref.age = 20;
		ref.working = false;
		ref.score = 4.12f;
		ref.level = 'M'; // 'M' => M이라는 문자의 unicode 값 77 리턴. 문자를 저장하는 방법 없음. unicode 값을 저장할 수 있을 뿐.
		return ref;
	}
	
    public static void main(String[] args) {
    	Member mem = m1();
    	
    	System.out.println(mem.name);
    	System.out.println(mem.age);
    	System.out.println(mem.working);
    	System.out.println(mem.score);
    	System.out.println(mem.level);
    	
    }
}















