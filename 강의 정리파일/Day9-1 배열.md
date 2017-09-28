# 배열

### 관련 파일

```
Test13_1.java ~ Test13_7.java
```

## 배열 미사용 vs 사용

```
- 국어, 영어, 수학, 사회, 과학, 도덕, 중국어 점수를 저장할 변수를 만들라!

  1) 배열 미사용

     int kor, eng, math, soc, sci, eth, chi;
     kor = 100;
     eng = 100;
     math = 100;
     soc = 100;
     sci = 100;
     eth = 100;
     chi = 100;
        
     System.out.println(kor);
     System.out.println(eng);
     System.out.println(math);
     System.out.println(soc);
     System.out.println(sci);
     System.out.println(eth);
     System.out.println(chi);

  2) 배열 사용
  
     int[] scores = new int[7];
     scores[0] = 100;
     scores[1] = 100;
     scores[2] = 100;
     scores[3] = 100;
     scores[4] = 100;
     scores[5] = 100;
     scores[6] = 100;

     for (int i = 0; i < 7; i++) {
            System.out.println(scores[i]);

    => 배열의 사용을 통해 손 쉽게 같은 종류의 메모리 생성 가능
       for() 반복문과의 결합을 통해 쉽게 변수 값을 다룰 수 있음
        // 여기에 for() 반복문을 결합하면 변수의 값을 다루기 더욱 쉬워진다.
           
```

## 배열 선언

```
- 레퍼런스(reference) : 배열의 주소를 저장하는 변수
  int[] arr1; -> JAVA의 표기법
  int arr2[]; -> C언어 표기법

- arr1, arr2는 배열 메모리의 주소를 저장하는 변수이므로 일반적인 정수 값 저장 불가
  
  컴파일 오류 예
  arr1 = 100;
  arr2 = 100;
  
  ※ c/c++은 바로 배열 생성 가능
    int scores[7]; <== 자바에서는 불가하다!

- 배열 만들기

  · 문법 : new 데이터타입[개수]
  · 배열 메모리 준비 후 그 주소를 보관해두어야만 나중에 다시 해당 메모리 사용 가능

    arr1 = new int[3];
    arr2 = new int[4];

    => arr1은 int[3] 배열의 주소를 가지고 있으며, arr2는 int[4] 배열의 주소를 가지고 있는 각 배열의 레퍼런스

    ※ 배열이 아닌 배열의 주소만을 가지고 있음에 유의할 것

- 배열 사용

  · 배열주소변수[인덱스] = 값;
  · 배열의 인덱스는 0부터 시작 
  · 인덱스 범위 : 0 ~ (배열크기 - 1)

  ex.
    arr1[0] = 100;
    arr1[1] = 90;
    arr1[2] = 80;
    System.out.printf("%d,%d,%d\n", arr1[0], arr1[1], arr1[2]);

    arr2[0] = 100;
    arr2[1] = 200;
    arr2[2] = 300;
    arr2[3] = 400;
    System.out.printf("%d,%d,%d,%d\n", arr2[0], arr2[1], arr2[2], arr2[3]);
```

## 배열의 길이와 인덱스

```
- 배열 레퍼런스 선언
    int[] arr1;
    
- 배열 생성
    arr1 = new int[3];

- 배열의 크기 확인
  · 모든 배열 레퍼런스는 'length'라는 내부 변수를 가짐
  · length : 배열의 크기 정보를 가진 내부 변수
  · 배열 생성 시 자동으로 생성되는 내부 변수 
  · System.out.println(arr1.length);
    => 3
  · 프로퍼티(property) : 레퍼런스 변수를 통해 사용하는 내부 변수

- 배열 사용 시 유효한 인덱스를 지정해야 함
   arr1[0] = 100;
   arr1[1] = 90;
   arr1[2] = 80;
   인덱스 범위를 벗어날 시 실행 오류 발생(컴파일 오류 미발생)
   arr1[-1] = 200;
   arr1[3] = 300;
```

