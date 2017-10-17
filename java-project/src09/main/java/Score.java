// 상속은 class의 생성 목적이 아니라 단순한 클래스 활용의 예 중 하나

public class Score {
    String name; // name이라는 변수를 만들 메모리를 만들라는 명령어.
    int[] subjects = new int[3]; // int 배열 3칸을 만들 레퍼런스 subjects를 만들기 위한 메모리를 만들라는 명령어.
    int sum;
    float aver;
    // 이 들의 실행은 App의 main() 중 "Score[] scores = {new Score(), new Score(), new Score()};"의
    // new Score() 시 실행
    
    static void compute(Score score) {
        for (int sub : score.subjects) {
            score.sum += sub;
        }
        score.aver = score.sum / 3f;
    }
    
    static void print(Score score) {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                score.name, 
                score.subjects[0], 
                score.subjects[1], 
                score.subjects[2], 
                score.sum, 
                score.aver);
    }
    
    static void init(Score score, String name, int kor, int eng, int math) {
        score.name = name;
        score.subjects[0] = kor;
        score.subjects[1] = eng;
        score.subjects[2] = math;
        
        compute(score);
    }
}
