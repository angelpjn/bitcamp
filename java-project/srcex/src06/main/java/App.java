/* 

# 과제_6
- 배열 응용 : 코드의 직관성 저하하나, 유지보수의 편의성 제고

주어진 정보 : 
홍길동 : 100, 80, 100
임꺽정 : 90, 80, 100
유관순 : 80, 80, 100

*/
public class Mission06 {
  
	public static void main(String[] args) {
	
		class Score {
			String name;
			int[] subjects = new int[3]; // new int[3] : int 정보 저장할 레퍼런스를 3개 만들라!
			int sum;
			float aver;
		}
		
		Score s1 = new Score(); // new Score()는 메모리를 준비하는 것(이게 먼저다)
		s1.name = "홍길동";
		s1.subjects[0] = 100;
		s1.subjects[1] = 80;
		s1.subjects[2] = 100;
		for (int sub : s1.subjects) {
			s1.sum += sub;
		}
		s1.aver = s1.sum / 3f;
		
		Score s2 = new Score();
		s2.name = "임꺽정";
		s2.subjects[0] = 90;
		s2.subjects[1] = 80;
		s2.subjects[2] = 100;
		for (int sub : s2.subjects) {
			s2.sum += sub;
		}
		s2.aver = s2.sum / 3f;
		
		Score s3 = new Score();
		s3.name = "유관순";
		s3.subjects[0] = 80;
		s3.subjects[1] = 80;
		s3.subjects[2] = 300;
		for (int sub : s3.subjects) {
			s3.sum += sub;
		}
		s3.aver = s3.sum / 3f;
		
		System.out.printf("%-4s ,%4d, %4d, %4d, %4d, %6.1f\n", s1.name, s1.subjects[0], s1.subjects[1], s1.subjects[2], s1.sum, s1.aver);
		System.out.printf("%-4s ,%4d, %4d, %4d, %4d, %6.1f\n", s2.name, s2.subjects[0], s2.subjects[1], s2.subjects[2], s2.sum, s2.aver);
		System.out.printf("%-4s ,%4d, %4d, %4d, %4d, %6.1f\n", s3.name, s3.subjects[0], s3.subjects[1], s3.subjects[2], s3.sum, s3.aver);
		
	}
}
