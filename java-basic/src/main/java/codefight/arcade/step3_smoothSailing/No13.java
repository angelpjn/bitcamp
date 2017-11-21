/*

For string s = "a(bc)de", the output should be
reverseParentheses(s) = "acbde".

Input: "a(bcdefghijkl(mno)p)q"
Expected Output: "apmnolkjihgfedcbq"

Input: "co(de(fight)s)"
Expected Output: "cosfighted"

Input: "Code(Cha(lle)nge)"
Expected Output: "CodeegnlleahC"

Input: "Where are the parentheses?"
Expected Output: "Where are the parentheses?"

Input: "abc(cba)ab(bac)c"
Expected Output: "abcabcabcabc"

Input: "The ((quick (brown) (fox) jumps over the lazy) dog)"
Expected Output: "The god quick nworb xof jumps over the lazy"
 */

package codefight.arcade.step3_smoothSailing;

public class No13 {

    String reverseParentheses(String s) {
        int r, l;
        while((l = s.lastIndexOf('('))>=0){
            r = s.indexOf(')',l);
            s = s.replace(s.substring(l,r+1),new StringBuffer(s.substring(l+1,r)).reverse());
        }
        return s;
    }

    public static void main(String[] args) {
        No13 no = new No13();

        String s = "Code(Cha(lle)nge)";
//        String s = "The ((quick (brown) (fox) jumps over the lazy) dog)";
        
        System.out.println(no.reverseParentheses(s));
    }

}
