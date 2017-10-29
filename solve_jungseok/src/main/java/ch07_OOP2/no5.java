/* 
[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
위해서는 코드를 어떻게 바꾸어야 하는가?

 */

package ch07_OOP2;

class Product1 {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수
    
    Product1() {}
    
    Product1(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv1 extends Product1 {
    
    Tv1() {
    }
    
    public String toString() {
        return "Tv";
    }
}

class no5 {
    public static void main(String[] args) {
        Tv1 t = new Tv1();
    }
}