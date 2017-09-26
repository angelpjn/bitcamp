# 자바에서 값 표현(literal)하기 - 문자열 표현

## 관련 파일

```
Test11_12.java
```

## 문자열 표현

```
- 항상 큰 따옴표("")로 표현

  · 단 한개의 문자라 할 지라도 큰 따옴표로 표현
  ex.
      System.out.println("ABC");
      => ABC
      System.out.println("가각간");
      => 가각간
  
  · 자바는 문자열과 문자를 구분
  ex.
      System.out.println("가");
      => 가(문자열)
      System.out.println('가');
      => 가(문자)

  · 문자열 안에 이스케이프 문자 포함 가능
  ex.
      System.out.println("ABC\n가각간");
      => ABC
         가각간
      System.out.println("ABC\uAC00\uac00똘똠똥");
      => ABC가가똘똠똥

  · 빈 문자열 또한 문자열
  ex.
      System.out.println("");
      => 
```

### 변수 사용 및 printf()_Mission03

```

Q. 변수를 이용하여 이름, 국어, 영어, 수학, 총점, 합계를 
   저장하라!그런 후 다음과 같이 출력하라!

- 출력 내용:
  이름: 홍길동
  국어: 100
  영어: 100
  수학: 100
  총점: 300
  평균: 100.0

- 코딩 예 

public class App {

    public static void main(String[] args) {
        // 변수를 선언하여 값을 보관한다.
        String name = "홍길동";
        int kor = 100;
        int eng = 97;
        int math = 98;
        int sum = kor + eng + math;
        float aver = sum / 3.0f;

        System.out.printf("이름: %s\n", name);
        System.out.printf("국어: %d\n", kor);
        System.out.printf("영어: %d\n", eng);
        System.out.printf("수학: %d\n", math);
        System.out.printf("총점: %d\n", sum);
        System.out.printf("평균: %.1f\n", aver);
```