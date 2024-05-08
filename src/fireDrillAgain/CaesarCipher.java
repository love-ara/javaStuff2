package fireDrillAgain;


public class CaesarCipher {

    public  String encrypt(String input, int shift) {
        StringBuilder result = new StringBuilder();

//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//            if (Character.isLetter(ch)) {
//                char base = Character.isUpperCase(ch) ? 'A' : 'a';
//                char shiftedChar = (char) ((ch - base + shift) % 26 + base);
//                result.append(shiftedChar);
//            } else {
//                result.append(ch);
//            }
//        }

        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                result.append(c);
                continue;
            }

            int unicodeValue = c;
            boolean condition = (Character.isLowerCase(c) && unicodeValue + shift > 'z')
                    || (Character.isUpperCase(c) && unicodeValue + shift > 'Z');
            unicodeValue = condition ? (unicodeValue + shift) - 26 : unicodeValue + shift;
            result.appendCodePoint(unicodeValue);
        }

        return result.toString();
    }

    public String decrypt(String input, int shift) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                result.append(c);
                continue;
            }

            int unicodeValue = c;
            boolean condition = (Character.isLowerCase(c) && unicodeValue - shift < 'a')
                    || (Character.isUpperCase(c) && unicodeValue - shift < 'A');
            unicodeValue = condition ? (26 + unicodeValue) - shift : unicodeValue -  shift;
            result.appendCodePoint(unicodeValue);
        }

        return result.toString();
    }

}




