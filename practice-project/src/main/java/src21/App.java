package src21;

//: ## ver 21
//: - 성적관리 입출력을 처리하는 메서드를 별도의 블록으로 분류하라!
//: - 공통으로 사용하는 메서드도 별도의 클래스로 분리하라!
//: - 학습목표
//:   - 클래스 문법을 사용하여 관련 기능을 묶어서 분류하는 기법을 익힌다.
//: 
//:
/*
요구사항
명령> menu
1 성적관리
2 회원관리
3 게시판

명령> help
[명령]
menu - 메뉴 목록을 출력한다.
go 번호 - 메뉴로 이동한다.
quit - 프로그램을 종료한다.
명령 실행 시 'go 번호'를 입력하세요.
예를 들어 [성적관리] 메뉴를 실행하고 싶다면 'go 1'이라고 입력하세요.

명령> quit
프로그램을 종료합니다.

명령> ok
잘못된 명령입니다.

명령> go 1

성적관리> list
...
*/

import java.util.Scanner;

public class App {

    static Scanner keyScan = new Scanner(System.in);
    static ScoreController scoreController = new ScoreController();
    
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
        case "2": System.out.println("회원관리"); break;
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
