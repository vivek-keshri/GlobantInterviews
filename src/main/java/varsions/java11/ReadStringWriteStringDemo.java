package varsions.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadStringWriteStringDemo {
    public static void main(String[] args) {

        var file_Path = Paths.get("/Users/vivek.keshri/TestingFile.txt");
        try {
            var file_Content = Files.readString(file_Path);
            System.out.println("file existing content is: " + file_Content);

            Files.writeString(file_Path, "Hello from GFG !!",
                    StandardOpenOption.APPEND);

            System.out.println("file content after addition is: " + file_Content);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

