package fireDrillAgain;


public class CaesarCipher {

    public  String encrypt(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);

            if (ch == ' ') {
                ciphertext.append(ch);
                continue;
            }

            if (Character.isUpperCase(ch)) {
                char encryptedChar = (char) ((ch + shift - 'A') % 26 + 'A');
                ciphertext.append(encryptedChar);
            }
            else if (Character.isLowerCase(ch)) {
                char encryptedChar = (char) ((ch + shift - 'a') % 26 + 'a');
                ciphertext.append(encryptedChar);
            }
            else {
                ciphertext.append(ch);
            }
        }

        return ciphertext.toString();
    }
}



