package ex05.localVariableWrtLambda;

import java.util.function.Consumer;

public class $02_LambdaVariable2 {

    public static void main(String[] args) {

        int value = 4;

        Consumer<Integer> c1 = i -> {
            //value++;   CE: Variable used in lambda expression should be final or effectively final
            System.out.println(value+i);
        };

        //value=6; CE: ce at line System.out.println(value+i); as because we are using value inside lambda
        c1.accept(3);
    }
}
