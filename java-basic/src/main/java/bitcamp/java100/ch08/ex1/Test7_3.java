package bitcamp.java100.ch08.ex1;

// Gym 회원 추상화
class Member3 {
    private String name;
    private int age;
    private float weight;
    private float height;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

}

public class Test7_3 {

    public static void main(String[] args) {
        Member2 m = new Member2();

        m.setName("홍길동");
        m.setAge(300);
        m.setWeight(500);
        m.setHeight(-200);
        System.out.printf("%4s, %3d, %5.2f, %5.2f\n",
                m.getName(), m.getAge(), m.getWeight(), m.getHeight());
    }

}











