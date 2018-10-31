package ex03.functionalInterface.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class $04_BinaryOperatorExample {

    static Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;
        System.out.println(binaryOperator.apply(3, 4)); //OP: 12

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Max by : "+ maxBy.apply(4, 5)); //OP: Max by : 5

        BinaryOperator<Integer> minBy = BinaryOperator.maxBy(comparator);
        System.out.println("Min by : "+ minBy.apply(4, 5)); //OP: Min by : 5
    }
}
