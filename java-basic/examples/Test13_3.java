
package bitcamp.java100;

public class Test13_3{
    public static void main(String[] args){

        int [] arr1;
        arr1 = new int [3];

        System.out.println(arr1.length);

        arr1[0] = 100;
        arr1[1] = 90;
        arr1[2] = 80;

        // 실행 오류 => 배열의 index 범위 초과
        // ArrayIndexOutOfBoundsException
        // arr1[-1] = 200;
        // arr1[3] = 300;
    }
}