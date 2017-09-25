# 자바에서 값 표현(literal)하기 - 이스케이프(escape) 문자

## 관련 파일

```
Test11_3.java
```

## 이스케이프(escape) 문자 

```
=> 특정 명령을 수행하는 문자

        System.out.print("ABC");
        => ABC
        System.out.print("ABC\b123"); // Backspace : 커서를 뒤로 한 칸 이동
        => AB123
        System.out.println("123");
        => 123
        System.out.println("ABC\t123"); // Tab : 커서를 OS의 기본 칸 수 만큼 이동 
        => ABC  123
        System.out.println("ABC\u0009123"); // Tab에 대해 유니코드 값을 직접 지정해도 된다.
        => ABC  123
        System.out.println("ABC\n123"); // Line Feed(LF; 0x000a) : 커서를 처음으로 되돌리고 다음 줄로 이동한다.
        => ABC
           123
        System.out.println("ABC\r12"); // Carrage Return(CR; 0x000d) : 커서를 처음으로 옮긴다. 
        => 12C
        System.out.println("ABC\f123"); // Form Feed : 커서를 다음 줄로 이동한다.
        => ABC
              123
        ※ windows에서는 ABC♀123으로 표현 됨
        System.out.println("ABC\"123"); // double quote
        => ABC"123
        System.out.println("ABC'123"); // single quote 
        => ABC'123
        System.out.println('\''); // single quote 
        => ' 
        System.out.println('"'); // double quote 
        => "
        System.out.println("c:\\workspace\\test"); // backslash 
        => c:\workspace\test
```
