/*
성적관리> add
이름? 홍길동
국어? 100
영어? 100
수학? 100
계속 입력하시겠습니까?(Y/n) <== 'Y' 또는 'y', 그냥 엔터치기 
이름? 임꺽정
국어? 90
영어? 90
수학? 90
계속 입력하시겠습니까?(Y/n) n

성적관리> list
홍길동, 300, 100.0
임꺽정, 270, 90.0

성적관리> view
이름? 홍길동
홍길동, 100, 100, 100, 300, 100.0

성적관리> view
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.

성적관리> delete
이름? 홍길동
정말 삭제하시겠습니까?(y/N) y <== 'Y', 'y'를 입력해야 삭제된다.
삭제하였습니다.

성적관리> delete
이름? 임꺽정
정말 삭제하시겠습니까?(y/N) n
삭제취소하였습니다.

성적관리> delete
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.

성적관리> update
이름? 홍길동
국어?(100) 80    <== 엔터를 치면 원래 점수 유지
영어?(100) 
수학?(100) 90
변경하시겠습니까?(y/N) y<== 'Y', 'y'를 입력해야 변경된다.
변경하였습니다.

성적관리> update
이름? 홍길동
국어?(100) 80    <== 엔터를 치면 원래 점수 유지
영어?(100) 
수학?(100) 90
변경하시겠습니까?(y/N) n<== 'Y', 'y'를 입력해야 변경된다.
변경취소하였습니다.

성적관리> update
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.

성적관리> remove
수행할 수 없는 명령입니다.

성적관리> quit
프로그램을 종료합니다.
*/

package practice.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test {

    static Scanner scan = new Scanner(System.in);

    static String prompt(String message) {
        System.out.print(message);
        return scan.nextLine();
    }

    public static void main(String[] args) {
        ArrayList<Score> list = new ArrayList<>();
        Iterator<Score> itr;
        Confirm confirm = new Confirm();

        label1: while (true) {
            Score score = null;
            String name = null;

            switch (prompt("성적관리> ")) {

            case ("add"):
                System.out.println("[학생 성적 입력]");

                while (true) {
                    score = new Score();
                    score.initInput();
                    list.add(score);
                    if (!confirm.confirm("계속 입력하시겠습니까?(Y/n) "))
                        break;
                }

                break;

            case ("list"):
                System.out.println("[학생 정보 조회]");
                itr = list.iterator();
                while (itr.hasNext()) {
                    itr.next().print();
                }

                break;

            case ("view"):
                System.out.println("[학생 상세 정보 조회]");

                name = prompt("이름? ");

                itr = list.iterator();
                while (itr.hasNext()) {
                    Score temp = itr.next();
                    if (temp.name.equals(name)) {
                        score = temp;
                        break;
                    }
                }
                if (score == null) {
                    System.out.printf("'%s'의 성적 정보가 없습니다.", name);
                } else {
                    score.printDetail();
                }

                break;

            case ("delete"):
                System.out.println("[학생 정보 삭제]");

                name = prompt("이름? ");

                itr = list.iterator();
                while (itr.hasNext()) {
                    Score temp = itr.next();
                    if (temp.name.equals(name)) {
                        score = temp;
                        break;
                    }
                }
                if (score == null) {
                    System.out.printf("'%s'의 성적 정보가 없습니다.", name);
                } else if (!confirm.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                    System.out.println("삭제 취소하였습니다.");
                } else {
                    list.remove(score);
                    System.out.println("삭제하였습니다.");
                }
                break;
            case ("update"):
                System.out.println("[학생 정보 변경]");

                name = prompt("이름? ");

                itr = list.iterator();
                while (itr.hasNext()) {
                    Score temp = itr.next();
                    if (temp.name.equals(name)) {
                        score = temp;
                        break;
                    }
                }
                if (score == null) {
                    System.out.printf("'%s'의 성적 정보가 없습니다.", name);
                    break;
                } else {
                    score.update();
                }
                break;
            case ("quit"):
                System.out.println("프로그램을 종료합니다.");
                break label1;
            default:
                System.out.println("실행할 수 없는 명령입니다.");
                break;
            }
            System.out.println();
        }

    }
}
