package basic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOnFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\vivek.keshri\\Desktop\\Temp.txt");

        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("Hello from Demo Program of Java");
        System.out.println("File written Successfully");
        bw.close();
    }
}
