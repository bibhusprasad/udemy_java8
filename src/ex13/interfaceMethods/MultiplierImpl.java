package ex13.interfaceMethods;

import java.util.List;

public class MultiplierImpl implements Multiplier {

    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1,(integer1, integer2) -> integer1 * integer2);
    }

    public int size(List<Integer> integerList){
        System.out.println("Inside MultiplierImpl");
        return integerList.size();
    }
}
