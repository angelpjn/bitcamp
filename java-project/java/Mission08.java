///* 
//
//# 과제_7
//- 배열 응용2 : Score 객체를 배열에 저장
//
//주어진 정보 : 
//홍길동 : 100, 80, 100
//임꺽정 : 90, 80, 100 
//유관순 : 80, 80, 100
//
//*/
//public class Mission08 {
//  
//	public static void main(String[] args) {
//	
//		class Score {
//			String name;
//			int[] subjects = new int[3];
//			int sum;
//			float aver;
//		}
//		/*
//		Score[] scores = new Score[3]; // new Scorep3[] => 레퍼런스를 3개 만들어라!
//		scores[0] = new Score();       // 그래서 각 배열별로 메모리 생성하도록 new Score()로 선언하는 것
//		scores[1] = new Score();
//		scores[2] = new Score();
//		*/
//		Score[] scores = {new Score(), new Score(), new Score()};
//		
//		
//		scores[0].name = "홍길동";
//		scores[0].subjects[0] = 100;
//		scores[0].subjects[1] = 80;
//		scores[0].subjects[2] = 100;
//		for (int sub : scores[0].subjects) {
//			scores[0].sum += sub;
//		}
//		scores[0].aver = scores[0].sum / 3f;
//		
//		scores[1].name = "임꺽정";
//		scores[1].subjects[0] = 90;
//		scores[1].subjects[1] = 80;
//		scores[1].subjects[2] = 100;
//		for (int sub : scores[1].subjects) {
//			scores[1].sum += sub;
//		}
//		scores[1].aver = scores[1].sum / 3f;
//		
//		scores[2].name = "유관순";
//		scores[2].subjects[0] = 80;
//		scores[2].subjects[1] = 80;
//		scores[2].subjects[2] = 300;
//		for (int sub : scores[2].subjects) {
//			scores[2].sum += sub;
//		}
//		scores[2].aver = scores[2].sum / 3f;
//		
//		for (Score s : scores) {
//			System.out.printf("%-4s ,%4d, %4d, %4d, %4d, %6.1f\n", s.name, s.subjects[0], s.subjects[1], s.subjects[2], s.sum, s.aver);
//		}
//		
//		
//	}
//}
