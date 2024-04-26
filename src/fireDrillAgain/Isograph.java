package fireDrillAgain;

import java.util.ArrayList;
import java.util.List;

public class Isograph {

    public boolean containsAllAlphabets(String sentence) {
        sentence = sentence.strip();

        char[] chars = sentence.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char ch : chars) {
            if(!list.contains(ch)){
                list.add(ch);
            }
        }

        return list.size() == 26;
    }

    public boolean containsAllAlphabet(String sentence) {
        sentence = sentence.toLowerCase();

        boolean[] alphabetPresent = new boolean[26];

        for (int index = 0; index < sentence.length(); index++) {
            char character = sentence.charAt(index);
            if (character >= 'a' && character <= 'z') {
                alphabetPresent[character - 'a'] = true;
            }
        }

        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }

}
