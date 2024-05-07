package files;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) {
        String file = "C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\heyBestie";
        try(FileOutputStream fileOutputStream =
                new FileOutputStream(file, true)){
            fileOutputStream.write("\nInvest your money wisely, don't buy bone-straight or whatever Mr Femi said, phew...".getBytes());
        }catch(IOException e){
            e.printStackTrace();
            System.err.printf("Error: %s%n", e.getMessage());
        }

    }
}
