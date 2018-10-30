package ex11.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamPerformanceExample {

    static long checkPerformance(Supplier<Integer> supplier, int noOfTimes){
        long startTime = System.currentTimeMillis();
        for(int i = 0 ; i <= noOfTimes; i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

    static int sumSequentialStream(){
        return IntStream.rangeClosed(1, 10000)
                .sum();
    }

    static int sumParallelStream(){
        return IntStream.rangeClosed(1, 100)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("sequential : "+checkPerformance(ParallelStreamPerformanceExample::sumSequentialStream, 20));
        System.out.println("parallel : "+checkPerformance(ParallelStreamPerformanceExample::sumParallelStream, 20));
        //OP:
        /*
        sequential : 36
        parallel : 33
         */
    }
}
