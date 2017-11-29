package bitcamp.java100.ch19.ex4;

public class Test3 {
    public static void main(String[] args) {
        MyAnnotation anno = MyClass3.class.getAnnotation(MyAnnotation.class);
        
        System.out.println(anno.name());
        System.out.println(anno.age());
        
    }
}
