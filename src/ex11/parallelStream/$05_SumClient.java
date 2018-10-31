package ex11.parallelStream;

import java.util.stream.IntStream;

public class $05_SumClient {
    public static void main(String[] args) {
        $05_Sum sum = new $05_Sum();
        IntStream.rangeClosed(1, 1000)
                .forEach(sum::performSome);
        System.out.println(sum.getTotal()); //OP: 500500

        $05_Sum sumParallel = new $05_Sum();
        IntStream.rangeClosed(1, 1000)
                .parallel()
                .forEach(sumParallel::performSome);
        System.out.println(sumParallel.getTotal()); //OP: will get different values

    }
}
