package practice.ch09.ex1.linkedList;

public class LinkedList {

    Box head;
    Box tail;
    
    int len;
    
    public void add(Object value) {
        
        Box box = new Box();
        box.value = value;
        
        if (tail == null) {
            head = box;
            tail = box;
        } else {
            tail.next = box;
            tail = box;
        }
        len++;
    }
    
    public int size() {
        return len;
    }
    
    public Object get(int index) {
        
        Box box = head;
        for (int i = 0; i < index; i++) {
            box = box.next;
        }
        return box.value;
    }
    
    public void insert(int index, Object value) {
        Box box = new Box();
        box.value = value;
        
        Box pre = head;
        for (int i = 0; i < index - 1; i++) {
            pre = pre.next;
        }
        box.next = pre.next.next;
        pre.next = box;
        len++;
    }
    
    public void remove(int index) {
        Box pre = head;
        for (int i = 0; i < index - 1; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        len--;
    }
}
