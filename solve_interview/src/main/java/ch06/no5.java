/*
6.5 물병 : 5리터짜리 물병과 3리터짜리 물병이 있다.
물은 무제한으로 주어지지만 계량컵은 주어지지 않는다. 이 물병 두 개를 사용해서 정확히 4리터의 물을 계량하려면
어떻게 해야 할까?
물병의 형태가 좀 괴상해서, 물을 정확히 '절반만' 담는 것 따위는 불가능하다.


1. 3리터 짜리로 두 번 떠서 담고
2. 5리터 짜리로  한 번 버린다.
이른 4번 반복하면 4리터가 된다.
*/

package ch06;

public class No5 {

    public static void main(String[] args) {
        int l3 = 3;
        int l5 = 5;
        int total = 0;
        int count = 0;
        
        while (total != 4) {
            total += l3 * 2 - l5;
            count++;
        }
        System.out.println(count);
    }
}
