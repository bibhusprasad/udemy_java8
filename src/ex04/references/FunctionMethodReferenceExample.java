package ex04.references;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> function = string -> string.toUpperCase();
    static Function<String, String> function1 = String :: toUpperCase;

    public static void main(String[] args) {
        System.out.println(function.apply("bibhu")); //OP: BIBHU
        System.out.println(function1.apply("bibhu")); //OP: BIBHU
    }
}
