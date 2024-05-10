package fireDrillAgain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CaesarCipherTest {

    @Test
    public void encryptTest(){
        CaesarCipher cipher = new CaesarCipher();

        String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String plainText1 = "ATTACKATONCE";
        String plainText2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String expected = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        String expected1 = "EXXEGOEXSRGI";
        String expected2 = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        String actual = cipher.encrypt(plainText, 23);
        String actual1 = cipher.encrypt(plainText1, 4);
        String actual2 = cipher.encrypt(plainText2, 23);

            assertEquals(expected, actual);
          assertEquals(expected1, actual1);
           assertEquals(expected2, actual2);

        assertEquals("xfmdpnf", cipher.encrypt("welcome", 1));
        assertEquals("afmdpnf", cipher.encrypt("zelcome", 1));

    }

    @Test
    public void decryptTest(){
        CaesarCipher cipher = new CaesarCipher();
        String expected = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String expected1 = "ATTACKATONCE";
        String expected2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String plainText = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        String plainText1 = "EXXEGOEXSRGI";
        String plainText2 = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        String actual = cipher.decrypt(plainText, 23);
        String actual1 = cipher.decrypt(plainText1, 4);
        String actual2 = cipher.decrypt(plainText2, 23);

       assertEquals(expected, actual);
       assertEquals(expected1, actual1);        assertEquals(expected2, actual2);
        assertEquals("welcome", cipher.decrypt("xfmdpnf", 1));
        assertEquals("zelcome", cipher.decrypt("afmdpnf", 1));
    }
}
