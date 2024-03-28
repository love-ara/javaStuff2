package fireDrillAgain;


public class Diff {

    public int[] getDiff(int... numbers) {
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        return new int[]{max - min};


    }
}

//    public int[] getDiff(int... numbers) {
//        return new int[]{Arrays.stream(numbers).max().getAsInt() - Arrays.stream(numbers).min().getAsInt()};
//    }
