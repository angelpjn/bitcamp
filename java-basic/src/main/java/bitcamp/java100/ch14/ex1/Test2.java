package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) throws IOException {
//        File file = new File("."); // .은 현재 위치
//        File file = new File("../.."); // 상위폴더/그 상위폴더
        File file = new File("ok.txt");
        
        System.out.printf("파일생성=%b\n", file.createNewFile());

        System.out.printf("파일삭제=%b\n", file.delete());
        
        File file2 = new File("dir1");
        
        System.out.printf("디렉토리 생성=%b\n", file2.mkdir());

        System.out.printf("디렉토리 삭제=%b\n", file2.delete());

        File file3 = new File("aaa/bbb/ccc/test.txt");

//        System.out.printf("디렉토리2 생성=%b\n", file3.mkdir());
        System.out.printf("디렉토리2 생성=%b\n", file3.mkdirs());
        
        System.out.printf("디렉토리 삭제=%b\n", file3.delete());
    }
}
