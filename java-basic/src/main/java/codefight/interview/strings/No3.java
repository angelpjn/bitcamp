/*
You categorize strings into three types: good, bad, or mixed. If a string has 3 consecutive vowels or 5 consecutive consonants, or both, then it is categorized as bad. Otherwise it is categorized as good. Vowels in the English alphabet are ["a", "e", "i", "o", "u"] and all other letters are consonants.

The string can also contain the character ?, which can be replaced by either a vowel or a consonant. This means that the string "?aa" can be bad if ? is a vowel or good if it is a consonant. This kind of string is categorized as mixed.

Implement a function that takes a string s and returns its category: good, bad, or mixed.

Example

For s = "aeu", the output should be
classifyStrings(s) = "bad";

For s = "a?u", the output should be
classifyStrings(s) = "mixed";

For s = "aba", the output should be
classifyStrings(s) = "good".
*/

package codefight.interview.strings;

public class No3 {

    String classifyStrings(String s) {

        int countVowel  = 0;
        int countConsonant = 0;
        int countQuestioner = 0;
        int sum = 0;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u') {
                countVowel++;
            } else if (s.charAt(i) == '?') {
                countQuestioner++;
            } else {
                countConsonant++;
            }
        }
        sum = countVowel + countQuestioner + countConsonant;
        
        if (sum == countQuestioner && countQuestioner == 1) {
            result = "good";
            return result;
        }
        else if (sum == countQuestioner && countQuestioner > 1) {
            result = "mixed";
            return result;
        }
        else if ((countVowel > 0 && countConsonant == 0 && countQuestioner == 0) ||
                (countVowel == 0 && countConsonant > 0 && countQuestioner == 0) ||
                (countVowel == 0 && countConsonant == 0 && countQuestioner > 0)) {
            result = "bad";
            return result;
        } else if ((countVowel > 0 && countConsonant == 0 && countQuestioner > 0) ||
                (countVowel == 0 && countConsonant > 0 && countQuestioner > 0) ||
                (countVowel > 0 && countConsonant > 0 && countQuestioner > 0)) {
            result = "mixed";
            return result;
        } else {
            result = "good";
            return result;
        }
    }

    public static void main(String[] args) {
        No3 no = new No3();

        String s = "lrsesknaiotmqanvt";

        System.out.println(no.classifyStrings(s));
    }

}
