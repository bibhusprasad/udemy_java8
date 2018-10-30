package ex09.numericStream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStreamRangeExample {

    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1, 10);
        System.out.println("IntStream range : "+intStream.count());
        //IntStream range : 9
        IntStream.range(1, 10).forEach(value -> System.out.print(value+", "));
        //OP: 1, 2, 3, 4, 5, 6, 7, 8, 9,

        System.out.println();
        IntStream intStreamClosed = IntStream.rangeClosed(1, 10);
        System.out.println("IntStream range closed: "+intStreamClosed.count());
        //IntStream range closed: 10
        IntStream.rangeClosed(1, 10).forEach(value -> System.out.print(value+", "));
        //OP: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        System.out.println();
        System.out.println("LongStream range closed : "+LongStream.rangeClosed(1, 10).count());
        //LongStream range closed : 10
        LongStream.rangeClosed(1, 10).forEach(value -> System.out.print(value+", "));
        //OP: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        System.out.println();
        System.out.println("IntStream as DoubleStream range closed : "+IntStream.range(1, 10).asDoubleStream().count());
        //OP: IntStream as DoubleStream range closed : 9
        IntStream.range(1, 10).asDoubleStream().forEach(value -> System.out.print(value+", "));
        //OP: 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0,
    }
}
