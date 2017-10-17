/* 

# 과제_7
- 배열 응용2 : Score 객체를 배열에 저장

주어진 정보 : 
홍길동 : 100, 80, 100
임꺽정 : 90, 80, 100 
유관순 : 80, 80, 100

*/

public class Mission02 {
  
	static void compute(Score score) {
		for (int sub : score.subjects) {
			score.sum += sub;
		}
		score.aver = score.sum / 3f;
	}
	
	static void print(Score score) {
		System.out.printf("%-4s ,%4d, %4d, %4d, %4d, %6.1f\n",
				score.name,
				score.subjects[0],
				score.subjects[1],
				score.subjects[2],
				score.sum,
				score.aver);
	}
	
	
	public static void main(String[] args) {
	
		Score[] scores = {new Score(), new Score(), new Score()};
		
		scores[0].name = "홍길동";
		scores[0].subjects[0] = 100;
		scores[0].subjects[1] = 80;
		scores[0].subjects[2] = 100;
		compute(scores[0]);

		
		scores[1].name = "임꺽정";
		scores[1].subjects[0] = 90;
		scores[1].subjects[1] = 80;
		scores[1].subjects[2] = 100;
		compute(scores[1]);
		
		scores[2].name = "유관순";
		scores[2].subjects[0] = 80;
		scores[2].subjects[1] = 80;
		scores[2].subjects[2] = 300;
		compute(scores[2]);
		
		for (Score s : scores) {
			print(s);
		}
	}
}
