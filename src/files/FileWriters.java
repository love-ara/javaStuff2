package files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {
    public static void main(String[] args) {
        String file = "C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\heyBestie";
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Welcome");
        } catch (IOException e) {
            System.err.printf("Error: %s", e.getMessage());
        }
    }
}
