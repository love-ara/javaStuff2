package lambdasAndStreams;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierSample {

    public static void main(String[] args) {
//        Supplier<String> supplier = () -> "Hello World";
//        System.out.println(supplier.get());

        Supplier<Integer> supplier = () -> new Random().nextInt();
        System.out.println(supplier.get());

        Supplier<Boolean> supplier2 = () -> true;
    }
}
