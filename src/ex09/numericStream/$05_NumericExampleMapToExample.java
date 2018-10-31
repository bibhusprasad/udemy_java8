package ex09.numericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class $05_NumericExampleMapToExample {

    public static List<Integer> mapToObject(){
        return IntStream.rangeClosed(1,5)
                .mapToObj(i -> new Integer(i))
                .collect(Collectors.toList());
    }

    public static long mapToLong(){
        return IntStream.rangeClosed(1,5)
                .mapToLong(i -> i)//int stream to long stream
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,5)
                .mapToDouble(i -> i*2)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(mapToObject()); //OP: [1, 2, 3, 4, 5]
        System.out.println(mapToLong()); //OP: 15
        System.out.println(mapToDouble()); //OP: 30.0
    }
}
