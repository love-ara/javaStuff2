package files;

import java.io.InputStream;

import java.net.URL;

public class WebScraper {

public static void main(String[] args) {
     try{
         String location = "https://www.google.com/search?";
         URL url = new URL(location);
         InputStream inputStream = url.openStream();

         byte[] bytes = inputStream.readAllBytes();

         for (byte data : bytes) {
             System.out.println(Character.toString((char)data));
             System.out.println(Character.valueOf((char)data));
         }
     } catch (Exception e) {
         System.err.printf("Error: %s",e.getMessage());
         e.printStackTrace();
     }
}
}
