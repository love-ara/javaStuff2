package files;

import java.io.*;

import static java.lang.System.out;

public class BufferedWriters {
    public static void main(String[] args){
        try(OutputStreamWriter writer = new OutputStreamWriter(out);
                BufferedWriter bufferedWriter = new BufferedWriter(writer)){
            bufferedWriter.write("Hello World");
        }catch (IOException e){
            System.err.println();
        }
    }

}
