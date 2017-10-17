
package bitcamp.java100.ch02.test16;

public class Test16_5 {
    public static void main(String[] args) {
    	System.out.println("· do ~ while 문법 : ");
    	
    	int i = 0;
    	
    	do
    		System.out.println(i++);
       	while (i < 5);
    	
    	System.out.println();
    	
    	System.out.println("· do ~ while 문법_{} 활용 : ");
    	
    	i = 0;
    	
    	do {
    		System.out.print("=> ");
    		System.out.println(i);
    		i++;
    	} while (i < 5);
    	
    	System.out.println();
    }
}




































