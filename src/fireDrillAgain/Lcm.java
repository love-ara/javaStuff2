package fireDrillAgain;

public class Lcm {

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int[] lcm(int... numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }
        return new int[]{result};
    }

    private static int gcdHcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int[] hcf(int... numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcdHcf(result, numbers[i]);
        }
        return new int[]{result};
    }


}
