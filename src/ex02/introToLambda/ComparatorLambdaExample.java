package ex02.introToLambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /*
         * prior to Java 8
         */

        // 0 if o1 == o2, -1 if o1 < o2, 1 if o1 > o2
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Compare two integer : " + comparator.compare(2, 3)); //OP: Compare two integer : -1


        /*
         * using lambda Java 8
         */

        Comparator<Integer> comparatorLambda = (o1, o2) -> o1.compareTo(o2);
        System.out.println("Compare two integer using Lambda: " + comparatorLambda.compare(4, 3)); //OP: Compare two integer using Lambda: 1
    }
}
