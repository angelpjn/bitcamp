package practice.ch09.ex1.linkedList;

public class My {


    static void printLinkedList(LinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s \n", list.get(i));
        }
        System.out.println("----------------");
    }
    
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        
        list.add("첫째");
        list.add("둘째");
        list.add("셋째");
        list.add("넷째");
        list.add("다섯째");
        printLinkedList(list);
        
        list.remove(3);
        printLinkedList(list);
        
        list.insert(3, "넷째");
        printLinkedList(list);

        list.add("첫째");
        list.add("둘째");
        list.add("셋째");
        list.add("넷째");
        list.add("다섯째");
        printLinkedList(list);
        
    }

}
