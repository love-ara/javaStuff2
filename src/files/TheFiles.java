package files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TheFiles{
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\src ");
            //System.out.println(path.getRoot());
          //  Files.createFile(path);
            //Files.deleteIfExists(path);
            //Files.createTempFile("temp", ".txt");
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
            //directoryStream.forEach(System.out::println);
            directoryStream.forEach(System.out::println);

        }catch (IOException e) {

            e.printStackTrace();
        }
        Path path = Paths.get("C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\src");
        try(DirectoryStream<Path>  directoryStream = Files.newDirectoryStream(path)){
            directoryStream.forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
