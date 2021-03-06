package bitcamp.java100.ch19.ex5;

public class Test2 {
    public static void main(String[] args) {
        MyAnnotation anno = MyClass2.class.getAnnotation(MyAnnotation.class);
        
        String[] names = anno.name();
        int[] ages = anno.age();
        
        for (String n : names) {
            System.out.println(n);
        }
        
        System.out.println("-----------------------------------------------------");
        
        for (int a : ages) {
            System.out.println(a);
        }
        
    }
}
