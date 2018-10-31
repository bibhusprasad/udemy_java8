package ex12.optional;

import java.util.Optional;

public class $04_OptionalPresentExample {

    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("hello optional");
        System.out.println(optional.isPresent());

        optional.ifPresent(System.out::println);

        Optional<String> optional1 = Optional.ofNullable(null);
        System.out.println(optional1.isPresent());
    }
}
