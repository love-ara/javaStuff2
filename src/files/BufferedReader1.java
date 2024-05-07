package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class BufferedReader1 {
    public static void main(String[] args)  {
        try(InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr)){
            System.out.println("Enter the line of text: ");
    String data = reader.readLine();
            System.out.printf("You entered: %s", data);
        }catch(IOException e){
            System.out.printf("ERROR: %s", e.getMessage());
        }
    }
}
