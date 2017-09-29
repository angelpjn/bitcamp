
package bitcamp.java100;

public class Test15_6 {
    public static void main(String[] args){
        
        int r = 2 + 3 * 4;
        System.out.println(r);

        r = 2 + 3 * 4 - 6 / 3 + 7;
        System.out.println(r);
        // 컴퓨터의 연산 순서
        //   = 2 + 12 - 2 + 7
        //   = 14 - 2 + 7
        //   = 12 + 7
        //   = 19
        // => 같은 레벨의 앞 -> 뒤로 연산

        r = (2 + 3) * 4;
        System.out.println(r);

    }
}