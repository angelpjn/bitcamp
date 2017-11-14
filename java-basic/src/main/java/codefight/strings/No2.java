/*
    For s = "CodefightsIsAwesome" and x = "IA", the output should be
                strstr(s, x) = -1;
                For s = "CodefightsIsAwesome" and x = "IsA", the output should be
                strstr(s, x) = 10. 
 
 */

package codefight.strings;

public class No2 {

    int findFirstSubstringOccurrence(String s, String x) {
//            char[] ch1 = s.toCharArray();
//            char[] ch2 = x.toCharArray();
            
            int count = 0;
            int k = s.length() - x.length() + 1;
            int l = x.length();
            for (int i = 0; i < k; i++) {
                count = 0;
                for (int j = 0; j < l; j++) {
                    if (s.charAt(i + j) == x.charAt(j)) 
                        count++;
                }
                if (count == l) 
                    return i;
            }
            return -1;
    }

    public static void main(String[] args) {

        No2 no = new No2();
        System.out.println(no.findFirstSubstringOccurrence("GTgpEYIWKIWrlEtByHryETrBeTWNkHutWKOCvVNRSGSxaynjzTatJMKSwCLSCZObaNNGCXQssfEEDDJIPBwtkMmTniKaKfqaOtvO", 
                "vCLSCZObaNNGCXQssfEEDDJIPBwtkMmTniKa"));
    }

}
