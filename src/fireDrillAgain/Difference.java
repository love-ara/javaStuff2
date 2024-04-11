package fireDrillAgain;

public class Difference {

//    public int getDifference(int i, int i1) {
//        return Math.abs(i - i1);
//    }
    public int getDifference(int a, int b) {
        int difference;
        if(a == b){
            difference = 0;
        }
        else if(a<b){
            difference = b-a;
        }else {
            difference = a - b;
        }
        return difference;
    }
}
