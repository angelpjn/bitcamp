/*
   회원 가입 시 id, email 형식의 정합성을 어떻게 검증할 것인가?
   web 크롤링 시 필요한 값을 어떻게 추출해낼 것인가?
   기존 학습 내용을 활용할 시 수백라인 이상이 필요하며 그 코딩의 정합성 또한 불안정
   이 때, 사용되는 검증 식이 "정규식"
   특정 언어에 종속되지 않는다.
   정규식 = Regular Expression = re = RegEx
   - 어떻게 PK를 찾아낼 것인가?
   - 어떤 기준으로 출력 해낼 것인가?
   - 자바에서 "\"는 escape key를 사용하기 위한 예약어이므로 정규식의 \를 사용하기 위해서는 \\와 같이 두번 사용해야 함
   참조 API : java.util.regex.Pattern 클래스
 */

package bitcamp.java100;

public class Test18_6 {

    public static void main(String[] args) throws Exception {

    	String email = "hong@test.com";
    	
    	// match(정규표현식) : 정규표현식(Regular Expression)의 규칙과 맞는지 검사. true, false로 return
    	
    	System.out.println(email.matches("1hong@test.com"));

    	// . : 임의의 문자 한 개
    	// + : 한 개 이상 / * : 0개 이상 / ? : 0 또는 한 개
    	// \. : 그냥 dot 문자
    	System.out.println(email.matches(".+@.+\\..+"));

    	// \D : 숫자를 제외한 문자
    	System.out.println(email.matches("^\\D.+@.+\\..+"));
    	
    	System.out.println("--------------------------");
    	
    	String str = "홍길동(hong@test.com),임꺽정(leem@test.com)," + 
    				 "유관순(yoo@test.com),안중근(ahn@test.com),윤봉길(yoon@test.com)";
   
    	// \w : a-zA-Z_0-9
    	// 해당 문자열에서 주어진 규칙을 갖는 문자열을 찾아 출력 : 정규표현식 규칙 생성
    	java.util.regex.Pattern pattern = 
    			java.util.regex.Pattern.compile("\\w+@\\w+\\.\\w+");
    	// 정규식 규칙 따라 검사 수행 대상 객체 준비
    	java.util.regex.Matcher matcher = pattern.matcher(str);
    	
    	// matcher를 이용하여 규칙에 해당하는 문자열 검색
    	int startIndex = 0;
    	while (matcher.find(startIndex)) {
    		System.out.println(startIndex);
    		String matchString = matcher.group();
    		startIndex = matcher.end();
    		
    		System.out.println(matchString);
    	}
    }
}


















