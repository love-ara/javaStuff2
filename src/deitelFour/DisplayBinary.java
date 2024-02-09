package deitelFour;
import java.util.Scanner;
import java.util.Arrays;


public class DisplayBinary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 0's and 1's: ");
        String num = input.next();
        int count = 0;
        int digit = Integer.parseInt(num);
        int total = 0;
        while(digit > 0){
            int temp = digit%10;
            total+= (int) (temp * Math.pow(2, count));
            digit /= 10;
            count++;
        }
        System.out.println(total);
    }
}