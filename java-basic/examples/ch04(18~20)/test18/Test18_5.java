
package bitcamp.java100.test18;

public class Test18_5 {

    public static void main(String[] args) throws Exception {
    	
    	// String 클래스 인스턴스 메서드
    	
    	String s1 = "ABC가각간";
    	
    	// replace() => 기존 문자열 중 해당 문자열 교체 후 새 String 인스턴스 생성
    	String s2 = s1.replace("BC", "하하하");
    	
    	System.out.println(s1);
    	System.out.println(s2);
    	
    	// charAt(위치번호_index(0~)) : 문자열에서 특정 위치의 문자를 찾아 리턴
    	System.out.println(s1.charAt(4));
    	
    	s1 = "ABBCDEBBFGH";

    	// indexOf(찾을 문자열) : 찾을 문자열과 동일한 최초 문자열의 시작 인덱스 리턴
    	System.out.println(s1.indexOf("BB"));
    	
    	// lastIndexOf(찾을 문자열) : 찾을 문자열과 동일한 최종 문자열의 시작 인덱스 리턴
    	//                            찾을 문자열에 대상 문자열에 없는 문자열 또는 값 입력 시 "-1" return
    	System.out.println(s1.lastIndexOf("BB"));
    	
    	// substring(추출할 문자열의 시작 인덱스) : 지정한 인덱스의 문자부터 끝까지 추출
    	System.out.println(s1.substring(3));
    	
    	// substring(추출할 문자열의 시작 인덱스, 끝 인덱스) :
    	// 시작 인덱스 문자 ~ 끝 인덱스 바로 직전 문자까지 추출
    	// 아래는 3, 4, 5문자 추출
    	System.out.println(s1.substring(3,6));
    	
    	s1 = "홍길동";
    	
    	// startsWith(시작 문자열) : 주어진 문자열로 시작하는지 검사. true, false로 return
    	System.out.println(s1.startsWith("홍길"));
    	System.out.println(s1.startsWith("길"));
    	
    	// endsWith(끝 문자열) : 주어진 문자열고 끝나는지 검사. true, false로 return
    	System.out.println(s1.endsWith("동"));
    	System.out.println(s1.endsWith("원"));
    	
    	s1 = "홍길동,유관순,임꺽정,안중근,윤봉길,이육사,윤동주";
    	
    	// contains(포함 문자열) : 주어진 문자열이 있는지 검사. true, false로 return
    	System.out.println(s1.contains("꺽정"));
    	System.out.println(s1.contains("김꺽정"));
    	
    	String s3 = "ABC";
    	String s4 = "가각간";
    	
    	// concat(추가할 문자열) : 해당 문자열에 주어진 문자열을 추가하여 새 String 인스턴스 생성
    	System.out.println(s3.concat(s4));
    	
    	// 절대 String instance의 값은 변경되지 않음
    	System.out.println(s3);
    	System.out.println(s4);
    	
    	s3 = new String("탕수육");
    	s4 = new String("탕수육2");
    	String s5 = new String("탈수육");
    	String s6 = new String("탕수육");
    	
    	// 문자열1.compareTo(문자열2) : 두 문자열을 비교하여 같으면 0 return
    	// 문자열1이 문자열 2보다 알파벳/가나다 순서에서 앞서면 음수(-1) return
    	// 문자열1이 문자열 2보다 알파벳/가나다 순서에서 뒤면 양수 return 
        // 값음 의미 없음
    	System.out.println(s3.compareTo(s6));
    	System.out.println(s3.compareTo(s4));
    	System.out.println(s3.compareTo(s5));
    	
    	s1 = "홍길동";
    	s2 = "";   // 빈문자열 => String 객체
    	s3 = null; // 인스턴스가 없는 것 => 아예 String 인스턴스가 생성되지 않음
                   // => s2와 s3는 완전이 다른 것.
    	
    	// isEmpty() : String 인스턴스에 저장된 문자열이 비어 있는지 검사
    	System.out.println(s1.isEmpty());
    	System.out.println(s2.isEmpty());
//    	System.out.println(s3.isEmpty()); => 컴파일 오류. isEmpty()는 String 인스턴스에 저장된 문자열이 
    	                                  // 비어 있는지를 검사하는 것이므로.
    	
    	// length() : String 인스턴스에 저장된 문자의 개수를 리턴
    	System.out.println(s1.length());
    	System.out.println(s2.length());
//    	System.out.println(s3.length()); // 인스턴스가 없으므로 실행 오류
    	
    	s1 = "홍길동,유관순,,임꺽정,안중근,윤봉길,이육사,윤동주";

    	// split(구분자) : 해당 문자열을 구분자로 분리하여 String[] 배열 만들어 리턴
    	String[] arr = s1.split(",");
    	for (String s : arr) {
    		System.out.print(s);
    		System.out.print("-");
    	}
    	System.out.println();
    	
    	// 구분자 없을 시. 통째로 배열에 담아 리턴
    	arr = s1.split(" ");
    	System.out.println(arr.length);
    	System.out.println(arr[0]);
    	
    	s1 = "";
    	arr = s1.split(",");
    	System.out.println(arr.length);
    	System.out.println(arr[0]);
    	
    	s1 = "Hong Gil Dong";
    	
    	// 문자열레퍼런스.toLowerCase(); : 해당 레퍼런스의 문자열을 모두 소문자로 변경 하여 
    	//                                 새 String 인스턴스 생성 후 해당 인스턴스의 레퍼런스 리턴
    	System.out.println(s1.toLowerCase());
    	
    	// 문자열레퍼런스.toUpperCase(); : 대문자로 변경
    	System.out.println(s1.toUpperCase());
    	
    	s1 = "  \t홍\t길 동 \n입니다. \n\n\n\t\n";
    	
    	// trim() : 문자열의 양 끝 공백 제거(중간 공백(white space)_"스페이스바, 탭, 엔터"는 제거하지 않음)
    	System.out.print(">");
    	System.out.print(s1.trim());
    	System.out.println("<");
    	
    	s1 = "ABC\n가각간\n똘똠똥";
    	
    	// getBytes("문자집합 코드(UTF-8)") : 파일 저장 시나 network로 전송 시 사용한다.
    	//              데이터는 byte 배열 전송이 원칙(char[]을 사용하지 않는다.)
    	//              해당 문자열을 바이트 배열로 만들어 리턴. 
    	//              바이트 배열의 저장 값은 JVM에 설정된 문자집합 코드 값.
    	//              설정 값 없을 시 OS의 기본 문자 집한 사용. 그러므로 윈도우는 아래거 써야 함.
    	//              그러니 그냥 배열 명시하여 사용하는게 좋다.
    	byte[] bytes = s1.getBytes();
    	for (byte b : bytes) {
    		System.out.print(Integer.toHexString(b & 0x00ff));
    		System.out.print(" ");
    	}
    	System.out.println();
    	
    	bytes = s1.getBytes("UTF-8");
    	for (byte b : bytes) {
    		System.out.print(Integer.toHexString(b & 0x00ff));
    		System.out.print(" ");
    	}
    	System.out.println();
    	
    	// String 클래스 메서드
    	
    	
    	// valueOf(값) : 주어진 값의 String 인스턴스 생성 
    	s1 = String.valueOf(true);
    	s2 = String.valueOf(3.14);
    	s3 = String.valueOf(100);
    	
    	System.out.println(s1);
    	System.out.println(s2);
    	System.out.println(s3);
    	
    	// 문자열 특별 연산자 "+" : 두 문자열 연결하여 새 String 인스턴스 생성
    	s1 = "ABC";
    	s2 = "가각간";
    	s3 = s1 + s2;
    	
    	System.out.println(s1);
    	System.out.println(s2);
    	System.out.println(s3);
    	
    	
    }
}


















