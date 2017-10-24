package bitcamp.java100.ch06.ex6.test2;

public class Test {

    public static void main(String[] args) throws Exception {
        Car[] cars = new Car[6]; // Car type 배열(6개의 주소변수를 담을 방 6개)(이 6개의 방의 주소를 가진 레퍼런스 변수가 Stack에 Car[]타입으로 cars에 담김)
        
        cars[0] = new Car("티코", 900, 3, 2);
        cars[1] = new Car("티코", 900, 2, 1);
        cars[2] = new Car("티코", 900, 1, 3);

        cars[3] = new Car("소나타", 1980, 1, 1);
        cars[4] = new Car("소나타", 1980, 2, 2);
        cars[5] = new Car("소나타", 1980, 3, 3);
        
        System.out.printf("총 생산량 = %d 대\n", Car.count);
        
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("%d, %s, %d\n",
                    cars[i].no, cars[i].model, cars[i].cc);
        }
        
    }
}
