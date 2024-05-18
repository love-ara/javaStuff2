package functionalInterface.examples;

import java.util.function.DoubleSupplier;

public class DoubleSupplierSample {
    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = () -> Math.random();

        System.out.println(doubleSupplier.getAsDouble());
    }
}
