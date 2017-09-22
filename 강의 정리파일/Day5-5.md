# 클래스와 패키지

```
관련 파일 : Test09_1.java, Test09_2.java, Test09_3.java, Test09_4.java
```

## 클래스와 패키지

```
- 패키지를 사용하여 클래스를 분류하는 방법을 알아보자! 
- 패키지를 사용하는 이유?
```

#### 실습 코드

```
public class Test09_1 {
  public static void main(String[] ags) {
    System.out.println("Hello!"); 
  }
}
```

### [패키지 무소속 클래스]

```
- 위와 같이 특정 패키지에 종속되지 않은 클래스를 말한다.
```

### [패키지 선언 시점]

```
- 소스 파일  첫 부분에 패키지 선언
- 이후 선언되는 모든 클래스는 선언된 패키지에 소속
```

### [패키지 선언 목적]

```
- 소스 파일의 관리의 용이성 확보
- 패키지 소스 파일 저장용 폴더 생성 후 해당 폴더에 소스파일 저장
```

#### [실습 코드]

```
package a;

public class Test09_2 {
  public static void main(String[] ags) {
    System.out.println("Hello!"); 
  }
}
```

### [패키지 클래스]

```
- 위와 같이 특정 패키지에 소속된 클래스
- 컴파일러가 패키지 클래스 컴파일 시, 패키지 해당 폴더 자동 생성
```

### [패키지 클래스를 실행하는 방법]

```
1) 패키지 무소속 클래스
   > java -cp ./build/classes/java/main Test09_1
2) 패키지 소속 클래스
   패키지명을 포함하여 클래스명을 지정한다.
   > java -cp ./build/classes/java/main a.Test09_2
3) CLASSPATH 등록 후 실행하기
   (Windows)
    > set CLASSPATH=build\classes\java\main
    > java a.Test09_2
   (linux & unix)
    > export CLASSPATH=./build/classes/java/main
    > java a.Test09_2
```

### [주의 사항]

```
- 패키지를 클래스를 실행할 때 패키지 이름까지 포함해야 한다.
- "-cp" 또는 "-classpath"에 패키지명까지 포함해봐야 소용없다.
  ex. 
  > java -cp ./build/classes/java/main/a Test09_2   <== 실행 오류!
```

#### [실습 코드]

```
package a.b.c; // 하위 패키지는 점(.)으로 구분한다.

public class Test09_3 {
  public static void main(String[] ags) {
    System.out.println("Hello!"); 
  }
}
```

### [패키지 클래스를 실행하는 방법]

```
> java -cp ./build/classes/java/main a.b.c.Test09_3
```