package com.java8.features.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;
//Fork join framework
//no of thread is equal to  no of processors available
public class ParallelStream {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 50)
                .parallel()
//                .peek(value -> System.out.println(value))
                .sum();
        System.out.println(sum);
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    static long checkPerformanceResult(Supplier<Integer> supplier, int noOfTimes) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < noOfTimes; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
