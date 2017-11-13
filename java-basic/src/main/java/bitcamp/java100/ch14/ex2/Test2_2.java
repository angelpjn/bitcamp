package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2_2 {

    public static void main(String[] args) throws IOException {


        int[] data = new int[4000000];
        
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 100000);
        }
        
        File file = new File("sample/test2.data");
        
        FileOutputStream out = new FileOutputStream(file);

        long start = System.currentTimeMillis();
        
        for (int b : data) {
            out.write(b);
        }
        
        long end = System.currentTimeMillis();

        System.out.printf("걸린 시간 = %d\n", (end - start));
        
        out.close();
    }
}
