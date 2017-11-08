package bitcamp.java100.ch13.ex3;

public class Test3 {

    public static void main(String[] args) {

        class MyClass {}
        class MyClass2 implements AutoCloseable {

            @Override
            public void close() throws Exception {
                System.out.println("close() 호출되었음!");
            }
            
        }
        
        try (
//                MyClass obj = new MyClass();
                MyClass2 obj2 = new MyClass2();
        ) {
            System.out.println("try 블록 실행!");
            
            int r = 20 / 0;
            
        } catch (Exception e) {
            System.out.println("catch 블록 실행!"); // close()가 실행된다는 것만 기억하면 된다. 순서는 중요한게 아님
        }
    }
}
