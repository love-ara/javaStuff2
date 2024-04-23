package string;

public class DataValidator {


    public static boolean isPhoneNumberValid(String phoneNumber) {
        phoneNumber = phoneNumber.replaceAll(" ", "");
       // boolean isPhoneNumberValid = phoneNumber.length() == 11;
       // String regex = "(\\+234-)?\\d{10}$";
        String regex = "((234|\\+234)-?|0)?(70|[8-9][0-1])\\d{8}";
        //return isPhoneNumberValid && phoneNumber.matches(regex) || isPhoneNumberWithValidAreaCode(phoneNumber);
        return phoneNumber.matches(regex);
    }

    private static  boolean isPhoneNumberWithValidCountryCode(String phoneNumber) {
        return phoneNumber.startsWith("+234-");
    }

}
