
package bitcamp.java100;

public class Test16_1 {
    public static void main(String[] args){

    	int a = 100;
    	{
//    		int a = 200;  => 컴파일 에러 : 기 선언한 변수 재 선언
    		
    		System.out.println(a);
    		
    		int b = 200;
    		System.out.println(b);
    		{
    			System.out.println(b);
    			int c = 300;
    			System.out.println(c);
    		}
//    		System.out.println(c); => 컴파일 에러 : {}안에서 선언한 변수 사용
    	}
    	{}
    	System.out.println(a);
//    	System.out.println(b); => 컴파일 에러 : {}안에서 선언한 변수 사용
    	
//    	System.out.println(c); => 컴파일 에러 : 변수를 나중에 선언
    	int c = 300; // {} 안에서 선언한 변수는 {} 밖에서는 사라지므로 c로 변수 재선언 가능
    	
    }
}