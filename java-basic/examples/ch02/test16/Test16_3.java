
package bitcamp.java100.ch02.test16;

public class Test16_3 {
    public static void main(String[] args) {

    	System.out.println("· case 문 : ");
    	int level = 1;
    	
    	switch (level) {
    	case 0 : System.out.println("손님");
    	break;
    	case 1 : System.out.println("회원");
    	break;
    	case 2 : System.out.println("관리자");
    	break;
    	default : System.out.println("유효하지 않은 회원입니다.");
    	}
    	System.out.println();
    	
    	System.out.println("· case 가능 타입 : ");
    	byte b = 10;
    	short s = 10;
    	int i = 10;
    	char c = 10;
    	long l = 10;
    	float f = 10;
    	double d = 10;
    	boolean bool = true;
    	String str = "Hello";


    	switch (b) {}
    	switch (s) {}
    	switch (i) {}
    	switch (c) {}
//    	switch (l) {}
//    	switch (f) {}
//    	switch (d) {}
//    	switch (bool) {}
    	switch (str) {}
    	System.out.println();
    	
    	System.out.println("· break 없는 case 문 : ");
    	
    	level = 0;
    	
    	switch (level) {
    	case 0 : System.out.println("손님");
    	case 1 : System.out.println("회원");
    	case 2 : System.out.println("관리자");
    	default : System.out.println("유효하지 않은 회원입니다.");
    	}
    	System.out.println();
    	
    	System.out.println("· break 활용 case 문 : ");
    	
    	String v1 = "어린이";
    	
    	switch (v1) {
    	case "유아" : 
    	case "노인" : System.out.println("무료 승차"); break;
    	case "어린이" : 
    	case "중학생" : 
    	case "고등학생" :
    	case "미성년" :  System.out.println("청소년 요금입니다."); break;
    	case "성인" : 
    	case "외국인" : System.out.println("일반 요금입니다.");
    	default : System.out.println("요금 계산 대상이 아닙니다.");
    	}
    	
    	System.out.println();
    	
    	System.out.println("· default 생략 case 문 : ");
    	
    	switch (10) {
    	case 10 : System.out.println("값입니다.");
    	}
    }
}
