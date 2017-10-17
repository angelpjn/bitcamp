
package bitcamp.java100;

public class Test16_7 {
    public static void main(String[] args) {
    	System.out.println("· for (:) 문 사용법_String 배열 : ");
//    	형식 : for(레퍼런스 선언 : 배열 or 콜렉션 객체) 명령문;
    	
    	String[] names = {"홍길동", "임꺽정", "유관순", "안중근", "윤봉길"};
    	
    	for (String n : names) // 무조건 전체 반복. 무조건 객체 안에서 선언, for문 종료시 삭제
    		System.out.println(n);
    	System.out.println();
    	
    	System.out.println("· for (:) 문 사용법_int 배열 : ");    	
    	int[] kor = {100, 90, 80, 90, 50, 80};
    	
    	for (int score : kor)
    		System.out.println(score);
    	System.out.println();
    	
    	System.out.println("· for (:) 문 사용법_ArrayList 컬렉션 객체에서 값 꺼내기 : 입력 순서 기준 출력");    	
    	java.util.ArrayList<String> list = new java.util.ArrayList<>();
    	list.add("홍길동");
    	list.add("임꺽정");
    	list.add("유관순");
    	list.add("안중근");
    	list.add("윤봉길");
    	list.add("홍길동");
    	list.add("임꺽정");
    	
    	for (String n : list) {
    		System.out.println(n);
    	}
    	System.out.println();  
    	
    	System.out.println("· for (:) 문 사용법_Set 컬렉션 객체에서 값 꺼내기 : HashCode 기준 출력");    	
    	java.util.HashSet<String> set = new java.util.HashSet<>();
    	set.add("홍길동");
    	set.add("임꺽정");
    	set.add("유관순");
    	set.add("안중근");
    	set.add("윤봉길");
    	set.add("홍길동");
    	set.add("임꺽정");
    	
    	for (String n : set) {
    		System.out.println(n);
    	}
    	System.out.println();    	
    }
}


























