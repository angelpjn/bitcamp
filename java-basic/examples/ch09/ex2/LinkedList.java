// chain 방식이므로 인스턴스를 생성하며 next 변수에 다음 만든 인스턴스의 레퍼런스를 저장한다.
// final : 상수 만들때, 상속 못받게 만들 때(클래스, 메서드, 변수 등)

package bitcamp.java100.ch09.ex2;

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
    
        if (index < 0 || index >= len) 
            return null;
        
        Box box = head;
      
        for (int count = 1; count <= index; count++) {
            box = box.next;
        }
        
        return box.value;
    }
    
    public void insert(int index, Object value) {
        if (index < 0 || index >= len) 
            return;
        
        Box box = new Box();
        box.value = value;
        
        len++;
        
        if (index == 0) {
            box.next = head;
            head = box;
            return;
        }
        
        Box pre = head; // 삽입 할 위치 이전 위치를 가리키는 객체 생성(처음은 head_최초 박스의 레퍼런스가 저장되어 있는 변수, tail은 마지막 박스의 레퍼런스 저장 변수)
        
        for (int count = 1; count < index; count++) { // 삽입할 위치 이전 객체의 주소를 찾기 위해 반복(3번 index에 삽입 위해 
            pre = pre.next;                           // 그 전인 2번 index의 객체의 레퍼런스를 찾기 위해 0번 인덱스부터 2번 이동(2번 반복이니까 2)
        }    
        
        box.next = pre.next; // 새 박스에 삽입할 위치의 박스를 가리키게 한다.
        
        pre.next = box; // 바로 전 박스는 새 박스를 가리키게 한다.
            
    }
        
    public Object remove(int index) {
        if (index < 0 || index >= len) 
            return null;
        
        len--;
        
        Box removedBox;
        
        if (index == 0) {
            removedBox = head;
            head = head.next;
            return removedBox.value;
        }

        Box pre = head;
        
        for (int count = 1; count < index; count++) { // 삭제할 위치 이전 객체의 주소를 찾기 위해 반복(3번 index 삭제 위해 
            pre = pre.next;                           // 그 전인 2번 index의 객체의 레퍼런스를 찾기 위해 0번 인덱스부터 2번 이동(2번 반복이니까 2)
            
        }    
        
        removedBox = pre.next;
        pre.next = pre.next.next;
        
        if (index == len - 1) {
            tail = pre;
        }
        
        return removedBox.value;
    }
}


















