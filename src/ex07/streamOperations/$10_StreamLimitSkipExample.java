package ex07.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class $10_StreamLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integerList){
        return integerList.stream()
                //take 1st 2 number and add.
                .limit(2)
                .reduce((x,y)->x+y);

    }

    public static Optional<Integer> skip(List<Integer> integerList){
        return integerList.stream()
                //skip first two number add rest numbers
                .skip(2)
                .reduce((x,y)->x+y);

    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        System.out.println(limit(integerList).get()); //OP: 13
        System.out.println(skip(integerList).get()); //OP: 27

    }
}
