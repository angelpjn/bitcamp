package practice.ch09.ex1.linkedList;

public class LinkedList {

    Box head;
    Box tail;
    
    int len;
    
    public void add(Object value) {
        
        Box box = new Box();
        box.value = value;
        
        len++;
        
        if (tail == null) {
            head = box;
            tail = box;
        } else {
            tail.next = box;
            tail = box;
        }
        
    }
    
    public int size() {
        return len;
    }
    
    public Object get(int index) {
        if (index < 0 || index >= len) {
            return null;
        }
        
        Box box = head;
        for (int i = 0; i < index;i++) {
            box = box.next;
        }
        return box.value;
    }
    
    public void remove(int index) {
        if (index < 0 || index >= len) {
            return;
        }
        Box box = head;
        
        for (int i = 0; i < index - 1; i++) {
            box = box.next;
        }
        box.next = box.next.next;
        
        len--;
    }
    
    public void insert(int index, Object value) {
        if (index < 0 || index >= len) {
            return;
        }
        Box box = new Box();
        box.value = value;
        
        Box pre = head;
        for (int i = 0; i < index - 1; i++) {
            pre = pre.next;
        }
            box.next = pre.next;
            pre.next = box;
            
            len++;
    }
}












