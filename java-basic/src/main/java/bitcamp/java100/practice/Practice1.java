/*
    - 구구단 번호 입력 받아 출력!
    - 실행 예)
    
    구구단? 2
    2 * 1 = 2
    2 * 2 = 4
    2 * 3 = 6
    ...
    2 * 9 = 18
    -----------------
    구구단? 10
    2에서 9단까지만 가능합니다!
    구구단? 1
    2에서 9단까지만 가능합니다!
    구구단? 0                  // 0 이하의 수를 입력하면 종료하라!
    다음에 또 봐요!
    >
 */

package bitcamp.java100.practice;

import java.io.Console;

public class Practice1 {

    int i;

    public static void main(String[] args) {

        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다."); 
            System.out.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }

        class MultiplecationTable {
            int i, j;
            
            Practice1 prac = new Practice1();
            
            void check(int i) {
                this.i = i;
                if ((this.i >= 10) || (this.i == 1)) {
                    multipleReplay();
                } else if (this.i == 0) {
                    multipleEnd();
                } else {
                    compute();
                }       
            }
            
            void multipleReplay() {
                System.out.println("2에서 9단까지만 가능합니다!");
            }

            void multipleEnd() {
                System.out.println("다음에 또 봐요!");
            }
            
            void compute() {
                for (j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j +" = " + this.i * j);
                }
                System.out.println("-------------------");
            }
        }
        
        MultiplecationTable mt = new MultiplecationTable();
        Practice1 prac = new Practice1();
        
        prac.i = Integer.parseInt(console.readLine("구구단? => "));
        
        mt.check(prac.i);
    }
}



















