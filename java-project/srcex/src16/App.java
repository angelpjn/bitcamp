//: ## ver 16
//: - 학습목표
//:   - Generic 문법 사용
//: 
//: 
//: 여러 명의 성적을 저장하고 다음과 같이 출력하라!
//:
//: 출력내용:
//: ```
//: 홍길동, 100,  90,  80, 270,  90.0
//: 임꺽정,  80,  80,  80, 240,  80.0
//: 유관순, 100, 100, 100, 300, 100.0
//: ```


import java.util.Scanner;
 
public class App {
    
    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if (response.equals("y") || response.equals("yes"))
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        
        ArrayList<Score> list = new ArrayList<>();
        
        while (true) {
            Score score = new Score(); // 성적 데이터를 저장할 빈 객체를 준비한다.
            score.input(); // 사용자로부터 입력받은 데이터를 빈 객체에 저장한다.
            
            list.add(score);

            if (!confirm("계속하시겠습니까? "))
                break;
        }
        
        for (int i = 0; i < list.size(); i++) {
//            ((Score)list.get(i)).print();
            (list.get(i)).print();
        }
    }
}




