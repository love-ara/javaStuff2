package fireDrillAgain;

public class AdditionFunction {

    public int additionFunction(int a, int b) {
        int sum = 0;

        if(a < 0){
            sum =(b-(-a));
        } else if (b < 0) {
            sum =(a-(-b));

        }else {
            sum -= (-a-b);

        }
        return sum;

    }


    public int addNumbers(int[] arr) {
        int sum = 0;

       for (int number : arr) {
           sum -= (-number);
       }
       return sum;
    }

}
