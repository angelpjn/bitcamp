
package bitcamp.java100.test17;

public class Test17_15 {

	static int m1() {
		int a = 100;
		int b = 200;
		int c = a + b;
		return c; 
	}
	
	static int[] m2() {
		int[] arr = new int[3]; // arr : 주소 저장 로컬변수 / new int[3] : Heap에 생성된 배열(arr[0]~arr[2] / 100~300)
								// 메모리 부족 시 OS에 메모리 할당 재요청 전 가비지 콜렉터에 의해 제거)
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		return arr; // => 배열의 주소 리턴
	}
	
    public static void main(String[] args){ 
    	int r1 = m1();
    	
//    	※ m1()에서 만든 로컴 변수에 접근 불가
//    	a = 300;
//    	b = 300;
//    	c = 300;
    	
    	System.out.println(r1);
    	
    	System.out.println("---------------------------------------------------");
    	
    	int[] r2 = m2();
    	for (int i : r2) {
    		System.out.println(i);
    	}
    }
}















