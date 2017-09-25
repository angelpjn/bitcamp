# 자바에서 값 표현(literal)하기 - 문자

## 관련 파일

```
Test11_2.java
```

## 작은 따옴표('')를 사용한 문자 표현 

```
=> JVM에서는 문자 코드(유니코드)를 2바이트 메모리로 다룬다. 
        System.out.println('A');
        System.out.println('가');
        System.out.println('9');
```

## 문자 유니코드(2byte) 값을 사용한 문자 표현

```
=> 예) 'A'의 유니코드 = 0xAC00 
       'A' 문자를 유니코드로 표현 = \uAC00'
        System.out.println('\u0041');
        System.out.println('\uAC00'); // = '\uac00'
        System.out.println('\u0039');
```