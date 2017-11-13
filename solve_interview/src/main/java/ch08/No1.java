/*
 트리플 스텝: 
 어떤 아이가 n개의 계단을 오른다.
 한 번에 1계단 오르기도 하고, 2계단이나 3계단을 오르기도 한다.
 계단을 오르는 방법이 몇 가지가 있는지 계산하는 메서드를 구현하라.
 */

package ch08;

public class No1 {

    static int compute1(int result) {
        if (result < 0) {
            return 0;
        } else if (result == 0) {
            return 1;
        } else {
            return compute1(result - 1) + compute1(result - 2) + compute1(result - 3);
        }
    }
    
    static int compute2(int result) {

        if (result == 0) 
            return 1;

        if (result == 1) 
            return 1;

        if (result == 2) 
            return 2;
        
        if (result == 3) 
            return 4;
        
        int a = 1;
        int b = 2;
        int c = 4;
        
        for (int i = 4; i < result; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return a + b + c;
    }

    public static void main(String[] args) {
//        System.out.println(compute1(100));
        System.out.println(compute2(100));
    }
    
}
