
package bitcamp.java100;

public class Test17_6 {

	static int[] m1() {  // => return type(여기서는 int[])에 primitive type을 제외한 타입은 레퍼런스를 return하는 것 
		int[] values = {100, 90, 80};
		
		int[] values2;
//		values2 = {100, 90, 80}; => 컴파일 오류. 반드시 new 연산자와 함께. ↓ 아래처럼 초기화
		values2 = new int[] {100, 90, 80};
		
//		return {100, 90, 80}; => 얘도 마찬가지. new 연산자가 없어서 컴파일 오류. ↓ 아래처럼 초기화
		return new int[] {100, 90, 80};
	}
	
    public static void main(String[] args) {
    	
    	int[] arr = m1();
    	for (int i : arr) {
    		System.out.println(i);
    	}
    }
}















