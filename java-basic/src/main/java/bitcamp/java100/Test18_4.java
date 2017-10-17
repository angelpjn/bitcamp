
package bitcamp.java100;

public class Test18_4 {

    public static void main(String[] args) {
    	
    	String s1 = "ABC가각간"; 
    	String s2 = new String("ABC가각간");
    	
    	// reference 주소 비교(==, != 연산자 사용)
    	if (s1 != s2) System.out.println("s1 != s2");
    	
    	// 문자열 내용 비교
    	if (s1.equals(s2)) System.out.println("s1과 s2의 문자열 내용이 같다.");
    }
}
