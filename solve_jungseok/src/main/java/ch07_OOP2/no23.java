/* 
[7-23] 문제7-22에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트 하시
오.
1. 메서드명 : sumArea
기 능 : 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환한다.
반환타입 : double
매개변수 : Shape[] arr

[실행결과]
면적의 합:93.68140899333463
 */

package ch07_OOP2;

abstract class Shape2 {
    Point p;

    Shape2() {
        this(new Point(0, 0));
    }

    Shape2(Point p) {
        this.p = p;
    }

    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Point2 {
    int x;
    int y;

    Point2() {
        this(0, 0);
    }

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}

class Rectangle2 extends Shape2 {

    boolean check;
    double width;
    double height;

    Rectangle2() {
    }

    Rectangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double calcArea() {
        double area = width * height;
        return area;
    }

    boolean isSquare(double area) {
        if (!(width <= 0 || height <= 0) && width == height)
            return true;
        return false;
    }
}

class Circle2 extends Shape2 {

    double r;
    boolean check;
    final static double PI = 3.14;

    Circle2() {
    }

    Circle2(double r) {
        this.r = r;
    }

    double calcArea() {
        double area = PI * Math.pow(r, 2);
        return area;
    }
}

public class No23 {

    static double sumArea(Shape2[] arr) {
        double area1 = arr[0].calcArea();
        double area2 = arr[1].calcArea();
        double area3 = arr[2].calcArea();

        double sum = area1 + area2 + area3;
        return sum;
        
    }

    public static void main(String[] args) {
        Shape2[] arr = { new Circle2(5.0), new Rectangle2(3, 4), new Circle2(1) };
        System.out.println("면적의 합:" + sumArea(arr));
    }
}