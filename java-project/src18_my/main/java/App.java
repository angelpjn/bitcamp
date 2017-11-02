
//: ## ver 18
//: - 기능 추가 : 변경, 삭제 기능 추가
//: - 학습목표
//:   App.java 클래스 주석 확인
//: 
/*
>>> 프롬프트에서
성적관리> add
이름? 홍길동
국어? 100
영어? 100
수학? 100
계속 입력하시겠습니까?(Y/n) <== yes 조건 : 'Y', 'y', 엔터 // no 조건 : 'N', 'n' 
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

성적관리> delete
이름? 홍길동
정말 삭제하시겠습니까?(y/N) <== yes 조건 : 'Y', 'y' // no 조건 : 'n', 'N', 엔터
삭제하였습니다.

성적관리> delete
이름? 임꺽정
정말 삭제하시겠습니까?(y/N) <== yes 조건 : 'Y', 'y' // no 조건 : 'n', 'N', 엔터
삭제하였습니다.

성적관리> delete
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.

성적관리> view
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.

성적관리> update
이름? 홍길동
국어?(100) 80
영어?(100)     <== 엔터를 치면 원래 점수 유지
수학?(100) 90
변경하시겠습니까?(y/N) n  <== yes 조건 : 'Y', 'y' // no 조건 : 'n', 'N', 엔터
변경취소하였습니다.

성적관리> update
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {

    static Scanner keyScan = new Scanner(System.in);

    static boolean confirm1(String message) {
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();

        if (response.equals("y") || response.equals("yes") || response.equals(""))
            return true;
        return false;
    }

    static boolean confirm2(String message) {
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        response = keyScan.nextLine().toLowerCase();

        if (response.equals("y") || response.equals("yes"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        String input;

        ArrayList<Score> list = new ArrayList<>();

        Iterator<Score> iterator = list.iterator();

        label1:
        while (true) {
            System.out.print("성적관리> ");
            input = keyScan.nextLine();
            label2:
            if (input.equals("exit")) {
                break label1;
            } else if (input.equals("add")) {
                while (true) {
                    Score score = new Score();
                    score.add();
                    list.add(score);

                    if (!confirm1("계속입력 하시겠습니까?(Y/n) "))
                        break label2;
                }

            } else if (input.equals("list")) {
                for (int i = 0; i < list.size();i++) {
                    System.out.printf("%-4s, %4d, %6.1f\n",
                            list.get(i).name, list.get(i).sum, list.get(i).aver);
                }

            } else if (input.equals("view")) {
                System.out.print("이름? ");
                input = keyScan.nextLine();

                int i = 0;
                int count = 0;
                while (i < list.size()) {
                    if (input.equals(list.get(i).name)) {
                        count++;
                        break;
                    }
                    i++;
                }

                if (count > 0) {
                    System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", list.get(i).name, list.get(i).subjects[0],
                            list.get(i).subjects[1], list.get(i).subjects[2], list.get(i).sum, list.get(i).aver);
                } else {
                    System.out.println("'" + input + "'" + "의 성적정보가 없습니다.");
                }
                
            } else if (input.equals("delete")) {
                System.out.print("이름? ");
                input = keyScan.nextLine();
                if (confirm2("정말 삭제 하시겠습니까?(y/N) ")) {
                    int i = 0;
                    int count = 0;
                    while (i < list.size()) {
                        if (input.equals(list.get(i).name)) {
                            count++;
                            break;
                        }
                        i++;
                    }
                    if (count > 0) {
                        list.remove(i);
                        System.out.println("삭제하였습니다.");
                    } else {
                        System.out.println("'" + input + "'" + "의 성적정보가 없습니다.");
                    }
                }
                
            } else if (input.equals("update")) {
                System.out.print("이름? ");
                input = keyScan.nextLine();

                int i = 0;
                int count = 0;
                while (i < list.size()) {
                    if (input.equals(list.get(i).name)) {
                        count++;
                        break;
                    }
                    i++;
                }

                if (count > 0) {
                    System.out.print("국어?(" + list.get(i).subjects[0] + ")");
                    int tmpKor = keyScan.nextInt();
                    System.out.print("영어?(" + list.get(i).subjects[1] + ")");
                    int tmpEng = keyScan.nextInt();
                    System.out.print("수학?(" + list.get(i).subjects[2] + ")");
                    int tmpMath = keyScan.nextInt();
                    if (!confirm2("변경 하시겠습니까?(Y/n) ")) {
                        System.out.println("변경 취소하였습니다.");
                    } else {
                        list.get(i).subjects[0] = tmpKor;
                        list.get(i).subjects[1] = tmpEng;
                        list.get(i).subjects[2] = tmpMath;
                        System.out.println("'" + input + "'" + "의 성적정보가 반영되었습니다.");
                    }
                    
                } else {
                    System.out.println("'" + input + "'" + "의 성적정보가 없습니다.");
                }
            }
        }
    }
}
