package functionalInterface.examples;

import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hi Mr. Femi";

        System.out.println(supplier.get());
    }
}
