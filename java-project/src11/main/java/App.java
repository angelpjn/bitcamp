// 키보드로 성적 정보를 입력받아 저장하라!
// 계속 저장 여부 물어보라!
// 저장 완료 시 모든 성적을 출력하라!
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
        
        Score[] scores = new Score[100];
        int cursor = 0;
     
        while (true) {
            
//            scores[cursor] = new Score();
//            scores[cursor++].input();
            
            Score score = new Score();
            score.input();
            scores[cursor++] = score;
            
            if (!confirm("계속 하시겠습니까? ")) {
                break;
            }
        }
        
        for (int i = 0; i < cursor; i++) {
            scores[i].print();
        }
    }
}

