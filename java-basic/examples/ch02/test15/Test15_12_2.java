
package bitcamp.java100.ch02.test15;

public class Test15_12_2 {
    public static void main(String[] args){
    	int v = 1234567890;
    	
    	System.out.println(Integer.toHexString(v));
    	System.out.println(Integer.toHexString(v >> 24));
    	System.out.println(Integer.toHexString((v >> 48) & 0x0096));
    	System.out.println(Integer.toHexString((v >> 72) & 0x000002));
    	System.out.println(Integer.toHexString((v >> 96) & 0x000000d2));
    	System.out.println();
    	System.out.println(Integer.toHexString(v >> 24));
    	System.out.println(Integer.toHexString((v >> 16) & 0xFF));
    	System.out.println(Integer.toHexString((v >> 8) & 0xFF));
    	System.out.println(Integer.toHexString((v >> 4) & 0xFF));
    }
}