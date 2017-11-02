// chain 방식이므로 인스턴스를 생성하며 next 변수에 다음 만든 인스턴스의 레퍼런스를 저장한다.
// final : 상수 만들때, 상속 못받게 만들 때(클래스, 메서드, 변수 등)

package bitcamp.java100.ch09.ex4;

public class Stack {

    private class Box {
        Object value; // 어떤 값이라도 그 레퍼런스를 저장할 수 있음.(기본형은 오토박싱으로 그 레퍼런스가 저장)
        Box next; // BOX와 그 자손의 주소 저장 가능

        public Box() {}
        
        public Box(Object value) {
            this.value = value;
        }
    }

    Box top;

    int len;

    public void push(Object value) {

        Box box = new Box(value);

        box.next = top;
        
        top = box;

        len++;

    }

    public int size() {
        return len;
    }

    public Object pop() {
        if (len == 0)
            return null;

        Box box = top;

        top = top.next;

        len--;

        return box.value;
    }

}
