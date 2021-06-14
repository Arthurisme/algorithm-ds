package concurrency;

import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SynchronizedSample {
//    private static int count = 0;
//
//      void increment() {
//        count = count + 1;
//    }


    private static int count = 0;

    private static void increment() {
        count = count + 1;
    }

    public static  void main( String arg[]) throws ExecutionException, InterruptedException {

        count = 0;


        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, 10000)
                .forEach(i -> executor.submit(SynchronizedSample::increment));

//        stop(executor);
        executor.shutdown();

        System.out.println(count);  // 9965


    }
}
