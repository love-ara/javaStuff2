package deitelFive;

public class AppSums {

    public static int isItDivisibleBy3() {
        int sum = 0;
        int number = 1;
        for (int index = 1; index < 31; index++) {
            if (number % 3 == 0) {
                sum += number;
                number++;
            } else {
                sum = sum;
                number++;
            }

        }

        return sum;
    }
}
