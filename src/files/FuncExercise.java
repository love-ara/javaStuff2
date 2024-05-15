package files;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FuncExercise {

    public static void main(String[] args) throws IOException {
        FuncExercise func = new FuncExercise();
        BigDecimal totalAmount = func.fileFunc("C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\src\\files\\json\\Transaction.json");
        System.out.println(totalAmount);
    }

    public BigDecimal fileFunc(String jsonLocation) {

        JSONParser jsonParser = new JSONParser();

        try (FileReader fileReader = new FileReader(jsonLocation)) {

            JSONArray transactions = (JSONArray) jsonParser.parse(fileReader);
            double totalAmount = 0.0;

            for (Object obj : transactions) {
                JSONObject transaction = (JSONObject) obj;
                double amount = parseTransactionObject(transaction);
                totalAmount += amount;
            }

            return BigDecimal.valueOf(totalAmount);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return BigDecimal.valueOf(0.0);
    }

    private double parseTransactionObject(JSONObject transaction) {
        Double amount = (Double) transaction.get("amount");
        return amount != null ? amount : 0.0;
    }

    public int countNumberInTextFile(String location) {
        char[] fileChar = new char[1024];

        try(FileReader reader = new FileReader(location)){
            int numberOfCharacterRead = reader.read(fileChar);
            int counter = 0;
            for(int index = 0; index < numberOfCharacterRead; index ++){
                if(Character.isDigit(fileChar[index])){
                    counter+=1;

                }

            }
            return counter;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public int countNumberOfSentence(String fileLocation) throws IOException {
        Path path = Paths.get(fileLocation);
        String text = Files.readString(path);
        text = text.replaceAll("\\d\\.\\d", "");
        String[] words = text.split("[A-z0-9]\\.");
        return words.length;

    }


    public int countParagraphs(String filePath) throws IOException {
        List<String> paragraphs = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder paragraphContent = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty()) {
                    if (!paragraphContent.isEmpty()) {
                        paragraphs.add(paragraphContent.toString());
                        paragraphContent.setLength(0);
                    }
                } else {
                    paragraphContent.append(line).append("\n");
                }
            }

            if (!paragraphContent.isEmpty()) {
                paragraphs.add(paragraphContent.toString());
            }
        }

        return paragraphs.size();
    }



    public int countLines(String location) throws IOException {
        int paragraphCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(location))) {
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    paragraphCount++;
                }
            }
        }

        return paragraphCount;
    }


}
