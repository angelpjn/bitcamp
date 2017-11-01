/* 
[7-22] 아래는 도형을 정의한 Shape클래스이다. 이 클래스를 조상으로 하는 Circle클래스와 Rectangle클래스를 작성하시오.
이 때, 생성자도 각 클래스에 맞게 적절히 추가해야한다.
(1) 클래스명 : Circle
조상클래스 : Shape
멤버변수 : double r - 반지름
(2) 클래스명 : Rectangle
조상클래스 : Shape
멤버변수 : double width - 폭
double height - 높이
메서드 :
1. 메서드명 : isSquare
기 능 : 정사각형인지 아닌지를 알려준다.
반환타입 : boolean
매개변수 : 없음
*/

package ch07_OOP2;

import java.util.Scanner;

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
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

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}

class Circle extends Shape {
    
    int r;
    boolean check;
    final static double PI = 3.14;
    
    Circle() {}
    
    Circle(int r) {
        this.r = r;
    }
    
    double calcArea() {
        double area = PI * Math.pow(r, 2);
        return area;
    }
    
}

class Rectangle extends Shape {
    
    boolean check;
    double width;
    double height;
    
    Rectangle() {}
    
    Rectangle(double width, double height) {
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

public class No22 {
    
    public static void main(String[] args) {
        
        Circle circle = new Circle();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("가로 : ");
        
        double width = Double.parseDouble(scan.nextLine());
        
        System.out.print("세로 : ");
        double height = Double.parseDouble(scan.nextLine());
        
        Rectangle rectangle = new Rectangle(width, height);
        
        double area = rectangle.calcArea();
        
        System.out.println("넓이는 ? => " + area);
        
        System.out.println("정사각형인가? => " + rectangle.isSquare(area));
        
    }
    
}







































