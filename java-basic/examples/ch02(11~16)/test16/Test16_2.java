
package bitcamp.java100.ch02.test16;

public class Test16_2 {
    public static void main(String[] args) {
    	
    	System.out.println("· if ~ else문1 : ");
    	
    	int age = 27;    	
    	if (age <= 19) System.out.println("미성년"); else System.out.println("성년");
    	System.out.println();

    	System.out.println("· if ~ else문2 : ");
    	
    	age = 17;    	
    	if (age <= 19)
    		System.out.println("미성년");
    	else
    		System.out.println("성년");
    	System.out.println();
    	
    	System.out.println("· if문만 사용 : ");
    	
    	age = 57;    	
    	if (age >= 65)
    		System.out.println("경로우대 대상자입니다.");
    	System.out.println();
    	
    	System.out.println("· else문 단독 사용 컴파일 오류 : ");
    	
    	/*
    	 * 컴파일 오류. else문 단독 사용
    	age = 57;    	
    	else
    		System.out.println("경로우대 대상자가 아닙니다.");
    	*/
    	System.out.println();
    	    	
    	System.out.println("· {} 없을 시 다중 문장 사용 : ");
    	
    	age = 27;    	
    	if (age <= 19)
    		System.out.println("미성년입니다."); // {} 없을 시 if에 속한 문장
    		System.out.println("청소년 할인을 받을 수 있습니다."); // {} 없을 시 if에 속하지 않은 문장
    		                                                       // 그래서 이 경우는 아래 문장만 출력됨
    		System.out.println();
    		
       	System.out.println("· {} 사용 다중 문장 사용 : ");
        	
       	age = 27;        	
       	if (age <= 19) {
       		System.out.println("미성년입니다."); 
       		System.out.println("청소년 할인을 받을 수 있습니다."); 
       	}
       	System.out.println();
       	
       	System.out.println("· if문 안에 if문 넣기 : ");
       	
       	age = 13;
       	if (age <= 19)
       		if (age > 13)
       			System.out.println("청소년");
       	System.out.println();
       	
       	System.out.println("· if문 안에 if ~ else문 넣기 1 : ");
       	
       	age = 27;
       	if (age <= 19)
       		if (age > 13)
       			System.out.println("청소년");
       	else 									// if (age > 13)에 걸려있는 else 문
       		System.out.println("성년"); 
       	
       	
       	System.out.println("· if문 안에 if ~ else문 넣기 2 : ");
       	
       	age = 27;
       	if (age <= 19) {
       		if (age > 13)
       			System.out.println("청소년");
       	}
       	else 									// {} 사용에 의해 if (age <= 19)에 else 문이 걸림
       		System.out.println("성년"); 
       	System.out.println();
       	
       	
    	System.out.println("· if문 안에 if ~ else문 넣기 3 : ");
    	
       	age = 13;
       	if (age <= 19)
       		if (age > 13)
       			System.out.println("청소년");
	       	else 									
	       		System.out.println("어린이 또는 유아");
       	System.out.println();
       	
       	
    	System.out.println("· else문 안에 if문 넣기 1 : ");
    	
       	age = 23;
       	if (age <= 19)
       		if (age > 13)
       			System.out.println("청소년");
	       	else 									
	       		System.out.println("어린이 또는 유아");
	       	else                                   // 첫번쨰 if문에 걸린 else문
	       		System.out.println("성년");
       	System.out.println();
       	
    	System.out.println("· else문 안에 if문 넣기 2 : ");
    	
       	age = 72;
       	if (age <= 19)
       		if (age > 13)
       			System.out.println("청소년");
	       	else 									
	       		System.out.println("어린이 또는 유아");
       	else
       		if (age < 65)
       			System.out.println("성년입니다.");
       		else
       			System.out.println("노인입니다.");
       	System.out.println();
       	
       	System.out.println("· if ~ else문 표준 활용 법 : ");
    	
       	age = 72;
       	if (age <= 19) {
       		if (age > 13)
       			System.out.println("청소년");
	       	else 									
	       		System.out.println("어린이 또는 유아");
       	} else {
       		if (age < 65)
       			System.out.println("성년입니다.");
       		else
       			System.out.println("노인입니다.");
       	}
       	System.out.println();
       	
       	System.out.println("· else 문 안에 if ~ else문 넣기 : ");
    	
       	age = 72;
       	if (age < 8) {
       		System.out.println("유아");
       	} else {
       		if (age < 14) {
       			System.out.println("어린이");
       		} else {
       			if (age < 20) {
       				System.out.println("청소년");
       			} else {
       				if (age < 65) {
       					System.out.println("성년");
       				} else {
       					System.out.println("노인");
       				}
       			}
       		}
       	}
       	System.out.println();
       	
       	System.out.println("· else 문 안에 if ~ else문 정렬(가독성 제고_else if 활용) : ");
    	
       	age = 72;
       	if (age < 8) {
       		System.out.println("유아");
       	} else if (age < 14) {            // else ~ if는 else 안에 삽입한 if문 일 뿐 else if 문법은 존재하지 않음
       		System.out.println("어린이");
       	} else if (age < 20) {
       		System.out.println("청소년");
       	} else if (age < 65) {
       		System.out.println("성년");
       	} else {
       		System.out.println("노인");
       	}
      	
    }
}




















