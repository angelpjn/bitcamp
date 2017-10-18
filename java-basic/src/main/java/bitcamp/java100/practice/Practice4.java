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

package bitcamp.java100.practice;

import java.io.Console;
import java.util.ArrayList;

public class Practice4 {

    public static void main(String[] args) {

        class Info {
            String name, email, phone, save, con;
        }
        
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다."); 
            System.out.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        
        Info info = new Info();
        
        ArrayList<String> list = new ArrayList<>();
        
        label1:
        for (int i = 0; i < 4; i++) {
            list.add(info.name = console.readLine("이름? => "));
            list.add(info.email = console.readLine("이메일? => "));
            list.add(info.phone = console.readLine("전화? => "));
            list.add(info.save = console.readLine("저장하시겠습니까?(y/n) => "));
            if (info.save.compareTo("y") == 0) {
                System.out.println("저장하였습니다.");
            }   else {
                System.out.println("저장 취소하였습니다.");
            }
            list.add(info.con = console.readLine("계속입력하시겠습니까?(y/n) => "));
            if (info.con.compareTo("n") == 0) {
                break label1;
            }
        }
        
        System.out.println("---결과출력---"); 
            
        for (int i = 0; i < list.size(); i++) {
            if (((i + 1) % 5 == 0) && (list.get(i - 1).compareTo("y") == 0)) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(list.get(i - 4 + j) + "\t");
                }
                System.out.println();
            } else {}
        }
    }
}

















