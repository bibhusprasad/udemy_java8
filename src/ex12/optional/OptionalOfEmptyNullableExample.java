package ex12.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullale(){
        //return Optional.ofNullable("Hello"); //OP: ofNullable : Optional[Hello]
        return Optional.ofNullable(null); //OP: ofNullable : Optional.empty
    }

    public static Optional<String> of(){
        return Optional.of("Hello");//OP: of : Optional[Hello]
        //return Optional.of(null);//OP: Throws NPE. of always expect a value
    }

    public static Optional<String> empty(){
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println("ofNullable : "+ ofNullale());
        System.out.println("of : "+ of());
        System.out.println("empty : "+ empty());

        //OP:
        /*
        ofNullable : Optional.empty
        of : Optional[Hello]
        empty : Optional.empty
         */
    }
}
