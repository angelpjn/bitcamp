# 자바에서 값 표현(literal)하기 - 정수의 자릿수 표현

## 관련 파일

```
Test11_5.java, Test11_6.java
```

## 정수의 자릿수 표현 

```
1) 10진수의 자릿수 표현 : 밑줄(xxx_yyyy) 이용

      System.out.println(1456781234);
      System.out.println(14_5678_1234); 
      System.out.println(1_456_781_234);
      => 1456781234

2) 숫자가 많은 경우 편히 알아보기 위해 사용

      System.out.println(0b0110_0100);
      System.out.println(0B0110_0100);
      System.out.println(0b110_0100);
      => 100
```

## 정수의 크기 

```
1) 기본으로 4바이트 크기

   - 표현 가능 범위 : -2**31 ~ +2**31 = -2147483648 ~ +2147483647

      System.out.println(-21_4748_3648);
      System.out.println(21_4748_3647);

    -> 해당 범위를 벗어날 경우 컴파일 오류 발생

    - 표현 범위 초과로 인한 컴파일 오류의 예

      System.out.println(-21_4748_3649);
      System.out.println(21_4748_3648);

2) 4바이트 초과 정수 표현을 위한 8바이트 정수 표현

   - 숫자뒤에 l또는 L을 붙여 표현

      System.out.println(-21_4748_3649L);
      System.out.println(21_4748_3648l);
      => 100

      ※ 숫자가 4바이트 이내라고 해도 L을 붙일 시 8바이트로 저장됨

      System.out.println(10);
      -> 4바이트 정수 값
      
      System.out.println(10L);
      -> 8바이트 정수 값

   - 8바이트 표현 가능 범위
     System.out.println(-922_3372_0368_5477_5808L);
     System.out.println(922_3372_0368_5477_5807L);

```

### 비트 개수로 표현 가능한 최대 값

```
- 갯수 : 2^n -1
- 양수/음수 고려 시 : {-2^(n-1)} ~ 0 ~ {2^(n-1)-1}

※ n : 비트 수

```