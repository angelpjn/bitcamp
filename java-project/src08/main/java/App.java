/* 

# 과제_8
- 클래스를 관리하기 쉽도록 별도의 파일로 분리하다. 
- 메서드를 사용하여 반복 코드를 분리한다.

주어진 정보 : 
홍길동 : 100, 80, 100
임꺽정 : 90, 80, 100 
유관순 : 80, 80, 100

*/
public class App {
  
	static void print(Score s) {
		compute(s);
		System.out.printf("%-4s ,%4d, %4d, %4d, %4d, %6.1f\n",
			s.name,
			s.subjects[0],
			s.subjects[1],
			s.subjects[2],
			s.sum,
			s.aver);
	}
	
	static void init(Score score, String name, int kor, int eng, int math) {
		score.name = name;
		score.subjects[0] = kor;
		score.subjects[1] = eng;
		score.subjects[2] = math;
	}
	
	static void compute(Score scores) {
		for (int sub : scores.subjects) {
			scores.sum += sub;
		}
		scores.aver = scores.sum / 3f;
	}
	
	public static void main(String[] args) {
	
		Score[] scores = {new Score(), new Score(), new Score()};
		
		init(scores[0], "홍길동", 100, 80, 100);
		
		init(scores[1], "임꺽정", 80, 80, 80);

		init(scores[2], "유관순", 100, 100, 100);
		
		for (Score s : scores) {
			print(s);
		}
		
		
	}
}
