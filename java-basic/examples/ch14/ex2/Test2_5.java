package bitcamp.java100.ch14.ex2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2_5 {

    public static void main(String[] args) throws IOException {


        int[] data = new int[4000000];
        
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 100000);
        }
        
        FileOutputStream out = new FileOutputStream("sample/test2.data");
        MyBufferedOutputStream2 out2 = new MyBufferedOutputStream2(out);

        long start = System.currentTimeMillis();
        
        for (int b : data) {
            out2.write(b);
        }
        
        long end = System.currentTimeMillis();

        System.out.printf("걸린 시간 = %d\n", (end - start));

        out2.flush();
        
        out.close();
    }
}
