package ex11.parallelStream;

import java.util.stream.IntStream;

public class SumClient {
    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream.rangeClosed(1, 1000)
                .forEach(sum::performSome);
        System.out.println(sum.getTotal()); //OP: 500500

        Sum sumParallel = new Sum();
        IntStream.rangeClosed(1, 1000)
                .parallel()
                .forEach(sumParallel::performSome);
        System.out.println(sumParallel.getTotal()); //OP: will get different values

    }
}