## 배열 초기화

```
- 배열 레퍼런스 선언과 동시에 배열 생성
   int[] arr1 = new int[3];

- 배열 생성과 동시에 값 초기화 

  · 방법1 : 초기화 개수만큼 배열 생성
     int[] arr2 = new int[] {100, 90, 80}; 

  · 방법2 : 선 레퍼런스 생성 후 배열 생성
     int[] arr3;
     arr3 = new int[] {90, 80, 70};    

  · 방법3 : new int[] 선언 생략(new 명령어 : 메모리를 생성하라!)
     int[] arr4 = {100, 200, 300};
    
    ※ 레퍼런스 선언과 동시에 값을 초기화 시에만 new int[] 생략 가능
      컴파일 오류의 예
      int[] arr5;
      arr5 = {100, 200, 300};
```

## 다양한 데이터 타입의 배열

```
- java primitive data type 배열

- 기본 타입을 가진 배열

  · int[] arr1 = {100, 100, 90};
  · byte[] arr2 = {10, 20, 30};
  · short[] arr3 = {12000, 22000, 25000};
  · long[] arr4 = {10L, 20L, 30L};
  · float[] arr5 = {3.14f, 2.45f, 345.94f};
  · double[] arr6 = {3.14, 2.45, 345.94};
  · boolean[] arr7 = {true, true, false, true};
  · char[] arr8 = {'홍', '길', '동'};
        
- 문자열 배열 : 기본 타입 이외의 배열, 기본 타입 표현 불가 시 활용.

  · String[] names = {"홍길동", "임꺽정", "유관순"};
```

## 객체(object)와 가비지(garbage)

```
- 배열의 주소를 저장하는 변수
  · 레퍼런스(reference)
  · 사용 예 : int[] arr1;

- 인스턴스(instance) 또는 객체(object)
  · new 명령으로 준비된 메모리
  · 사용 예 : arr1 = new int[3]; 

- 가비지(garbage)
  · 새 배열 메모리 생성 -> arr1 레퍼런스에 주소 저장
    -> 기존 배열의 주소 분실
    -> 기존 배열 메모리 사용 불가
    => 메모리만 차지하고 사용할 수 없는 기존 인스턴스를 의미
  · Dangling(흔들흔들 거리는 것) Object라고도 표현

- 가비지 콜렉터(Garbage Colletor)
  · 가비지가 차지한 메모리를 다시 사용할 수 있도록 가비지를 제거하는 내부 프로그램
  · 작업 수행 시기
    => JVM이 사용할 메모리 부족 시 OS에 새 메모리 요청 전
       자신의 메모리 정리(대다수)
    => CPU가 한가할 시 : 24시간 365일 멈추지 않는 CPU의 경우 수행(일부)

- Garbage Collector 방식의 문제점
  · 가비지 컬렉트 메모리 청소 수행 전까지 일정 시간 쓰지 못하는 상태의 
    메모리 유지 => 효율적 메모리 사용 방해
  · 현대의 메모리 비용은 저렴하므로 비용 대비 관리 측면에 이점 존재
  · 관리 용이 > 비용 
```

## 값(value)과 레퍼런스(reference)

```
- 값을 저장하는 변수
  int a = 100;
  int b;
  b = a; => a의 값을 b에 저장
  => a와 b는 다른 메모리이므로 b 변수의 값을 변경해도 a 변수는 영향을 받지 않음

- 주소를 저장하는 변수 : 레퍼런스
  · int[] arr1 = {100, 200, 300};
  · int[] arr2;

  · arr2에 arr1에 들어있는 주소 저장 
    : arr2 = arr1;

- 주소를 사용하여 두 변수가 같은 메모리를 다룰 수 있음
  · arr2[1] = 50;
    System.out.printf("%d, %d, %d\n", arr1[0], arr1[1], arr1[2]);
```