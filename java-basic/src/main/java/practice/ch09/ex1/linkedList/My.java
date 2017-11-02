package practice.ch09.ex1.linkedList;

public class My {

    static void print(LinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s \n", list.get(i));
        }
        System.out.println("----------------");
    }
    
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add("홍");
        list.add("홍");
        list.add("홍");
        list.add("홍");
        list.add("홍");
        list.add("홍");
        
        print(list);
        
        list.insert(3, "박");
        
        print(list);

        list.remove(3);
        
        print(list);
        
        
        

        

    }

}
