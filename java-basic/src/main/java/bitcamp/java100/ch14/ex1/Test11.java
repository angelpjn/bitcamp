package bitcamp.java100.ch14.ex1;
//.class
import java.io.File;
import java.io.IOException;

public class Test11 {

    public static void main(String[] args) throws IOException {

        File file = new File(".");

        printFiles(file);
    }

    static void printFiles(File dir) throws IOException {
        File[] files = dir.listFiles();

        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".class")) {
                int i = f.getCanonicalPath().toString().indexOf("bin") + 4;
                int j = f.getCanonicalPath().toString().indexOf(".class");
                System.out.println(f.getCanonicalPath().toString().substring(i, j).replace("\\", "."));
//                System.out.println(f.getCanonicalPath().toString().substring(i, j).replaceAll("\\\\", "."));
            }
            
            if (f.isDirectory()) {
                printFiles(f);
            }
        }
    }
}
