package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test1_3 {

    public static void main(String[] args) throws IOException {
        File file = new File("sample/java연습문제20170131.pdf");
        
        FileInputStream in = new FileInputStream(file);

        byte[] buf = new byte[8192]; // 버퍼를 무한정 늘릴 경우, 서버 사이드에서는 다수의 동시접속자가 한번에 사용하므로 버퍼 1개 * 접속자 수이다.
                                      // 적당히 설정해야하는데 보통 8k정도임
        int len = 0;
        
        int count = 0;
        long start = System.currentTimeMillis();
        while ((len = in.read(buf)) != -1) {
            count += len;
        }
        long end = System.currentTimeMillis();
                
        System.out.printf("읽은 바이트 수 = %d\n", count);
        System.out.printf("걸린 시간 = %d\n", (end - start));
        
        in.close();
    }
}
