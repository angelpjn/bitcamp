package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class Test1 {

    public static void main(String[] args) throws IOException {
//        File file = new File("."); // .은 현재 위치
//        File file = new File("../.."); // 상위폴더/그 상위폴더
        File file = new File("../java-basic/build.gradle");
        
        System.out.printf("파일명=%s\n", file.getName());

        System.out.printf("파일 객체를 생성할 때 넘겨준 경로=%s\n", file.getPath());
        
        System.out.printf("절대경로=%s\n", file.getAbsolutePath());
        
        System.out.printf("최종경로=%s\n", file.getCanonicalPath());
        
        System.out.printf("부모디렉토리=%s\n", file.getParent());
        
        System.out.printf("전체크기=%s\n", file.getTotalSpace());
        System.out.println(file.getTotalSpace() / (int)Math.pow(1024, 3));

        System.out.printf("남은 용량=%s\n", file.getFreeSpace());
        System.out.println(file.getFreeSpace() / (int)Math.pow(1024, 3));

        System.out.printf("사용 가능한 크기=%s\n", file.getUsableSpace());
        System.out.println(file.getUsableSpace() / (int)Math.pow(1024, 3));

        System.out.printf("존재여부=%s\n", file.exists());
        
        System.out.printf("파일여부=%s\n", file.isFile());
        
        System.out.printf("디렉토리여부=%s\n", file.isDirectory());
        
        System.out.printf("파일 또는 디렉토리 크기=%s\n", file.length());
        
        System.out.printf("읽기 가능 여부=%s\n", file.canRead());
        
        System.out.printf("쓰기 가능 여부=%s\n", file.canWrite());
        
        System.out.printf("실행 가능 여부=%s\n", file.canExecute());
        
        System.out.printf("마지막 변경일=%s\n", file.lastModified());
        System.out.printf("마지막 변경일=%s\n", new Date(file.lastModified()).toString());
        System.out.printf("마지막 변경일=%s\n", new Date(file.lastModified()).toLocaleString());
    }
}
