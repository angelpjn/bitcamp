
package bitcamp.java100.test17;

public class Test17_7 {
	
//	ArrayList : 상자(순서대로 담는)
//	값을 추가할 때는 add 사용
//	추가 시 자동으로 크기 증가
	
	static java.util.ArrayList m1() {
		java.util.ArrayList list = new java.util.ArrayList();
		list.add("홍길동");
		list.add(20);
		list.add(false);
		list.add(4.12f);
		list.add('M');
		
		return list;
	}
	
    public static void main(String[] args) {
    	java.util.ArrayList a = m1();
    	
    	for (Object v : a) {  // Object : ArrayList를 for 문을 이용해서 출력하려고 레퍼런스 선언할 떄 사용하는 객체
    		System.out.println(v);
    	}
    }
}















