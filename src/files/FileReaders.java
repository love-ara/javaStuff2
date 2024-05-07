package files;

import java.io.FileReader;
import java.io.IOException;

public class FileReaders {
    public static void main(String[] args) {
        String file = "C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\heyBestie";
        char[] fileChar = new char[1024];
        try(FileReader fileReader = new FileReader(file)){
            int numberOfCharacterRead = fileReader.read(fileChar);
            displayFileContent(numberOfCharacterRead, fileChar);
        }catch (IOException e) {
            System.err.printf("Error: %s",e.getMessage());
        }
    }

    private static void displayFileContent(int numberOfCharacterRead, char[] fileChar) {
        for (int i = 0; i < numberOfCharacterRead; i++) {
            System.out.print(fileChar[i]);
        }
    }
}


