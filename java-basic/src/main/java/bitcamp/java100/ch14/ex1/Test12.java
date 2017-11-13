package bitcamp.java100.ch14.ex1;
//.class
import java.io.File;
import java.io.IOException;

public class Test12 {

    public static void main(String[] args) throws IOException {

        File file = new File(".");

        printFiles(file);
    }

    static void printFiles(File dir) throws IOException {
        File[] files = dir.listFiles();

        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".class")) {
                System.out.println(f.getName());
            }
            if (f.isDirectory()) {
                printFiles(f);
            }
        }
    }
}
