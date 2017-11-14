
/*
6.2 농구 : 
농구 골대가 하나 있는데 다음 두 게임 중 하나를 해 볼 수 있다.
게임 1 : 슛을 한 번 쏴서 골대에 넣어야 한다.
게임 2 : 슛을 세 번 쏴서 두 번 골대에 넣어야 한다.
슛을 넣을 확률이 p라고 했을 때 p가 어떤 값일 때 첫 번째 게임을, 혹은 두 번째 게임을 선택하겠는가?

- 내 답
· 게임 1 선택 : p(골) < 0.5
· 게임 2 선택 : p(골) > 0.5
· 상관 없음 : p(골) = 0.5


"The [{quick (brown) (fox) jumps over the lazy} dog]"
*/

package ch06;

public class No2 {

    public static void main(String[] args) {

        
    }
}

// int g = (int)(Math.random() * 100);
//
// int count;
// while (true) {
// int s1 = (int)(Math.random() * 2);
// break;
// }
//
// String str = "123(abcde)456";
//
// System.out.println(str);
// int s = str.indexOf('(');
// int e = str.indexOf(')');
//
// String str1 = str.substring(0, s);
// String str2 = str.substring(s + 1, e);
// String str3 = str.substring(e);
//
// char[] ch1 = str1.toCharArray();
// for (int i = 0, j = str1.length() - 1; i < str1.length() / 2; i++, j--) {
// char temp = ch1[i];
// ch1[i] = ch1[j];
// ch1[j] = temp;
// }
//
// char[] ch2 = str2.toCharArray();
// for (int i = 0, j = str2.length() - 1; i < str2.length() / 2; i++, j--) {
// char temp = ch2[i];
// ch2[i] = ch2[j];
// ch2[j] = temp;
// }
//
// char[] ch3 = str3.toCharArray();
//
// String str4 = "";
// for (int i = ch3.length - 1; i > 0; i--) {
// str4 += ch3[i];
// }
//
// String str5 = "";
// for (int i = 0; i < ch2.length; i++) {
// str5 += ch2[i];
// }
//
// String str6 = "";
// for (int i = 0; i < ch1.length; i++) {
// str6 += ch1[i];
// }
//
// System.out.println(str4 + str5 + str6);
//
