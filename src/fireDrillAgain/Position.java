package fireDrillAgain;

import java.util.Arrays;

public class Position {
    public int[] checkPosition(int[] grades) {
        int length = grades.length;
        int[] positions = new int[length];

        Arrays.fill(positions, 1);

        for (int index = 0; index < length; index++) {
            for (int grade : grades) {
                if (grade < grades[index]) {
                    positions[index]++;
                }
            }
        }

        return positions;
    }
}