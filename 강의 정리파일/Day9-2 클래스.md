# 클래스 

### 관련 파일

```
Test14_1.java ~ Test14_6.java
```

## 사용자 정의 데이터 타입 만들기_Ⅰ

```
- 학생의 성적 데이터를 저장할 수 있는 새로운 메모리 구조 정의

1) 새 데이터 타입을 선언
   class Score {

2) 메모리 구조를 정의한다.

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
        
3) 새 데이터 타입에 따라 만든 메모리의 주소를 저장할 변수 선언

   · 문법 : 메모리설계도명_즉_클래스명 레퍼런스명;
     Score r1;
     => Score 설계도에 따라 준비한 메모리의 주소를 저장

4) 사용자가 새로 정의한 데이터 타입에 따라 메모리를 준비
   
   · 문법 : new 메모리설계도명_즉_클래스명();
     r1 = new Score();
     => 설계도에 따라 만든 메모리를 "인스턴스"라 함

5) 레퍼런스를 사용하여 새 메모리에 값 넣기

   · 문법 : 레퍼런스명.내부메모리명 = 값;
     r1.name = "홍길동";
     r1.kor = 100;
     r1.eng = 98;
     r1.math = 95;
     r1.sum = r1.kor + r1.eng + r1.math;
     r1.aver = r1.sum / 3.0f;
     System.out.printf("%s %d %d %d %d %f\n", 
     r1.name, r1.kor, r1.eng, r1.math, r1.sum, r1.aver);
     => 홍길동 100 98 95 293 97.666666667

- 사용자 정의 데이터 타입

  · 여러 종류의 메모리를 묶어 만든 새로운 데이터 타입
  · 이를 위해 자바에서 제공하는 문법이 "class"

- 사용자 정의 데이터 타입 문법
  class 데이터타입명 {
      메모리 구조
   }

- 메모리 구조 문법
  변수 선언
  예) String name;
      int age;
      boolean working;
```

## 사용자 정의 데이터 타입 만들기_II

```
- 다음 정보를 저장할 새 데이터 타입을 정의하라!
  도서명, 저자, 출판사, 페이지, 가격($)

1) 사용자 데이터 타입 정의하기
   class Book {
                String title;
                String author;
                String press;
                int pageSize;
                double price;
   }

2) 새 데이터 타입에 따라 만든 메모리의 주소를 저장할 레퍼런스 변수 선언
   Book b1;

 3) 사용자가 새로 정의한 데이터 타입에 따라 메모리(인스턴스, 객체) 준비
    b1 = new Book();
    설계도에 따라 만든 메모리 => 인스턴스, 객체

4) 레퍼런스를 사용하여 새 메모리에 값 넣기
   · 레퍼런스를 통해 인스턴스(해당 메모리)를 찾아가 그 메모리 한 항목에 값 저장
   · 인스턴스의 각 변수를 "필드(field)"라 부름
      b1.title = "자바야 나 잡아봐라!";
      b1.author = "홍길동";
      b1.press = "비트출판사";
      b1.pageSize = 200;
      b1.price = 35.7;

5) 메모리에 들어 있는 값 출력
      System.out.printf("%s, %s, %s, %d, %f\n", 
      b1.title, b1.author, b1.press, b1.pageSize, b1.price);
      => 자바야 나 잡아봐라! 홍길동 비트출판사 200 35.7
```

## 사용자 정의 데이터 타입 만들기 III

```
- 다음 정보를 저장할 새 데이터 타입을 정의하라!
  비트캠프의 수강생 정보를 저장할 데이터 타입(자율)

1) 사용자 데이터 타입 정의하기
        class Student {
                String name;
                String tel;
                boolean gender;
                String schoolLevel;
                String schoolName;
                boolean working;
                int age;
                String postNo;
                String basicAddr;
                String detailAddr;
                String createdDate;
        }

2) 새 데이터 타입에 따라 만든 메모리의 주소를 저장할 변수 선언
        Student s1;

3) 사용자가 새로 정의한 데이터 타입에 따라 메모리를 준비하기
        s1 = new Student();

4) 레퍼런스를 사용하여 새 메모리에 값 넣기
   => 레퍼런스를 통해 인스턴스(해당 메모리)를 찾아가 그 메모리의 한 항목에 값 저장
   => 인스턴스의 각 변수를 "필드(field)"라 부름
        s1.name = "홍길동";
        s1.tel = "1111-1111";
        s1.age = 30;


5) 메모리에 들어 있는 값 출력
        System.out.printf("%s, %s, %d\n", s1.name, s1.tel, s1.age);
        => 홍길동 1111-1111 30
```

## 객체와 레퍼런스의 관계

