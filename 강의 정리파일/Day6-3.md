# print(), println(), printf()

## 관련 파일

```
Test10_3.java, Test10_4.java
```

## print() 

```
=> 출력 이후 줄바꿈 이호 붙지 않음

ex. 
    System.out.print("홍길동");
    System.out.print("임꺽정");
```

## println()

```
=> 출력 이후 줄바꿈 기호 붙음(CRLF)

ex. 
    System.out.println("홍길동");
    System.out.println("임꺽정");
```

## printf()

```
=> printf(): 특정 형식의 문자열을 만들어 출력한다.

- 형식
   %[argument_index$][flags][width][.precision]conversion

ex. 
    System.out.printf("%4$2s,%3$3s,%2$4s,%1$5s\n", "a", "b", "c", "d");

- 문자열 넣기

  · %s : 문자열 값 넣기.
  · 번호$ : 값의 인덱스를 가리킨다. 1부터 시작한다.
            값의 인덱스를 지정하지 않으면, 순서대로 대입한다.
    예) 4$ : 4번째 값을 가리킨다.
  · %자릿수s : 문자열을 출력할 때 차지할 칸 수를 의미한다.
    예) %5s : 5칸에 문자열을 출력한다. 빈 자리는 공백으로 둔다.

- conversion 사용법

  · %s, %S : 문자열
  · %c, %C : 문자
  · %d : 10진수(decimal) 숫자
  · %o : 8진수(octal) 숫자
  · %x, %X : 16진수(hexadecimal) 숫자
  · %h, %H : Integer.toHexString(arg.hashCode())의 리턴 값.
  · %f : 부동소수점(floating point) 숫자
  · %b, %B : boolean 값 
  · %t, %T : Date/Time 값
  · %n : 줄바꿈. \n 과 같다.

ex. 
    System.out.printf("%s,%c,%d,%o,%x,%h,%f,%b,%tY\n", 
            "홍길동",'가',100, 100, 100, 100, 
            3.14, true, new java.util.Date());
    => 홍길동,가,100144,64,64,3.140000,true,2017

- .precision

ex. 
    System.out.printf("%f, %.1f, %.2f, %.3f, %.4f, %.5f\n", 
            3.141592, 3.141592, 3.141592, 3.141592, 3.141592, 3.141592);
    => 3.141592, 3.1, 3.14, 3.142, 3.1416, 3.14159

- argument_index$

ex. 
    System.out.printf("%1$f, %1$.1f, %1$.2f, %1$.3f, %1$.4f, %1$.5f\n", 3.141592);
    => 3.141592, 3.1, 3.14, 3.142, 3.1416, 3.14159

- width

ex. 
    System.out.printf("%1$4s,%1$10s,%2$5.2f,%2$10.3f\n", "홍길동", 3.14);
    => 홍길동,       홍길동, 3.14,      3.140

- flags

ex 1. - : 왼쪽 정렬
    System.out.printf("'%10s','%-10s'\n", "홍길동", "임꺽정");
    =>'        홍길동','임꺽정       '

ex 2. + : 부호 출력
    System.out.printf("%d, %+d\n", 100, 100);
    => 100, +100

ex 3. 0 : 빈자리를 0으로 채우기
    System.out.printf("%5d, %05d\n", 123, 123);
    => 123, 00123

- 날짜/시간 다루기 : %T[날짜 관련 접미사]

  · H : Hour. 00 ~ 23
  · I : Hour. 01 ~ 12
  · M : Minute. 00 ~ 59
  · S : Second. 00 ~ 60
  · p : 오전(am), 오후(pm) 출력
  · Y : Year. 4자리
  · y : year. 2자리
  · m : Month. 01 ~ 12
  · d : Day. 01 ~ 31
  · e : Day. 1 ~ 31
  · A : Week. "Sunday" -> 전체(한글은 "X요일" 형식으로 출력)
  · a : Week. "Sum" -> 약어(한글은 "요일" 미출력)
  · B : Month name. "January"(한글은 b와 동일)
  · b : Month name. "Jan"(한글은 B와 동일)

ex 1.
    System.out.printf("%1$tH, %1$tI, %1$tM, %1$tS, %1$tp\n", 
            new java.util.Date());
    => 17, 05, 39, 45, 오후

ex 2.
    System.out.printf("%1$tH:%1$tM:%1$tS\n", new java.util.Date());
    => 17:41:15

ex 3.
    System.out.printf("%1$tY, %1$ty, %1$tm, %1$td, %1$te\n", 
            new java.util.Date());
    => 2017, 17, 09, 27, 27

ex 4.
    System.out.printf("%1$tm, %1$tB, %1$tb\n", 
            new java.util.Date());
    => 09, 9월, 9월

ex 5.
    System.out.printf("%1$tA, %1$ta\n", 
            new java.util.Date());   
    => 수요일, 수
```