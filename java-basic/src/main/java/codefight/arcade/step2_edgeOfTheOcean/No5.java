/*
a1 = 1
a2 = 5
a3 = 13
a4 = 25

a(n) = a(n - 1) + 4 * (n - 1)
*/
package codefight.arcade.step2_edgeOfTheOcean;

public class No5 {

    int shapeArea(int n) {

        int a = 1;
        for (int i = 2; i <= n; i++) {
            int b = (i - 1) * 4;
            int c = a + b;
            a = c;
        }
        return a;
    }


    public static void main(String[] args) {
        No5 no = new No5();
        System.out.println(no.shapeArea(10));
    }
}
