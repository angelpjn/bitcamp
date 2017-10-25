// Score 객체의 주소를 저장하고 꺼내는 코드를 별도의 클래스로 분리!
// 기능 별 클래스 분류 과정 이해 및 연습
// 출력내용
// 홍길동, 100, 90, 80, 270, 90
// 임꺽정, 80, 80, 80, 240, 80
// 유관순, 100, 100, 100, 300, 100

//키보드로 성적 정보를 입력받아 저장하라!
//계속 저장 여부 물어보라!
//저장 완료 시 모든 성적을 출력하라!
import java.util.Scanner;

public class App {

 static boolean confirm(String message) {
     Scanner keyScan = new Scanner(System.in);
     System.out.print(message);
     String response = keyScan.nextLine().toLowerCase();

     if (response.equals("y") || response.equals("yes")) {
         return true;
     }
     return false;
 }

 
    public static void main(String[] args) {
        ScoreDao scoreDao = new ScoreDao();
         
        while (true) {
             
            Score score = new Score();
                 
            score.input();
                 
            scoreDao.scores[scoreDao.cursor++] = score;
             
        if (!confirm("계속 하시겠습니까? ")) {
            break;
        }
    }
     
    for (int i = 0; i < scoreDao.cursor; i++) {
        scoreDao.scores[i].print();
        }
    }
}