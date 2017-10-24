
package bitcamp.java100.ch06.ex2.test1;

import java.io.Console;

public class Test {

    static Console console;
    
    static void prepareConsole() {
        console = System.console();
        if (console == null) {
            System.err.println("콘솔 지원 불가!");
            System.exit(1);
        }
    }

    static Score[] scores = new Score[10000];
    
    static void inputScore(Score score) {
        score.name = console.readLine("이름? ");
        score.kor = Integer.parseInt(console.readLine("국어점수? "));
        score.eng = Integer.parseInt(console.readLine("영어점수? "));
        score.math = Integer.parseInt(console.readLine("수학점수? "));
        
        score.sum = score.kor + score.eng + score.math;
        score.aver = score.sum / 3f;
    }
    
    static void printScore(Score score) {
        System.out.printf("%10s, %3d, %3d, %3d, %3d, %5.2f\n", 
                score.name,
                score.kor,
                score.eng,
                score.math,
                score.sum,
                score.aver);
    }
    
    static int cursor = 0;

    static void add(Score score) {
        if (cursor == scores.length) {
            System.err.println("저장 용량 초과");
            return; // void에서 return만 적으면 더 이상 실행하지 않고 나가겠다는 뜻
        }
        scores[cursor++] = score;
    }
    
    
    static int size() {
        return cursor;
    }
    
    static Score get(int index) {
        if (index < 0 || index >= cursor) {
            return null;
        }
        return scores[index];
    }
    
    static boolean confirm(String message) {
        String response = console.readLine(message).toLowerCase();
        if (response.equals("y") || response.equals("yes")) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        prepareConsole();
        
        while (true) {
            Score score = new Score();
            
            inputScore(score);
            
            add(score);

            if (!confirm("계속하시겠습니까?")) {
                break;
            }
            
        }
            for (int i = 0; i < size(); i++) { // size() => size() : 저장된 갯수 리턴
                printScore(get(i)); // 저장된 값을 리턴
            }
    }
}


















