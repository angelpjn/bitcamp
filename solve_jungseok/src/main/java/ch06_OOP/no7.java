/* 
[6-7] 문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서
드로 정의하시오.

[실행결과]
1.4142135623730951

*/

package ch06_OOP;

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    double getDistance(int x, int y) {
        double distance = Math.sqrt((x - this.x) + (y - this.y));
        return distance;
    }
}

class no7 {
    public static void main(String args[]) {
        MyPoint p = new MyPoint(1, 1);
        System.out.println(p.getDistance(2, 2));
    }
}