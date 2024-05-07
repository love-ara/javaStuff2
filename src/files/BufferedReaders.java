package files;

import java.io.*;
import java.util.stream.Collectors;

public class BufferedReaders {
    public static void main(String[] args) {
        String file = "C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\heyBestie";

        try(FileInputStream fileInputStream = new FileInputStream(file)){
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            System.out.println(bufferedReader.lines().collect(Collectors.joining("\n")));
        }catch (IOException exception) {
            System.err.printf("ERROR: %s", exception.getMessage());
        }
    }
}
