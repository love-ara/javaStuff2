package functionalInterface.examples;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionSample {
    public static void main(String[] args) {
        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (numberOne, numberTwo) -> numberOne * numberTwo;
        System.out.println(toDoubleBiFunction.applyAsDouble(1, 2));
    }
}
