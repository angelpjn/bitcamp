/*
For statues = [6, 2, 3, 8], the output should be
makeArrayConsecutive2(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.
*/
package codefight.arcade.step2_edgeOfTheOcean;

import java.util.Arrays;

public class No6 {

    int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        System.out.println(Arrays.toString(statues));
        int result = 0;
        for (int i = 1; i < statues.length; i++) {
            result += statues[i] - (statues[i - 1] + 1);
        }
        return result;
    }


    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        No6 no = new No6();
        System.out.println(no.makeArrayConsecutive2(statues));
    }
}
