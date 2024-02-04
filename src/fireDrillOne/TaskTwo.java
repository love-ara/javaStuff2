package fireDrillOne;

public class TaskTwo {
    public static void main(String[] args) {
        int number = 10;
        int count = 0;
        int even = 0;
        for (int index = 0; index <= number; index++) {
            if(count % 2 == 0) {
                even = count;
                System.out.println(even);
            }
                count++;

        }
    }
}

