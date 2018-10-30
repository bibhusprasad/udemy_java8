package ex09.numericStream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println(sum); //OP: 55

        OptionalInt max = IntStream.rangeClosed(1, 10).max();
        System.out.println(max.getAsInt());//OP: 10

        OptionalInt min = IntStream.rangeClosed(1, 10).min();
        System.out.println(min.getAsInt());//OP: 1

        OptionalDouble avg = IntStream.rangeClosed(1, 10).average();
        System.out.println(avg.getAsDouble());//OP: 5.5

    }
}
