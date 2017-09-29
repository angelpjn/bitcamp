# 연산자 

### 관련 파일

```
Test1t_1.java ~ 
```

## 산술연산자 사용법

```
- [+, -, *, /, %] 등 기본 산술 연산자의 사용 방법

System.out.printf("10 + 20 = %d\n", 10 + 20);
=> 30
System.out.printf("10 - 20 = %d\n", 10 - 20);
=> -10
System.out.printf("10 * 20 = %d\n", 10 * 20);
=> 200

- 연산규칙

  · 연산은 항상 같은 타입끼리만 가능
  · 다른 타입과 연산 불가
  · 연산 결과는 피연산자와 같은 타입
  · 피 연산자가 int일 경우, 결과도 int

  ex. 실행 오류 예
      System.out.printf("5 / 2 = %f\n", 5 / 2);
  ex. 나눗셈 결과 int
      System.out.printf("5 / 2 = %d\n", 5 / 2);
      => 2

  · 형식 문자열(format string) 작성 시 %를 사용하므로 일반 문자로 %
    출력 시 %%로 입력
    System.out.printf("5 %% 2 = %d\n", 5 % 2);
    => 5 % 2 = 1
```
## 정수의 기본 연산 단위

```
- 정수의 기본 연산 단위는 int

- byte, short의 연산 결과 또한 int
  byte b1 = 10;
  byte b2 = 20;

- 암시적 형변환 : 자바 기본 연산단위가 int이므로 byte나 short의 값 계산 시
  내부에서 int형 임시 메모리를 만들어 byte나 short의 값을 복사하여 계산 수행
  그러므로 b1과 b2의 연산 결과 또한 int가 됨

  컴파일 오류의 예
  byte b3 = b1 - b2;
  연산 결과를 byte형 변수에 담을 수 없다.

- 결과 타입 보다 큰 메모리 형의 변수는 가능
  사용 예
  short s1 = 10;
  short s2 = 20;
  int r = s1 + s2;
  long r2 = s1 + s2;
```

## 다른 타입의 변수와 연산하기

```
- 변수 생성
        byte b1 = 20, b2 = 22 ;
        short s1 = 30, s2 = 33;
        int i1 = 40, i2 = 44;
        long l1 = 50, l2 = 55;
        float f1 = 3.14f, f2 = 45.32f;
        double d1 = 4567.8988, d2 = 9876.5432;

- byte vs short vs int
  · 두 타입의 값이 자동으로 int 임시 메모리에 저장 후 계산 수행
    -> 계산 결과도 int
    int r1 = b1 + s1;
    r1 = b1 + i1; => byte 변수 b1의 값 20을 int 임시 메모리에 저장
    r1 = i1 + s1; => short 변수 s1의 값 30을 int 임시 메모리에 저장

    즉, 변수의 타입이 변경되는 것이 아니라 int형 임시 메모리에 해당 변수의 값이 저장되는 것이며 이를 일반적으로 "int로 변했다"라 표현

- byte, short, int vs long

  · byte, short, int의 값을 long형 임시 메모리에 저장하여 서로 타입을 맞춘 후
    계산 수행

    컴파일 오류 예 : 계산 결과 long(r1은 int형)
    int r1 = i1 + l1;
    r1 = b1 + l1;
    r1 + s1 + l1;

    정상 예
    long r2 = i1 + l1;
    r2 = b1 + l1;
    r2 = s2 + l1;

- byte, short, int, long vs float

  · 정수 타입이 부동소수점의 임시 메모리에 저장된 후 계산을 수행

    컴파일 오류 예 : 계산 결과 float(r3은 long형)
    long r3 = b1 + f1;
    r3 = s1 + f1;
    r3 = i1 + f1;
    r3 = l1 + f1;

    정상 예 : 계산 결과 float(r4도 float형)
    float r4 = b1 + f1; // OK
    r4 = s1 + f1;
    r4 = i1 + f1;
    r4 = l1 + f1;
    
    ※ 주의!
      · float의 허용 가능 크기인 7자리를 넘는 경우 발생 가능
      · 넘어간 값이 잘린 결과를 리턴하므로 계산 결과를 확인해야 함
      · 8byte long type 값을 4byte float 메모리에 저장 시 잘린 발생 확률 大
      · float은 주의하여 사용해야 함

- byte, short, int, long, float vs double

  · double로 계산 결과 변환_1
    float r5 = f1 + d1;
    => 컴파일 오류는 발생하지 않음

  · double로 계산 결과 변환_2
    double r6 = f1 + d1;
    r6 = b1 + d1;
    r6 = s1 + d1;
    r6 = i1 + d1;
    r6 = l1 + d1;

- 암시적 형변환(implicit type conversion/casting) 규칙

  · byte,short => int => long => float => double
  · 왼쪽 타입과 오른쪽 타입 연산 시, 왼쪽 타입의 값이 오른쪽 타입으로 자동 변환

- 암시적 형변환에 의해 해결이 안되는 케이스
  
  double d1;
  float f1 = 3.141592;
  int i1 = 7654321;
  d1 = f1 + i1;
  System.out.println(d1);
  => 7654324.0

  => 할당연산자(=)을 수행하여 double 형 변수 d1에 대입하기 전 f1 + i1의 계산 결과값이 이미 float형으로 종료하므로 7자리에서 출력후 나머지 값 잘림.
  => 이와 같이 암시적 형변환으로 해결되지 않는 케이스에 명시적 형변환 사용
  ```