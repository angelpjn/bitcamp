# 자바에서 값 표현(literal)하기 - 논리 값 표현

## 관련 파일

```
Test11_11.java
```

## 자바 논리 값 특징 

```
- 자바의 논리 값 표현 : true, false
  · 소문자 필수
  ex. System.out.println(true);
      => ture
      System.out.println(false);
      => false

- 대문자 작성 시 컴파일 오류 발생
  ex. System.out.println(True);

- 숫자를 논리값으로 미사용
  · 자바의 특징
  · 0 : int / false : boolean이므로 논리값 비교 불가
    ex. System.out.println(0 == false);
    
- 논리 값의 크기
  · 4바이트 int 메모리를 사용하여 저장
  · 여러 개의 논리 값을 저장하기 위해 배열 사용 시,
    1바이트 크기의 바이트 배열에 저장
```