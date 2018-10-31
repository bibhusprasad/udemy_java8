package ex09.numericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class $04_NumericStreamBoxingUnboxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1, 10)
                //int
                .boxed()
                //integer
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList){
        //wrapper to int
        return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(boxing());//OP: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(unBoxing(boxing()));//OP: 55
    }
}
