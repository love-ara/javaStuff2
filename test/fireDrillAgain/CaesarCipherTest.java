package fireDrillAgain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CaesarCipherTest {

    @Test
    public void encryptTest(){
        CaesarCipher cipher = new CaesarCipher();

        String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String expected = "QEB NRF@H ?OLTK CLU GRJMP LSBO QEB I>WV ALD";
        String actual = cipher.encrypt(plainText, -3);

        System.out.println(actual);
        assertEquals(expected, actual);
    }
}
