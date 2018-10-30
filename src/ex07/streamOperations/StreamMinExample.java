package ex07.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {

    static int findMinValue(List<Integer> integerList){
        return integerList.stream()
                //x hold result value. x = 0; y = 6 . 0 < 6 true then 0 assign to x. so value always 0
                .reduce(0, (x, y)-> x < y ? x : y);
    }

    static Optional<Integer> findMinValueOptional(List<Integer> integerList){
        return integerList.stream()
                .reduce((x, y)-> x < y ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        System.out.println(findMinValue(integerList));

        System.out.println("---Optional---");
        if(findMinValueOptional(integerList).isPresent()){
            System.out.println(findMinValueOptional(integerList).get());
        }else{
            System.out.println("List is empty.");
        }

        //OP:
        /*
        0
        ---Optional---
        6
         */
    }
}
