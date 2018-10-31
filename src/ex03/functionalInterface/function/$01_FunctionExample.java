package ex03.functionalInterface.function;

import java.util.function.Function;

public class $01_FunctionExample {

    static Function<String, String> function = s1 -> s1.toUpperCase();
    static Function<String, String> addSome = s1 -> s1.toUpperCase().concat(" java8");


    public static void main(String[] args) {
        System.out.println(function.apply("bibhu")); //OP: BIBHU
        System.out.println(function.andThen(addSome).apply("bibhu")); //OP: BIBHU java8
        System.out.println(function.compose(addSome).apply("bibhu")); //OP: BIBHU JAVA8
    }
}
