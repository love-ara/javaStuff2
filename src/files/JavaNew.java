package files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaNew {
    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\heyBestie";

        Path path = Paths.get(file);

        BufferedWriter writer= Files.newBufferedWriter(path);
        writer.write("My Ralia!");
       // writer.flush();
        writer.close();
    }
}
