package fireDrillOne;

public class TaskThree {
    public static void main(String[] args) {
        int number = 10;
        int count = 0;
        int even = 0;
        int odd = 0;
        for (int index = 0; index <= number; index++) {
            if(count % 2 == 1) {
                odd = count;
                System.out.println(odd);
            }
            count++;

        }
    }
}
