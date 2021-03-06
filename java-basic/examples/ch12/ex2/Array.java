package practice;

import java.util.Iterator;

public class Array {

    private Object[] arr = new Object[10000];
    private int cursor = 0;

    public void add(Object obj) {
        if (cursor == arr.length)
            return;

        arr[cursor++] = obj;
    }

    public int size() {
        return cursor;
    }

    public Object get(int index) {
        if (index < 0 || index >= cursor) {
            return null;
        }
        return arr[index];
    }

    public Object remove(int index) {
        if (index < 0 || index >= cursor)
            return null;
        Object removedValue = arr[index];

        for (int i = index; i < cursor - 1; i++) {
            arr[i] = arr[i + 1];
        }
        cursor--;

        return removedValue;
    }

    public void insert(int index, Object value) {
        if (cursor == arr.length)
            return;

        if (index < 0 || index >= cursor)
            return;

        for (int i = cursor - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        arr[index] = value;

        cursor++;

    }

    public MyIterator iterator() {
        return new MyIterator(); // Iterator 규칙에 따라 만든 클래스의 객체(인스턴스, 구현체) 리턴
    }

    class MyIterator implements Iterator<Object> {
        int index;

        @Override
        public boolean hasNext() {
            if (index < cursor)
                return true;
            return false;
        }

        @Override
        public Object next() {
            return arr[index++];
        }
    }
}
