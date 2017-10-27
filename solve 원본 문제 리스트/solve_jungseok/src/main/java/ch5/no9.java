/* 
[5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.

[실행결과]
**
**
*****
*****
****
****
**
**
**
*/

package ch5;

class no9 {
    public static void main(String[] args) {
        char[][] star = { { '*', '*', ' ', ' ', ' ' }, { '*', '*', ' ', ' ', ' ' }, { '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*' } };
        char[][] result = new char[star[0].length][star.length];
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                /*
                 * (1) 알맞은 코드를 넣어 완성하시오.
                 */ }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    } // end of main
} // end of class