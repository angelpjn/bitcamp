/*
[4-5] 다음의 for문을 while문으로 변경하시오.
*/

package solve_original.solve_jungseok.ch04_banif;
public class no5 {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++) {
            for(int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

