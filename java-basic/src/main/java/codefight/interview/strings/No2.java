/*
For s = "CodefightsIsAwesome" and x = "IA", the output should be
strstr(s, x) = -1;
For s = "CodefightsIsAwesome" and x = "IsA", the output should be
strstr(s, x) = 10.

int findFirstSubstringOccurrence(String s, String x) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = x.toCharArray();

        int count = 0;
        int k = ch1.length - ch2.length + 1;
        int l = ch2.length;
        for (int i = 0; i < k; i++) {
            count = 0;
            if (ch1[i] == ch2[0]) {
                count++;
                for (int j = 1; j < l; j++)
                    if (ch1[i + j] == ch2[j])
                        count++;
                if (count == l)
                    return i;
            }
        }
        return -1;
    }

*/

package codefight.interview.strings;

public class No2 {

    int findFirstSubstringOccurrence(String s, String x) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = x.toCharArray();

        int k = ch1.length - ch2.length + 1;
        int l = ch2.length;

        int i = 0;
        int count = 0;
        loop:
        while (i < k) {
            
            int j = 0;
            while (j < l) {
                count = 0;
                j = 0;
                if (ch1[i + j] == ch2[j]) {
                    count++;
                    if (count == l)
                        break loop;
                } else {
                    if (count == 0) {
                        count++;
                        break;
                    }
                    break;
                }
                j++;
            }
            i += count;
        }
        if (i == k)
            return -1;
        return i;
    }

    public static void main(String[] args) {

        String s = "CodefightsIsAwesome";
        String x = "sA";

        No2 no = new No2();
        System.out.println(no.findFirstSubstringOccurrence(s, x));
    }

}
