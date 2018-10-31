package ex03.functionalInterface.function;

import java.util.function.UnaryOperator;

public class $05_UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = s -> s.concat("Default");
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Java8 ")); //OP: Java8 Default
    }
}