```
- 메모리 설계도 : "클래스"
  예) Score 클래스
      class Score {
                   String name;
                   int kor;
                   int eng;
                   int math;
                   int sum;
                   float aver;
      }

- 설계도에 따라 준비한 메모리 : "인스턴스(instance)" 또는 객체
  예) new Score();
      메모리 주소를 변수에 저장 => "레퍼런스(reference)"
      예) 레퍼런스 s1

- 현업에서 s1 변수를 부르는 다양한 방법
  · Score 설계도에 따라 만든 메모리의 주소를 담는 변수
  · Score 설계도에 따라 만든 메모리의 레퍼런스
  · Score 클래스에 따라 만든 메모리의 레퍼런스
  · Score 클래스에 따라 만든 객체의 레퍼런스
  · Score 클래스에 따라 만든 인스턴스의 레퍼런스
  · Score 클래스의 객체 레퍼런스
  · Score 클래스의 인스턴스 레퍼런스
  · Score 객체의 레퍼런스
  · Score 인스턴스의 레퍼런스
  · Score 인스턴스
  · Score 객체 
    Score s1 = new Score();

- 필드(field)
  · 정의 : 레퍼런스를 통해 값을 저장하는 인스턴스의 내부 메모리 
  · 사용 예 : name, kor, eng 등
        s1.name = "홍길동";
        s1.kor = 100;
        s1.eng = 100;
        s1.math = 100;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.aver = s1.sum / 3.0f;

        System.out.printf("%s,%d,%d,%d,%d,%f\n", 
                s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);
        => 홍길동 100 100 100 300 100.0

- 레퍼런스 s1에 저장된 인스턴스 주소를 다른 레퍼런스에 복사
        Score s2 = s1;

- 레퍼런스 s1에 다른 객체(인스턴스)의 주소 저장
        s1 = new Score();
        
        s1.name = "임꺽정";
        s1.kor = 90;
        s1.eng = 90;
        s1.math = 97;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.aver = s1.sum / 3.0f;

- 결과
        System.out.printf("%s,%d,%d,%d,%d,%f\n", 
                s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);
        => 임꺽정 90 90 97 277 92.333336
        System.out.printf("%s,%d,%d,%d,%d,%f\n", 
                s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.aver);
        => 홍길동 100 98 95 293 97.667

- 설명 
  1)  처음 s1이 new Score();에 따라 해당 인스턴스의 레퍼런스가 되었으며 이 후,
      홍길동류 객체들을 정의 함으로써 s1은 홍길동류 객체들의 주소를 가지고 있었음

  2) Score s2 = s1;을 통해 s2 또한 홍길동류의 객체들의 주소를 가지고 있게 됨
     => 홍길동류의 객체들의 레퍼런스가 s1, s2 두 개

  3) s1 = new Score();를 또 한 번 실행 함으로써 s1은 다른 인스턴스의 레퍼런스가 됨

  4) s1에 임꺽정류의 객체들을 정의 함으로써 s1은 임꺽정류의 객체들의 주소를
     가지게 됨
     결과, s1은 임꺽정류 객체의 레퍼런스, s2는 홍길동류 객체의 레퍼런스가 됨
```

## 새로운 데이터 타입에 대해 사용할 연산자 만들기

```
- 새 클래스의 연산자 만드는 방법

1) 사용자 정의 데이터 타입
        class Score {
                String name;
                int kor;
                int eng;
                int math;
                int sum;
                float aver;

2) Score 메모리에 대해 사용할 새 연산자(operator) compute() 생성
   ※ operator = method = message = function
     
       void compute() {
                      sum = kor + eng + math;
                      aver = sum / 3.0f;
      }
      
      => 이 연산자는 Score 클래스에서 정의한 sum과 aver를 계산한 결과를 가짐

3) 연산자 실행( = 메서드 호출 = 메시지 전송)

        Score s1 = new Score();
        s1.name = "홍길동";
        s1.kor = 100;
        s1.eng = 100;
        s1.math = 100;
        s1.compute(); 

        System.out.printf("%s,%d,%d,%d,%d,%f\n", 
        s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);
        => 홍길동 100 100 100 300 100.0

        Score s2 = s1;
        s1 = new Score();
        s1.name = "임꺽정";
        s1.kor = 90;
        s1.eng = 90;
        s1.math = 97;
        s1.compute();

        System.out.printf("%s,%d,%d,%d,%d,%f\n", 
                s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);
        => 임꺽정 90 90 97 277 92.333

        System.out.printf("%s,%d,%d,%d,%d,%f\n", 
                s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.aver);
        => 홍길동 100 98 95 293 97.667
```

## 레퍼런스 배열

```

- 사용자 정의 데이터 타입
        class Score {
                String name;
                int kor;
                int eng;
                int math;
                int sum;
                float aver;

                void compute() {
                    sum = kor + eng + math;
                    aver = sum / 3.0f;

- 객체의 주소를 저장할 레퍼런스 배열 만들기 

        Score[] scores = new Score[3];
        new Score[3] 
        => Score 객체 주소를 담을 레퍼런스를 3개 준비
        => 객체들의 배열을 만드는 문법은 자바에 존재하지 않음
           Score[] scores
         => Score 레퍼런스 배열의 주소를 담을 변수

- 배열 레퍼런스를 이용하여 Score 객체의 주소 저장
  각 scores[] 들은 new Score();를 통해 개별 인스턴스들의 레퍼런스가 됨
        scores[0] = new Score();
        scores[1] = new Score();
        scores[2] = new Score();

- 배열 레퍼런스를 이용해 각 객체의 필드에 값을 저장
        scores[0].name = "홍길동";
        scores[0].kor = 100;
        scores[0].eng = 100;
        scores[0].math = 100;
        scores[0].compute();

        scores[1].name = "임꺽정";
        scores[1].kor = 90;
        scores[1].eng = 90;
        scores[1].math = 90;
        scores[1].compute();

        scores[2].name = "유관순";
        scores[2].kor = 100;
        scores[2].eng = 100;
        scores[2].math = 100;
        scores[2].compute();

- 반복문을 이용하여 배열 레퍼런스의 객체 값을 출력
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%s,%d,%d,%d,%d,%f\n",
                scores[i].name, 
                scores[i].kor, scores[i].eng, scores[i].math, 
                scores[i].sum, scores[i].aver);
        => 홍길동 100 100 100 300 100.0
           임꺽정 90 90 90 270 90.0
           유관순 100 100 100 300 100.0
```