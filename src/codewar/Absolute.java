
package codewar;



public class Absolute {

    public int abs(int[] arr, int x, int y) {
        String s = "";
        for (int num : arr) {
            s += num;
        }

        int indexX = s.lastIndexOf(String.valueOf(x));
        int indexY = s.lastIndexOf(String.valueOf(y));

        int diff = indexX - indexY;

        return diff < 0 ? diff * -1 : diff;
    }

    public static int findMinAbsDifferenceOf(int x, int y, int... numbers) {
        int xIndex = -1;
        int yIndex = -1;
        int difference = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;

        for (int index = 0; index < numbers.length; index++) {
            xIndex = numbers[index] == x ? index : xIndex;
            yIndex = numbers[index] == y ? index : yIndex;

            if (xIndex != -1 && yIndex != -1) difference = Math.abs(xIndex - yIndex);
            if (difference < min) min = difference;
        }

        return min;
    }

}
