package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2_3 {

    public static void main(String[] args) throws IOException {


        byte[] data = new byte[4000000];
        
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte)(Math.random() * 255);
        }
        
        
        File file = new File("sample/test3.data");
        
        FileOutputStream out = new FileOutputStream(file);

        long start = System.currentTimeMillis();
        
        for (int i = 0; i < data.length; i += 8192) {
            out.write(data, i, (data.length - i) > 8192 ? 8192 : data.length - i);
        }
        
        long end = System.currentTimeMillis();

        System.out.printf("걸린 시간 = %d\n", (end - start));
        
        out.close();
    }
}
