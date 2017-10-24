
package bitcamp.java100.test18;

public class Test18_2 {

    public static void main(String[] args) {
    	
    	String s1;
    	
    	s1 = "ABC가각간"; // 문자열 literal "ABC가각간"
    	// s1 : "ABC가각간" 문자열이 저장된 String 인스턴스의 주소(reference)
    	
//    	literal : 코드로 바로 적는 값.
//    	ex. int i = 8; 에서 literal은 "8" => 4byte int literal 8이라고 읽음
//    	literal 종류 예 : 12, 12L, 3.14f, 4.14, true, false, '가'
//    	즉, short와 byte의 liter은 없음.
    	
    	String s2 = "ABC가각간";
    	
    	if (s1 == s2) {
    		System.out.println("s1 == s2");
    	} else {
    		System.out.println("s1 != s2");
    	}
    }
}
