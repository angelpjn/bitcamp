/*
7.1 카드 한 벌 : 카드 게임에 쓰이는 카드 한 벌을 나타내는 자료 구조를 설계하라.
그리고 블랙잭 게임을 구현하려면 이 자료구조의 하위 클래스를 어떻게 만들어야 하는지 설명하라.
*/

package ch07;

import java.util.Scanner;

class Card {
    int[][] cardType = new int[4][];

}

class PlayGame {
    Card card = new Card(); 
    
    static Scanner scan = new Scanner(System.in);
    
    static int[] recieves = new int[2];
    
    void shuffle() {
        System.out.print("받은 2개의 카드는 : ");
        for(int i = 0; i < 2; i++) {
            recieves[i] = (int)(Math.random() * 13) + 1;
            for (int j = 0;j < i; j++) {
                if(recieves[i] == recieves[j])  
                {
                    i--;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.print(recieves[i] + ", ");
        }
        System.out.println();
    }
    
    void chice() {
        System.out.print("카드를 더 받으시겠습니까?(y/n) ");
        String response = scan.nextLine().toLowerCase();
        if (response.equals("n") || response.equals("no")) {
            computeResult();
        } else {
            more();
        }
    }
    
    void more() {
        System.out.print("추가한 카드는 : ");
        int recieve = 0;
        while (true) {
            recieve = (int)(Math.random() * 13) + 1;
            for (int j = 0;j < 13; j++) {
                if(recieves[j] != recieve) break;
            }
            System.out.print(recieve);
        }
    }
    
    void computeResult() {
        int result = 0;
        for (int i = 0; i < recieves.length; i++) {
            result += recieves[i];
        }
    }
}

public class No1 {
    public static void main(String[] args) {
        PlayGame play = new PlayGame();
        play.shuffle();
//        play.chice();
//        play.more();
    }
}

