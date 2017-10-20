
package bitcamp.java100.ch02.test15;

public class Test15_10 {
    public static void main(String[] args){
    	int v1 = 0b0101_1100;
    	int v2 = 0b0110_0110;
    	
//    	&&는 논리연산자이므로 boolean에서만 사용 가능
//    	int result = v1 && v2;
    	
//    	논리곱 (AND) : & => 두개의 값이 같을 때 1, 다를 때 0
    	int result = v1 & v2;
    	System.out.println(java.lang.Integer.toBinaryString(result));

//    	논리합 (OR) : | => 둘 중 하나 이상 1이면 1, 둘 다 0이면 0
    	result = v1 | v2;
    	System.out.println(java.lang.Integer.toBinaryString(result));
   
//    	배타적 논리곱 Eclusive OR(XOR) : ^ => 두개의 값이 다를때 1, 같으면 0
    	result = v1 ^ v2;
    	System.out.println(java.lang.Integer.toBinaryString(result));
    	
//    	부정 (NOT) : ~ => 반대 숫자 출력. 연산 기본이 4byte이므로 32개 기준
    	result = ~v1;
    	System.out.println(java.lang.Integer.toBinaryString(result));
    	
    }
}