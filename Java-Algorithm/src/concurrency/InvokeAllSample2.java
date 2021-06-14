package concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllSample2 {


//    Callable<String>  task = () -> {
//        try {
//            TimeUnit.SECONDS.sleep(2);
//            return "abc";
//        }
//        catch (InterruptedException e) {
//            throw new IllegalStateException("task interrupted", e);
//        }
//    };

    public  static  Callable<String> callable() {
        return () -> {
            TimeUnit.SECONDS.sleep(2);
            return "abc";

        };
    }



    public static  void main( String arg[]) throws ExecutionException, InterruptedException, TimeoutException {





        ExecutorService executor = Executors.newWorkStealingPool();

        List<Callable<String>> callables = Arrays.asList(
                callable(),
                () -> "task2",
                () -> "task3",
                () -> "task");

        executor.invokeAll(callables)
                .stream()
                .map(future -> {
                    try {
                        return future.get();
                    }
                    catch (Exception e) {
                        throw new IllegalStateException(e);
                    }
                })
                .forEach(System.out::println);


        System.out.println("yes.");
    }
}
