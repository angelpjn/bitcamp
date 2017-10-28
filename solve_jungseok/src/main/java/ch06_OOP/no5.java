/* 
[6-5] 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.

[실행결과]
홍길동,1,1,100,60,76,236,78.7
*/

package ch06_OOP;

class Student3 {
    String name;
    int ban, id, kor, eng, math, sum;
    float average;
    
    Student3(String name, int ban, int id, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.id = id;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    
    String info() {
        this.sum = this.kor + this.eng + this.math;
        this.average = (int) ((this.sum / 3f + 0.1) * 10) / 10f;
        return this.name + ", " + this.ban + ", " + this.id + ", " + this.kor + ", " + this.eng + ", "
                + this.math + ", " + this.sum + ", " + this.average;
    }
}

public class no5 {
    public static void main(String args[]) {
        Student3 s = new Student3("홍길동", 1, 1, 100, 60, 76);
        System.out.println(s.info());
    }
}
