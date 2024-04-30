package files;

import java.io.PrintStream;

public class PrintStream_outStream {
    public static void main(String[] args) {
        String file = "C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\note.Md";
                try(PrintStream printStream = new PrintStream(System.out)){
                    printStream.println("Hello World");
                }catch(Exception ex){
                    System.err.println(ex.getMessage());
                }
    }
}
