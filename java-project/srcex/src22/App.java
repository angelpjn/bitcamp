//: ## ver 22
//: - 회원관리 기능을 추가하라!
//: - 자세한 요구사항은 App.java의 주석을 확인하라!
//: - 학습목표
//:   - 클래스를 만들고 메서드를 정의하는 것을 연습한다.
//: 
//: 
//: 요구사항 
/*
회원관리> add
이름? 홍길동
이메일? hong@test.com
암호? 1111
입력하였습니다.

회원관리> add
이름? 홍길동2
이메일? hong@test.com
암호? 1111
이미 등록된 이메일입니다.

회원관리> list
홍길동, hong@test.com

회원관리> view
이메일? hong@test.com
이름: 홍길동
이메일: hong@test.com
암호: 1111

회원관리> view
이메일? hong2@test.com
'hong2@test.com'의 회원 정보가 없습니다.

회원관리> delete
이메일? hong@test.com
정말 삭제하시겠습니까?(y/N) y <== 'Y', 'y'를 입력해야 삭제된다.
삭제하였습니다.

회원관리> delete
이메일? hong@test.com
정말 삭제하시겠습니까?(y/N) n
삭제취소하였습니다.

회원관리> delete
이메일? hong2@test.com
'hong2@test.com'의 회원 정보가 없습니다.

회원관리> update
이메일? hong2@test.com
이름?(홍길동) 홍길동2    <== 엔터를 치면 원래 점수 유지
암호?(1111) 2222
변경하시겠습니까?(y/N) y<== 'Y', 'y'를 입력해야 변경된다.
변경하였습니다.

회원관리> update
이메일? hong2@test.com
이름?(홍길동) 홍길동2    <== 엔터를 치면 원래 점수 유지
암호?(1111) 2222
변경하시겠습니까?(y/N) n<== 'Y', 'y'를 입력해야 변경된다.
변경취소하였습니다.

회원관리> update
이메일? hong2@test.com
'hong2@test.com'의 회원 정보가 없습니다.

회원관리> remove
수행할 수 없는 명령입니다.

회원관리> main

명령>
*/
import java.util.Scanner;

public class App {

    static Scanner keyScan = new Scanner(System.in);
    static ScoreController scoreController = new ScoreController();
    static MemberController memberController = new MemberController();
    
    public static void main(String[] args) {

        loop: while (true) {
            System.out.print("명령> ");
            String[] input = keyScan.nextLine().toLowerCase().split(" ");

            try {
                switch (input[0]) {

                case "menu": doMenu(); break;

                case "help": doHelp(); break;

                case "quit": doQuit(); break loop;

                case "go": doGo(input[1]); break;

                default: doError(); break;
                }
            } catch (Exception e) {
                System.out.println("명령 처리 중 오류 발생!");
            }
            System.out.println();
        }
    }

    private static void doMenu() {
        System.out.println("1 성적관리");
        System.out.println("2 회원관리");
        System.out.println("3 게시판");
    }

    private static void doGo(String menuNo) {

        switch (menuNo) {
        case "1": scoreController.excute(); break;
        case "2": memberController.excute(); break;
        case "3": System.out.println("게시판"); break;
        default: System.out.println("해당 번호의 메뉴가 없습니다.");
        }
    }

    private static void doHelp() {
        System.out.println("[명령]");
        System.out.println("menu    - 메뉴 목록을 출력한다.");
        System.out.println("go 번호    - 메뉴로 이동한다.");
        System.out.println("quit    - 프로그램을 종료한다.");
    }

    private static void doError() {
        System.out.println("실행할 수 없는 명령입니다.");
    }

    private static void doQuit() {
        System.out.println("프로그램을 종료합니다.");
    }

}
