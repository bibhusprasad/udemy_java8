package ex09.numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class $01_NumericStreamExample {

    public static int sumOfNumbers(List<Integer> integerList){
        return integerList.stream()
                .reduce(0, (x,y)->x+y); //Problem time is each time it unboxing and add
    }

    public static int sumOfNumbersIntStream(){
        return IntStream.rangeClosed(1,6)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println("$05_Sum : "+ sumOfNumbers(integerList));
        System.out.println("$05_Sum using IntStream : "+sumOfNumbersIntStream());
    }
}
