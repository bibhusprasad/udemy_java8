package ex01.imperativeVsDeclarative;

import java.util.stream.IntStream;

/**
 * Adding number 1 to 100
 */

public class ImperativeVsDeclarativeExample1 {

    public static void main(String[] args) {

        /*
         *  Imperative way
         */

        int sum = 0;
        for(int i = 1 ; i <= 100 ; i++){
            sum = sum + i;
        }
        System.out.println("Sum is : "+ sum); //OP: Sum is : 5050

        /*
         *  Declarative way
         */

        int sum1 = IntStream.rangeClosed(1, 100).sum();
        System.out.println("Sum1 is : "+ sum1); //OP: Sum1 is : 5050
    }
}
