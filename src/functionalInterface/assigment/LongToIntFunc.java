package functionalInterface.assigment;

import java.util.function.LongToIntFunction;

public class LongToIntFunc{
    public static void main(String[] args) {
        LongToIntFunction longToIntFunction = x -> (int) x;
        System.out.println(longToIntFunction.applyAsInt(10L));
    }
}
