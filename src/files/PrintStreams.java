package files;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreams {

    public static void main(String[] args) {
        String file = "C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\heyBestie";
        try(PrintStream ps = new PrintStream(file);){
            ps.println("It's your world, it is your world baby oh, And I'm just living in it, it's your world baby oh!");
        }catch (IOException e) {
            System.err.printf("Error: %s", e.getMessage());
        }

    }
}
