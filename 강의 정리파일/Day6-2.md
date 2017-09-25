# 콘솔창으로 출력하기

## 관련 파일

```
Test10_2.java
```

## 자바에서 프로그래밍 시 도구사용 방법 

```
1) 도구함.기능명
2) 도구함.객체명.기능명
3) 객체명.기능명
```

### 2) 도구함.객체명.기능명 사용 예

```
System.out.pringln("Hello!");

System => 도구함. 클래스라 부름
out => 객체(object) = 실체(instance)
※ 객체와 인스턴스를 구분하지 않는다.
println => 기능
"Hello!" => 매개변수(parameter). 기능을 수행하기 위해 전달하는 조건.
```

### 3) 도구함.기능명 사용 예

```
long currMillis = System.currentTimeMillis();
System.out.println(currMillis);

- 도구함에 있는 기능을 바로 사용하는 경우
  · 어떤 기능은 인스턴스가 있어야 사용 가능
  · 어떤 기능은 클래스만 있으면 사용 가능
```