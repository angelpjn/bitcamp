//: ## ver 07
//: - 배열 응용 II
//: ver-06에서 Score 객체를 배열에 저장하라!
//: 
//: 여러 명의 성적을 저장하고 다음과 같이 출력하라!
//:
//: 출력내용:
//: ```
//: 홍길동, 100,  90,  80, 270,  90.0
//: 임꺽정,  80,  80,  80, 240,  80.0
//: 유관순, 100, 100, 100, 300, 100.0
//: ```
 
public class Mission03 {
	
	static void compute(Score score) {
        for (int sub : score.subjects) {
            score.sum += sub;
        }
        score.aver = score.sum / 3f;
	}
	
	static void print(Score s) {
        compute(s);
		System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                s.name, s.subjects[0], s.subjects[1], s.subjects[2], s.sum, s.aver);

	}
	
	static void init(Score scores, String name, int kor, int eng, int math) {
		scores.name = name;
		scores.subjects[0] = kor;
		scores.subjects[1] = eng;
		scores.subjects[2] = math;
	}

    public static void main(String[] args) {
        
        Score[] scores = {new Score(), new Score(), new Score()};
        
        init(scores[0], "홍길동", 100, 90, 80);

        init(scores[1], "임꺽정", 80, 80, 80);
        
        init(scores[2], "유관순", 100, 100, 100);
        
        for (Score s : scores) {
            print(s);
        }
        
        
    }
}




