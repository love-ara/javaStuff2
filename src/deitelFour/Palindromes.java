package deitelFour;
import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a five-digit number i.e 12345: ");
        String fiveDigit = input.next();
        if(fiveDigit.length() != 5){
            System.out.print("Enter a five-digit number i.e 12345: ");
            fiveDigit = input.next();
        }
        int aDigit = Integer.parseInt(fiveDigit);

        int firstNum = aDigit/10000;
        int rem = aDigit% 10000;
        int secondNum = rem/1000;
        int rem1 = aDigit%1000;
        int thirdNum = rem1/100;
        int rem2 = aDigit % 100;
        int fourthNum = rem2/10;
        int lastNum = aDigit%10;

        String newDigit = "" + lastNum + fourthNum + thirdNum + secondNum + firstNum;
        System.out.println(newDigit);
        if(fiveDigit.equals(newDigit)) {
            System.out.print(fiveDigit + " is a palindrome");
        }else if(fiveDigit!=newDigit) {
            System.out.print(fiveDigit + " is not a palindrome");
        }


    }

}
