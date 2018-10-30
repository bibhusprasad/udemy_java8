package ex03.functionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p1 = number -> number % 2 == 0;
    static Predicate<Integer> p2 = number -> number % 5 == 0;

    static void predicateTest(){
        System.out.println("Predicate And Result "+ p1.and(p2).test(10)); //OP: Predicate And Result true
        System.out.println("Predicate And Result "+ p1.and(p2).test(9)); //OP: Predicate And Result false

        System.out.println("Predicate Or Result "+ p1.or(p2).test(15)); //OP: Predicate Or Result true
        System.out.println("Predicate Or Result "+ p1.and(p2).test(9)); //OP: Predicate Or Result false

        System.out.println("Predicate Negate Result "+ p1.or(p2).negate().test(9)); //OP: Predicate Negate Result true
    }

    public static void main(String[] args) {
        System.out.println("Is Even number : " + p1.test(4)); //OP: Is Even number : true
        predicateTest();
    }
}
