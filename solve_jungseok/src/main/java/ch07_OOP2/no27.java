/* 
[7-27] 다음과 같은 실행결과를 얻도록 (1)~(4)의 코드를 완성하시오.

[실행결과]
30
20
10
*/
package ch07_OOP2;

class Outer3 {
    int value = 10;

    class Inner3 {
        int value = 20;

        void method1() {
            int value = 30;
            
            Outer3 out = new Outer3();
            
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(out.value);
        }
    }
}

class No27 {
    public static void main(String args[]) {
        
        Outer3 out = new Outer3();
        
        Outer3.Inner3 inner = out.new Inner3();
        
        inner.method1();
    }
}
