package string;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class DataValidatorTest {

    @Test
    public void testValidatePhoneNumber() {
        String phoneNumber = "09035067896";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber2(){
        String phoneNumber = "+234-9035067896";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }
}
