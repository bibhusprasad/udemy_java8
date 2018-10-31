package ex07.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class $09_StreamMaxExample {

    static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                .reduce(0, (x, y)-> x > y ? x : y);
    }

    static Optional<Integer> findMaxValueOptional(List<Integer> integerList){
        return integerList.stream()
                .reduce((x, y)-> x > y ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        List<Integer> integerListEmpty = Arrays.asList();
        System.out.println(findMaxValue(integerList));

        System.out.println("---Optional---");
        if(findMaxValueOptional(integerListEmpty).isPresent()){
            System.out.println(findMaxValueOptional(integerListEmpty).get());
        }else{
            System.out.println("List is empty.");
        }

        //OP:
        /*
        10
        ---Optional---
        List is empty.
         */
    }
}
