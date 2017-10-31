package practice.ch09.ex1.arr;

public class My {

    public static void main(String[] args) {
        Array list = new Array();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s \n", list.get(i));
        }
        System.out.println(list.cursor);
        
        System.out.println("------------------------");
        
        list.remove(3);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s \n", list.get(i));
        }
        System.out.println("------------------------");

        list.insert(3, 3);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s \n", list.get(i));
        }
    }
}
