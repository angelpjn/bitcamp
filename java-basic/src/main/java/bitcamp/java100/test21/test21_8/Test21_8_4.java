// 4단계 : 저장 여부 확인_인원을 확정하고 코딩

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
package bitcamp.java100.test21.test21_8;

import java.io.Console;

public class Test21_8_4 {
	
	public static void main(String[] args) {
		Console console = System.console();
		
		if (console == null) {
			System.err.println("콘솔을 지원하지 않습니다."); // err는 색이 빨강
			System.out.println("콘솔을 지원하지 않습니다."); // out은 색이 하양
			System.exit(1); // JVM 종료 : 0 => 정상 / 그 외 => 비정상
		}
		
		// 값 저장 레퍼런스 배열 생성
		String[] names = new String[100];
		String[] emails = new String[100];
		String[] tels = new String[100];
		
		// 값이 저장될 위치
		int cursor = 0;
		
		// 배열의 개수만큼 입력
		while (cursor < names.length) {
			String name = console.readLine("이름? ");
			String email = console.readLine("이메일? ");
			String tel = console.readLine("전화? ");
			String reponse = console.readLine("저장하시겠습니까?(y/n)");
			if (reponse.toLowerCase().equals("y") ||
					reponse.toLowerCase().equals("yes")) {  // 문자열 비교는 double quotation(""). 대문자 입력도 허용
				names[cursor] = name;
				emails[cursor] = email;
				tels[cursor] = tel;
				cursor++;
			}
			reponse = console.readLine("계속 입력하시겠습니까?(y/n)");
			if (!(reponse.toLowerCase().equals("y") ||
			      reponse.toLowerCase().equals("yes"))) {  // 문자열 비교는 double quotation(""). 대문자 입력도 허용
				break;
			}
//			cursor++ => cursor++가 여기 있으면 + 1 되지 않고 넘어감. 반복문 조건식을 i <= cursor로 변경해야 함
		}
		
		// 배열에 저장된 값 출력
		for (int i = 0; i < cursor; i++) {
			System.out.printf("%s, %s, %s\n", names[i], emails[i], tels[i]);
		}
	}
}
	



















