"use strict"

// 변수 선언 - 정적 데이터 타입 바인딩과 동적 데이터 타입 바인딩

// 자바는 변수의 타입이 한 번 결정되면 오직 그 타입의 값만 저장할 수 있다.
/*
int a = 10;

a = "홍길동"; <== 오류! a 변수는 오직 int 타입의 데이터만 저장할 수 있다.
이렇게 변수의 타입이 고정되는 것을 "static type binding" 이라 부른다. 

물론 다음과 같이 같은 이름의 변수를 다른 타입으로 선언할 수 없다.
String a = "홍길동"; // 오류! 같은 이름의 변수를 또 선언할 수 없다.
 */

// 자바스크립트는 다음과 같이 같은 이름으로 변수를 또 선언할 수 있다.
var v1 = 100
var v1 = 200
console.log(v1)

// 또한 변수의 타입이 지정되어 있지 않기 때문에 
// 언제든 어떤 값이라도 저장할 수 있다.
v1 = "홍길동"
console.log(v1)

v1 = true
console.log(v1)

// 이렇게 변수의 타입이 고정돼 있지 않다고 해서 
// "dynamic type binding"이라 부른다.
// 동적 타입 바인딩은 변수에 값을 넣을 때 그 변수의 타입이 결정된다.
// 또 다른 타입의 값을 넣으면 그 변수의 타입이 바뀐다.


// 자바스크립트의 변수는 자바 맵 객체에 값을 저장하는 것 처럼 다뤄진다.
/*
HashMap<String,Object> map = new HashMap<>();
map.put("v1", 100);
map.put("v1", 200); <== 언제든지 같은 이름으로 값을 저장할 수 있다.
map.put("v1", "홍길동"); <== 또 언제든지 다른 타입의 값을 저장할 수 있다.
map.put("v1", true);

즉 자바스크립트의 변수 이름은 값을 저장할 때 key와 마찬가지의 역할을 한다.
 */














