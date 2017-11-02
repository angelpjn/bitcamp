
package bitcamp.java100.ch09.ex5;

public class Queue {

    private class Box {
        Object value; // 어떤 값이라도 그 레퍼런스를 저장할 수 있음.(기본형은 오토박싱으로 그 레퍼런스가 저장)
        Box next; // BOX와 그 자손의 주소 저장 가능

        public Box() {}
        
        public Box(Object value) {
            this.value = value;
        }
    }

    Box head;
    Box tail;

    int len;

    public void add(Object value) {

        Box box = new Box(value);

        if (tail != null) 
            tail.next = box;
        
        tail = box; // null -> box1 -> box2 ->.......
        
        len++;

        if (head == null)
        head = box;
    }

    public int size() {
        return len;
    }

    public Object poll() {
        if (len == 0)
            return null;

        Box box = head;

        head = head.next;
        
        len--;

        return box.value;
    }

}
