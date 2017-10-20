// 10단계 : Contact 배열을 다루는 메서드를 별도의 클래스로 분리
//          클래스에서 사용하는 메서드 분리

/*
## 키보드로부터 입력 받기 - 연습4
   - 다음과 같이 사용자로부터 이름, 이메일, 전화를 입력받아 출력하시오!
   - 실행 예) 
     이름? 홍길동
     이메일? hong@test.com
     전화? 1111-1111
     저장하시겠습니까?(y/n) y
     저장하였습니다.
     계속입력하시겠습니까?(y/n) y
     이름? 임꺽정
     이메일? leem@test.com
     전화? 1111-1112
     저장하시겠습니까?(y/n) y
     저장하였습니다.
     계속입력하시겠습니까?(y/n) y
     이름? 유관순
     이메일? yoo@test.com
     전화? 1111-1113
     저장하시겠습니까?(y/n) n
     저장 취소하였습니다.
     계속입력하시겠습니까?(y/n) y
     이름? 안중근
     이메일? ahn@test.com
     전화? 1111-1114
     저장하시겠습니까?(y/n) y
     저장하였습니다.
     계속입력하시겠습니까?(y/n) n
     ------------------------------
     홍길동     hong@test.com 1111-1111
     임꺽정     leem@test.com 1111-1112
     안중근      ahn@test.com 1111-1114
     > 
 */
package bitcamp.java100.test21.test21_8.test10;

import java.io.Console;

public class Test10 {
	
    static Console console;
    
	static boolean confirm(String message) {
	    String input = console.readLine(message + "(y/n) ");
	    if ((input.toLowerCase().equals("y") ||
	            input.toLowerCase().equals("yes"))) {  // 문자열 비교는 double quotation(""). 대문자 입력도 허용
	        return true;
	    } else {
	        return false;
	    }
	}
	
	static Contact inputContact() {
	    
	    Contact contact = new Contact();

	    // 사용자가 입력한 데이터를 Contact 인스턴스:클래스 설계도에 따라 만든 메모리(객체)에 저장
	    contact.name = console.readLine("이름? ");
	    contact.email = console.readLine("이메일? ");
	    contact.tel = console.readLine("전화? ");
	    
	    return contact;
	}
	
    static void printContacts() {
        for (int i = 0; i < ContactArray.size(); i++) {
            Contact contact = ContactArray.get(i);
            System.out.printf("%s, %s, %s\n",
                    contact.name,
                    contact.email,
                    contact.tel);
        }
    }
	
	public static void main(String[] args) {
	    
	    console = System.console();
	    
	    if (console == null) {
	        System.err.println("콘솔을 지원하지 않습니다."); // err는 색이 빨강
	        System.exit(1); // JVM 종료 : 0 => 정상 / 그 외 => 비정상
	    }
	    
		// 배열의 개수만큼 입력
		while (true) {
			
		    Contact contact = inputContact();

			if (confirm("저장하시겠습니까?")) {
			    try {
			        ContactArray.add(contact);
			    } catch (RuntimeException e) {
			        System.err.println(e.getMessage());
			        break;
			    }
			}
			
			if (!confirm("계속 입력하시겠습니까?")) {
			    break;
			}
		}
		printContacts();
	}
}
	



















