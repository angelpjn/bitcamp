/*
Input:
s1: "aabcc"
s2: "adcaa"
Expected Output: 3

Input:
s1: "zzzz"
s2: "zzzzzzz"
Expected Output: 4

Input:
s1: "abca"
s2: "xyzbac"
Expected Output: 3
 */

package codefight.arcade.step3_smoothSailing;

import java.util.Arrays;

public class No10 {
    
    int commonCharacterCount(String s1, String s2) {
        
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        int[] countCh1 = new int[ch1.length];
        char[] neoCh1 = new char[ch1.length + 1];
        char max1 = '0';
        int temp = 0;

        for (int i = 0; i < ch1.length; i++) {
            neoCh1[i] = ch1[i];
            max1 = (char)Math.max(max1, ch1[i]);
        }

        for (int i = 1; i < ch1.length; i++) {
            if (neoCh1[i - 1] >= neoCh1[i]) {
                for (int j = i + 1; j < ch1.length; j++) {
                    if (neoCh1[i - 1] < neoCh1[j]) {
                        neoCh1[i] = neoCh1[j];
//                        System.out.println(Arrays.toString(neoCh1));
                        break;
                    }
                }
            }
            if (neoCh1[i] == max1) {
                for (int j = 0; j < i; j++) {
                    if (neoCh1[i] == neoCh1[j])
                        temp++;
                }
                if (temp >= 1) {
                    for (int j = i; j < ch1.length; j++) {
                        neoCh1[j] = ' ';
//                        System.out.println(Arrays.toString(neoCh1));
                    }
                    
                } else {
                    for (int j = i + 1; j < ch1.length; j++) {
                        neoCh1[j] = ' ';
//                        System.out.println(Arrays.toString(neoCh1));
                    }
                    
                }
            }
        }
        
        for (int i = 0; i < countCh1.length; i++) {
            if (neoCh1[i] == ' ')
                break;
            for (int j = 0; j < countCh1.length; j++) {
                if (neoCh1[i] == ch1[j])
                    countCh1[i]++;
            }
        }
        
        temp = 0;
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch2);
        int[] countCh2 = new int[ch2.length];
        char[] neoCh2 = new char[ch2.length + 1];
        char max2 = '0';
        
        for (int i = 0; i < ch2.length; i++) {
            neoCh2[i] = ch2[i];
            max2 = (char)Math.max(max2, ch2[i]);
        }

        for (int i = 1; i < ch2.length; i++) {
            if (neoCh2[i - 1] >= neoCh2[i]) {
                for (int j = i + 1; j < ch2.length; j++) {
                    if (neoCh2[i - 1] < neoCh2[j]) {
                        neoCh2[i] = neoCh2[j];
//                        System.out.println(Arrays.toString(neoCh2));
                        break;
                    }
                }
            }
            if (neoCh2[i] == max2) {
                for (int j = 0; j < i; j++) {
                    if (neoCh2[i] == neoCh2[j])
                        temp++;
                }
                if (temp >= 1) {
                    for (int j = i; j < ch2.length; j++) {
                        neoCh2[j] = ' ';
//                        System.out.println(Arrays.toString(neoCh2));
                    }
                    
                } else {
                    for (int j = i + 1; j < ch2.length; j++) {
                        neoCh2[j] = ' ';
//                        System.out.println(Arrays.toString(neoCh2));
                    }
                    
                }
            }
        }
        
        for (int i = 0; i < countCh2.length; i++) {
            if (neoCh2[i] == ' ')
                break;
            for (int j = 0; j < countCh2.length; j++) {
                if (neoCh2[i] == ch2[j])
                    countCh2[i]++;
            }
        }

        int end1 = 0;
        for (int i = 0; i < neoCh1.length; i++) {
            if (neoCh1[i] != ' ')
                end1++;
        }

        int end2 = 0;
        for (int i = 0; i < neoCh2.length; i++) {
            if (neoCh2[i] != ' ')
                end2++;
        }
        
//        System.out.println(Arrays.toString(neoCh1));
//        System.out.println(Arrays.toString(neoCh2));
        
        int result = 0;
        
        for (int i = 0; i < end1; i++) {
            for (int j = 0; j < end2; j++) {
                if (neoCh1[i] == neoCh2[j]) 
                    result += Math.min(countCh1[i], countCh2[j]);
                
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "abca";
        String s2 = "xyzbac";
        
        No10 no = new No10();
        
        System.out.println(no.commonCharacterCount(s1, s2));
    }

}
