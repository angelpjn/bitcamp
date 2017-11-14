package bitcamp.java100.ch14.ex5;

import java.io.FileReader;

public class Test1_1 {

    public static void main(String[] args) throws Exception {
        FileReader in = new FileReader("test.txt");
        
        int b;
        
        while ((b = in.read()) != -1) {
            System.out.println(Integer.toHexString(b));
        }
        in.close();
    }
}

/*
Unicode
41 => 0041 리턴, 00 생략
42 => 0042 리턴, 00 생략
43 => 0043 리턴, 00 생략
ac00
ac01
*/