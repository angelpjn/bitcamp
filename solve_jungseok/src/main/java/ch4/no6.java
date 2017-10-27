/*
[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
*/

package ch4;

public class no6 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        for (i = 1; i < 7; i++) {
            for (j = 1; j < 7; j++) {
                if (i + j == 6) {
                    System.out.println("6의 조합 : " + i + " " + j);
                }
            }
        }
        System.out.println();
    }
}
