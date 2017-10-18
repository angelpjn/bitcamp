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
package bitcamp.java100.test21;

import java.io.Console;
import java.util.ArrayList;

public class Test21_8 {

    public static void main(String[] args) {

    	class MemberInfo { // non-static(method 밖에서 만들면 static 붙일 수 있음)
    		String name, email, phone, contin;
    	}
    	
    	Console console = System.console();
    	
    	if (console == null) {
    		System.err.println("콘솔을 지원하지 않습니다."); // err는 색이 빨강
    		System.exit(1); // JVM 종료 : 0 => 정상 / 그 외 => 비정상
    	}

    	MemberInfo memInfo = new MemberInfo();
    	ArrayList<String> list = new ArrayList<>();
    	
    	for (int i = 1; i <= 3; i++) {
	    	list.add(memInfo.name = console.readLine("이름? => "));
	    	list.add(memInfo.email = console.readLine("이메일? => "));
	    	list.add(memInfo.phone = console.readLine("전화? => "));
	    	list.add(memInfo.contin = console.readLine("계속입력하시겠습니까?(y/n) => "));
	    	if (memInfo.contin.compareTo("y") == 0) {
				System.out.println("저장 하였습니다.");
			} else {
				System.out.println("저장 취소하였습니다.");
			}
    	}
    	
    	for (int i = 1; i <= 4; i++) {
    		if (list.get(i * 4 - 1).equals("n")) {
    			for (int j = 1; j <= 4; j++) {
    				list.remove(i * 4 - 1);	
    			}
    		} else {}
//    		list.remove(8);
    	}

    	for (int i = 0; i < list.size(); i++) {
    		if ((i + 1) % 4 == 0) {
    			System.out.println();
    		} else {
            	System.out.print(list.get(i) + "\t");    			
    		}
    	}
    	System.out.println();
    }
}





















