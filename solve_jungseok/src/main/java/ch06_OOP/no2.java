/* 
[6-2] 문제6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
결과와 같은 결과를 얻도록 하시오.

[실행결과]
3
1K
*/
package ch06_OOP;

class no2 {
    public static void main(String args[]) {
        SutdaCard2 card1 = new SutdaCard2(3, false);
        SutdaCard2 card2 = new SutdaCard2();
        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard2 {
    
    int num;
    boolean isKwang;
    
    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    
    SutdaCard2() {
        this(1, true);
    }
    
    String info() {
        return num + (isKwang ? "K" : "");
    }
}