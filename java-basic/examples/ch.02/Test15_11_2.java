
package bitcamp.java100;

/*
파일 정보 저장_배열을 이용하여 처리(메모리 절약, 가독성 떨어짐)
- 저장 대상 : 디렉토리여부, 소유주, 그룹, 기타 사용자의 사용 권한(읽기, 쓰기, 실행) 정보
*/

  
public class Test15_11_2 {
    public static void main(String[] args){

    	boolean [] arr = new boolean[10];
    	
		arr[0] = false;
		arr[1] = true;
		arr[2] = true;
		arr[3] = true;
		arr[4] = true;
		arr[5] = true;
		arr[6] = false;
		arr[7] = true;
		arr[8] = true;
		arr[9] = false;

		
		
		System.out.print(arr[0] ? "d" : "-");
		System.out.print(arr[1] ? "r" : "-");
		System.out.print(arr[2] ? "w" : "-");
		System.out.print(arr[3] ? "x" : "-");
		System.out.print(arr[4] ? "r" : "-");
		System.out.print(arr[5] ? "w" : "-");
		System.out.print(arr[6] ? "x" : "-");
		System.out.print(arr[7] ? "r" : "-");
		System.out.print(arr[8] ? "w" : "-");
		System.out.print(arr[9] ? "x" : "-");
		System.out.println();
    }
}