package codewar;



public class Absolute {

    public int absol(int[] arr, int x, int y) {
        String s = "";
        for (int num : arr) {
            s += num;
        }

        int indexX = s.lastIndexOf(String.valueOf(x));
        int indexY = s.lastIndexOf(String.valueOf(y));

        int diff = indexX - indexY;

        return diff < 0 ? diff * -1 : diff;
    }


    }
