package ex08.streamFactoryMethod;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

    public static void main(String[] args) {
        Stream<String> names = Stream.of("adam", "den", "julie");
        names.forEach(System.out::println);
        //OP:
        /*
        adam
        den
        julie
         */

        Stream.iterate(1, x-> x*2)
                .limit(10)
                .forEach(System.out::println);
        //OP:
        /*
        1
        2
        4
        8
        16
        32
        64
        128
        256
        512
         */

        Supplier<Integer> supplier = new Random() :: nextInt;
        Stream.generate(supplier)
                .limit(5)
                .forEach(System.out::println);

        //OP:
        /*
        413243430
        1406974433
        56595838
        1780822716
        -1169615266
         */
    }
}
