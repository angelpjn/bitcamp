package java100.app;

public class Test {

    static void m(int a, int b, int c) {
        
    }
    
    public static void main(String[] args) {
        String name = "FirstName";
        
        String propName = String.format("%c%s", 
                Character.toLowerCase(name.charAt(0)),
                name.substring(1));
        
        System.out.println(propName);
    }

}






