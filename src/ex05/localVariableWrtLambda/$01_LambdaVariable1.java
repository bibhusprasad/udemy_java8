package ex05.localVariableWrtLambda;

import java.util.function.Consumer;

public class $01_LambdaVariable1 {

    public static void main(String[] args) {
        int i = 0;

        // Consumer<Integer> c1 = i -> System.out.println(i);
        //CE: Variable 'i' is already defined in the scope

        Consumer<Integer> c1 = i1 -> {
           // int i = 2;  //CE: Variable 'i' is already defined in the scope
            System.out.println(i); //OP: 0
        };

    }
}
