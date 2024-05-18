package functionalInterface.assigment;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerFunc {
    public static void main(String[] args) {
        ObjIntConsumer<Object> objIntConsumer = (object, number)-> System.out.printf("%s is %d years old", object, number);

        objIntConsumer.accept("Aramide", 2);
    }


}
