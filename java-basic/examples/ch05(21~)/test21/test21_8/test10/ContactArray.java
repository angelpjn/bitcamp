// 10단계 : 배열 관련 메소드의 별도 파일화

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

public class ContactArray {
	
    // Contact 값 저장 레퍼런스 배열 생성
    static Contact[] contacts = new Contact[100]; // x개의 배열 인스턴스 [n]개 생성

    // 값이 저장될 위치
    static int cursor = 0;
    
    static void add(Contact contact) {
        if (cursor >= contacts.length) {
            throw new RuntimeException("최대 저장 개수 초과!!");
        }
        contacts[cursor] = contact;
        cursor++;
    }
    
    static Contact get(int index) {
        if (index < 0 || index >= cursor) {
            throw new RuntimeException("유효하지 않은 인덱스!!");
        }
        return contacts[index];
    }
    
    static int size() {
        return cursor;
    }
    
    // 배열에 저장된 값 출력

}
	
	








