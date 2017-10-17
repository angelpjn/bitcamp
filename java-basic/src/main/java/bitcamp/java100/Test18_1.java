
package bitcamp.java100;

public class Test18_1 {

    public static void main(String[] args) {
    	
//    	1. 레퍼런스 선언
    	String s1;
    	
//    	2. 메모리 준비
    	s1 = new String("ABC가각간");
//    	내부적으로는 'A', 'B', 'C', '가', '각', '간' char 문자의 배열 생성(1.8 이하 char[], 9 byte[])
    	
    	String s2 = new String("ABC가각간");
    	
    	if (s1 != s2) {
    		System.out.println("s1 != s2");
    	}
    	
    }
}
