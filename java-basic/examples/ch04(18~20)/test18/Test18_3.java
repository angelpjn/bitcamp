
package bitcamp.java100.test18;

public class Test18_3 {

    public static void main(String[] args) {
    	
    	String s1 = "ABC가각간"; 
    	String s2 = "ABC가각간";
    	String s3 = "ABC가각간";
    	
    	String s4 = new String("ABC가각간");
    	String s5 = new String("ABC가각간");
    	String s6 = new String("ABC가각간");
    	
    	if (s1 == s2) {
    		System.out.println("s1 == s2");
    	}
    	
    	if (s1 == s3) {
    		System.out.println("s1 == s3");
    	}
    	
    	if (s1 != s4) {
    		System.out.println("s1 != s4");
    	}
    	
    	if (s1 != s5) {
    		System.out.println("s1 != s5");
    	}
    	
    	if (s1 != s6) {
    		System.out.println("s1 != s6");
    	}
    	
    	if (s4 != s5) {
    		System.out.println("s4 != s5");
    	}
    	
    	if (s4 != s6) {
    		System.out.println("s4 != s6");
    	}
    	
    	if (s5 != s6) {
    		System.out.println("s5 != s6");
    	}
    	
    	if (s1 == "ABC가각간") {  // => "ABC가각간"을 constants pool에서 찾는데 이미 "ABC가각간"이 생성되어 있으므로
    		                      //    레퍼런스 s1의 주소와 "ABC가각간"의 레퍼런스를 비교한다.
    							  //    그래서 아래의 비교 문은 다르다는 결과 값이 나온다.
    							  // equal(==) 연산자 사용은 주소 비교하는 것. 내용 비교는 18_4
    		System.out.println("s1 == ABC가각간");
    	}
    	
    	if (s4 != "ABC가각간") {
    		System.out.println("s4 != ABC가각간");
    	}
    }
}
