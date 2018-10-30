package ex11.parallelStream;

import java.util.stream.IntStream;

public class ParallelStreamExample {

    static int sumSequentialStream(){
        return IntStream.rangeClosed(1, 100)
                .sum();
    }

    static int sumParallelStream(){
        return IntStream.rangeClosed(1, 100)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(sumSequentialStream()); //OP: 5050
        System.out.println(sumParallelStream()); //OP: 5050
    }
}
