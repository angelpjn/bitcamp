
package bitcamp.java100.test17;

public class Test17_14 {

	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("swap() : a = %d, b = %d\n", a, b);
	}
	
	static void swap2(int[] r) {
		int temp = r[0];
		r[0] = r[1];
		r[1] = temp;
		System.out.printf("swap2() : r[0] = %d, r[1] = %d\n", r[0], r[1]);
	}
	
    public static void main(String[] args){ // entry point(JVM이 메소드를 호출하는 진입점)
    										// new에 의해 생성된 메모리는 Heap에 생성, 
    	                                    // Heap에 생성되면 가비지가 되지 않는 한 사라지지 않음(Stack과의 차이)
    	int a = 5;
    	int b = 7;
    	
    	swap(a, b);
    	
    	System.out.printf("main() : a = %d, b = %d\n", a, b);
    	
    	int[] arr = new int[2];
    	arr[0] = 5;
    	arr[1] = 7;
    	
    	swap2(arr);

    	System.out.printf("main() : arr[0] = %d, arr[1] = %d\n", arr[0], arr[1]);
    }
}















