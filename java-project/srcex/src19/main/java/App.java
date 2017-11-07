
//: ## ver 19
//: - 기능 추가: 사용자 명령을 처리하는 코드 메서드로 분리
//: - 요구사항
//:   - 메서드 통한 코드 관리 효율화 기법 활용 연습
//:   - 리팩토링 기법 중 "extract method" 이점 이해
//: 
//: 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {

    static Scanner keyScan = new Scanner(System.in);
    static ArrayList<Score> list = new ArrayList<>();
    static Score score = new Score();
    static Iterator<Score> iterator = list.iterator();
    static String name = null;
    static Score temp = null;

    public static void main(String[] args) {

        loop: while (true) {
            System.out.print("성적관리> ");
            String input = keyScan.nextLine();

            name = null;

            switch (input) {
            case "add": doAdd(); break;

            case "list": doList(); break;

            case "view": doView(); break;
            
            case "update": doUpdate(); break;

            case "delete": doDelete(); break;

            case "quit": doQuit(); break loop;

            default: doError();
            }
            System.out.println();
        }
    }


    private static void doAdd() {
        System.out.println("[학생 등록]");

        while (true) {
            Score score = new Score();
            score.input();

            list.add(score);

            if (!confirm("계속하시겠습니까?(Y/n) "))
                break;
        }
    }

    private static void doList() {
        System.out.println("[학생 목록]");
        iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }

    private static void doView() {
        System.out.println("[학생 정보]");
        name = prompt("이름? ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            temp = iterator.next();
            if (temp.name.equals(name)) {
                score = temp;
                break;
            }
        }

        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            score.printDetail();
        }
    }

    private static void doDelete() {
        System.out.println("[학생 삭제]");
        name = prompt("이름? ");

        score = null;
        iterator = list.iterator();
        while (iterator.hasNext()) {
            temp = iterator.next();
            if (temp.name.equals(name)) {
                score = temp;
                break;
            }
        }

        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            if (confirm2("정말 삭제 하시겠습니까?(y/N) ")) {
                list.remove(score);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
        }
    }

    private static void doUpdate() {
        System.out.println("[학생 정보 변경]");
        name = prompt("이름? ");

        iterator = list.iterator();
        while (iterator.hasNext()) {
            temp = iterator.next();
            if (temp.name.equals(name)) {
                score = temp;
                break;
            }
        }

        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            score.update();
        }
    }

    private static void doQuit() {
        System.out.println("프로그램을 종료합니다.");
    }

    private static void doError() {
        System.out.println("실행할 수 없는 명령입니다.");
    }

    static String prompt(String message) {
        System.out.print(message);
        return keyScan.nextLine();
    }

    static boolean confirm(String message) {
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();

        if (response.equals("y") || response.equals("yes") || response.equals("")) {
            return true;
        }
        return false;
    }

    static boolean confirm2(String message) {
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();

        if (response.equals("n") || response.equals("no") || response.equals("")) {
            return false;
        }
        return true;
    }
}
