package ex13.interfaceMethods;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {

        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,3,5);
        System.out.println(multiplier.multiply(integerList)); //OP: 15

        System.out.println(multiplier.size(integerList)); //OP: 3

        System.out.println(Multiplier.isEmpty(integerList));//OP: false
    }
}
