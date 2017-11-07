package bitcamp.java100.ch11.ex3;

public class Test1 {

    public static void main(String[] args) {
        Car car = new Car();
        car.model = "그냥 차!";
        car.cc = 300;
        
        car.run();
        car.stop();
    }
}
