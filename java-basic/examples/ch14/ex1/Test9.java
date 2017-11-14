package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Test9 {

    public static void main(String[] args) throws IOException {

        File file = new File(".");

        File[] files = file.listFiles(new FileFilter() {

            @Override

            public boolean accept(File pathname) {

                if (pathname.getName().startsWith("."))
                    return false;
                else
                    return true;
            }
        });

        printFiles(file);
    }

    static void printFiles(File dir) throws IOException {
        File[] files = dir.listFiles();

        for (File f : files) {
            System.out.println(f.getCanonicalFile());
            if (f.isDirectory()) {
                printFiles(f);
            }
        }
    }
}
