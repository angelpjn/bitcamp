package practice;

public class Test {

    public static void main(String[] args) {
        
        Car[] cars = new Car[6];
        
        cars[0] = new Car("티코", 900);
        cars[1] = new Car("티코", 900);
        cars[2] = new Car("티코", 900);

        cars[3] = new Car("소나타", 1980);
        cars[4] = new Car("소나타", 1980);
        cars[5] = new Car("소나타", 1980);
        
        System.out.printf("총 생상량 : %d 대\n", Car.count);
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("%d, %s, %d\n",
                    cars[i].no, cars[i].model, cars[i].no);
        }
    }
}
