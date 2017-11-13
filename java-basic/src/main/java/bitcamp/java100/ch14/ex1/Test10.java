package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Test10 {

    static ArrayList<File> fileList = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {

        File file = new File(".");

        fileList.add(file);
        
        while (fileList.size() > 0) {
            printFiles(fileList.remove(0));
        }
    }

    static void printFiles(File dir) throws IOException {
        File[] files = dir.listFiles();

        for (File f : files) {
            System.out.println(f.getCanonicalFile());
            if (f.isDirectory()) {
                fileList.add(f);
            }
        }
    }
}

