package functionalInterface.examples;

import java.util.function.BooleanSupplier;

public class BooleanSupplierSample {
    public static void main(String[] args) {
        BooleanSupplier supplier = () -> true;

        System.out.println(supplier.getAsBoolean());
    }
}
