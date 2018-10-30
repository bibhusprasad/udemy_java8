package ex01.imperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * remove duplicate number from list
 */
public class ImperativeVsDeclarativeExample2 {

    public static void main(String[] args) {

        /*
         *  Imperative way
         */

        List<Integer> sum = Arrays.asList(1,2,2,3,3,3,4,5,5,6,6,7,7,7,8,9,10,10);
        List<Integer> uniqueList = new ArrayList<>();

        for(Integer number : sum){
            if(!uniqueList.contains(number)){
                uniqueList.add(number);
            }
        }

        System.out.println("uniqueList : "+ uniqueList); //OP: uniqueList : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        /*
         *  Declarative way
         */

        List<Integer> uniqueList1 = sum.stream()
                                        .distinct()
                                        .collect(Collectors.toList());

        System.out.println("uniqueList1 : "+ uniqueList1); //OP: uniqueList1 : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
