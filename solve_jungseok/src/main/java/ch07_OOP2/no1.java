/* 
[7-1] 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 
섯다카드 20장을 담는 SutdaCard배열을 초기화하시오. 
단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고, 
숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다. 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.

[실행결과]
1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,
*/

package ch07_OOP2;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard1[] cards = new SutdaCard1[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10)&&(num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard1(num, isKwang);
        }
    }
}

class SutdaCard1 {
    int num;
    boolean isKwang;

    SutdaCard1() {
        this(1, true);
    }

    SutdaCard1(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class no1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");
    }
}


































