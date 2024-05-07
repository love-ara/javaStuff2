package files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreams {
    public static void main(String[] args) {
        String file = "C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\heyBestie";
        try(var inputStream = new FileInputStream(file);
            var dataInputStream = new DataInputStream(inputStream)){

            byte[] data = dataInputStream.readAllBytes();

            System.out.print(new String(data));
           // String s = dataInputStream.readUTF();
            //System.out.println(s);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}


