/*
For statues = [6, 2, 3, 8], the output should be
makeArrayConsecutive2(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.
*/
package codefight.arcade.step2_edgeOfTheOcean;

public class No7 {

    boolean almostIncreasingSequence(int[] sequence) {
        int removed = 0;

        for (int i = 0; i < sequence.length - 2 && removed <= 2; i ++) {
            int a = sequence[i];
            int b = sequence[i+1];
            int c = sequence[i+2];

            if (a >= b) {
                removed++;
                sequence[i] = b -1;
            } 

            if (b >= c){
                removed++;

                if (a == c) {
                    sequence[i+2] = b +1;
                } else {
                    sequence[i+1] = a;
                }
            }
        }

        return removed <= 1;
    }


    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        No7 no = new No7();
        System.out.println(no.almostIncreasingSequence(statues));
    }
}
