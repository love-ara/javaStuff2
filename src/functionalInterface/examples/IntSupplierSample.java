package functionalInterface.examples;

import java.util.function.IntSupplier;

public class IntSupplierSample {
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> 10;

        System.out.println(intSupplier.getAsInt());
    }
}
