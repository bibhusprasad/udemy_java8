package ex03.functionalInterface.consumer;

import java.util.function.Consumer;

/**
 * Accept String value
 * Upper Case Operation
 * Print the new String
 */
public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        consumer.accept("java8"); //OP: JAVA8
    }
}
