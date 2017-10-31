package practice.ch09.ex1.arr;

public class Array {

    private Object[] arr = new Object[10000];
    int cursor = 0;
    
    public void add(Object obj) {
        if (cursor == arr.length)
            return;
        arr[cursor++] = obj;
    }
    
    public int size() {
        return cursor;
    }
    
    public Object get(int index) {
        if (index < 0 || index >= cursor) 
            return null;
        return arr[index];
    }
    
    public void remove(int index) {
        if (index < 0 || index >= cursor) {
            return;
        }
        
        for (int i = index; i < cursor; i++) {
            arr[i] = arr[i + 1];
        }
        cursor--;
    }
    
    public void insert(int index, Object obj) {
        if (index < 0 || index >= cursor)
            return;
        
        if (cursor == arr.length) 
            return;
        
        for (int i = cursor - 1; i > index - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = obj;
        cursor++;
    }
}
