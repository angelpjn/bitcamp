/*
Given a sorted array of integers a, find an integer x from a such that the value of

abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)
is the smallest possible (here abs denotes the absolute value).
If there are several possible answers, output the smallest one.

Example

For a = [2, 4, 7], the output should be
absoluteValuesSumMinimization(a) = 4.
*/
package codefight.arcade.step7_throughtheFog;

public class No32 {
    int absoluteValuesSumMinimization(int[] a) {
        
        int sum = 0;
        double avera = 0;
        int aver = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        
        avera = sum / (double) a.length;
        aver = sum / a.length;
        if (-0.5 < avera - aver && avera - aver < 0.5)
            aver = (int) avera;
        else  if (avera - aver <= -0.5)
            aver = (int) (avera - 1);
        else
            aver = (int) (avera + 1);
        System.out.println(aver);
        
        int result = 0;
        int count = 0;
        int center = 1000000000;
        for (int i = 0; i < a.length; i++) {
            center = Math.min(center, Math.abs(aver - a[i]));
        }

        for (int i = 0; i < a.length; i++) {
            if (center == Math.abs(aver - a[i])) {
               count++;
               result = a[i];
            }
        }
        if (count == 1) {
            return result;
        }
        else {
            result = 100000000;
            for (int i = 0; i < a.length; i++) {
                if (center == Math.abs(aver - a[i])) {
                    result = Math.min(result, a[i]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        No32 no = new No32();
        
        int[] a = {-1000000, -10000, -10000, -1000, -100, -10, -1, 0, 1, 10, 100, 1000, 10000, 100000, 1000000};
        
        System.out.println(no.absoluteValuesSumMinimization(a));
    }

}
