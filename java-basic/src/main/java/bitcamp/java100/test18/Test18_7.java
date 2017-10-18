package bitcamp.java100.test18;

public class Test18_7 {

    public static void main(String[] args) throws Exception {
    	
    	// 최소 단위는 immutable 객체
    	String s1 = "Hello";
    	String s2 = s1.replace("l",  "x");
    	System.out.println(s1);
    	System.out.println(s2);
    	
    	// mutable 객체 : 객체의 값 변경
    	StringBuffer sb1 = new StringBuffer("Hello!");
    	
    	sb1.append(" World!");
    	System.out.println(sb1);
    	
    	
    	sb1.replace(2, 4, "ss");
    	System.out.println(sb1);
    }
}


















