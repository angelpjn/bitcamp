package bitcamp.java100.ch01;
/* 공개하는 클래스 블록
- 클래스 블록을 공개하는 방법과 컴파일 하는 방법을 알아보자!
- 클래스 블록을 공개하는 이유?
 */

// 클래스 블록을 공개할 때는 앞에 public을 붙인다.
//public class Test07_D {}
public class Test07_2 {}
class Test07_E {}
class Test07_F {}
class Test07_G {}


/*  [.java 소스 파일의 컴파일 결과]
    - 컴파일 오류 발생!
    - 공개 클래스 블록의 파일명은 반드시 클래스 이름과 같아야 한다.

    [결론]
    - 한 소스 파일에는 한 개의 공개 클래스만 만들 수 있다.
    - 한 소스 파일에 비공개 클래스는 여러 개 만들 수 있다.
    - 그러나 유지보수를 쉽게 하기 위해서는 
      한 소스 파일 당 한 개의 클래스를 만드는 것이 좋다.
    - 왜? 파일 이름으로 어떤 클래스인지 바로 구분할 수 있기 때문이다.
 */