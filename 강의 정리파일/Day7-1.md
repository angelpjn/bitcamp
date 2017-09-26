# 자바에서 값 표현(literal)하기 - 부동소수점의 표현

## 관련 파일

```
Test11_8.java
```

## 소수점 값 표현 

```

1) 고정 소수점 값 표현

ex.
    System.out.println(3.14);
    => 3.14
    System.out.println(.14);
    => 0.14
    System.out.println(3.);
    => 3.0

2) 부동 소수점 값 표현

=> [값]e|E[10의 거듭제곱]
=> 예) 31.4e-1 = 314e-2 = 3140e-3 = 0.314e1 = 0.0314e2

ex. 3.14의 표현

    System.out.println(31.4e-1);
    => 31.4 / 10 = 31.4 * 10**-1 = 3.14
    System.out.println(314e-2);
    System.out.println(3140e-3);
    System.out.println(0.314e1);
    System.out.println(0.0314e2);
```