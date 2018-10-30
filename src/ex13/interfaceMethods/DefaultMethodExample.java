package ex13.interfaceMethods;

import java.util.*;
import java.util.stream.Collectors;

public class DefaultMethodExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");

        /**
         * prior java 8
         */
        Collections.sort(names);
        System.out.println(names); //OP: [Adam, Alex, Dan, Eric, Jenny, Mike]

        /**
         * Java8
         */
        names.sort(Comparator.reverseOrder());
        System.out.println(names);//OP: [Mike, Jenny, Eric, Dan, Alex, Adam]
    }
}
