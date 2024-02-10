package deitelFive;

public class SumOfASeries {

    public static int sumsOfSequences(){
        int sum = 0;
        int range = 1;
        for(int index = 1; index < 101; index++){
            sum += index;
            range++;
        }
        return sum;
    }
}
