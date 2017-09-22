# 패키지 명명 규칙

```
관련 파일 : Test09_1.java, Test09_2.java, Test09_3.java, Test09_4.java
```

## 패키지 명명 규칙

```
- 패키지 이름이 겹치지 않도록 짓는 방법!
- 패키지 이름으로 왜 도메인명을 사용하는가?
- 왜 도메인명을 꺼꾸로 사용하는가?
```

#### 실습 코드

```
package kr.co.bitcamp.java100;

public class Test09_5 {
  public static void main(String[] ags) {
    System.out.println("Hello!"); 
  }
}
```

### [명명 양식]

```
1) 보통 패키지명이 겹치지 않도록 하기 위해 도메인명을 사용한다. 
2) 폴더 관리를 쉽게 하기 위해 
   상위 도메인명이 상위 폴더가 될 수 있도록 
   도메인명을 꺼꾸로 사용한다.
   예) com.xxx.제품명.하위패키지
```
