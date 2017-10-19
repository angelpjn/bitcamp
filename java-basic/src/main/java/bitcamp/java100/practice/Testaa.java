
package bitcamp.java100.practice;

public class Testaa {

    static class Test111 {
        String name;
        int age;
        
        void computeAge(int age) {
            this.age = age;
            System.out.println("나이 : " + age + "세");
        }
        
        String printName(String name) {
            this.name = name;
            return "이름 : " + this.name;
        }
    }
    
    public static void main(String[] args) {
        Test111 test = new Test111();
        test.computeAge(20);
        System.out.println(test.printName("박정남"));
    }
    
    
}
