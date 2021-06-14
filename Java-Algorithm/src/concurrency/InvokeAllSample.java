package concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllSample {

    public static  void main( String arg[]) throws ExecutionException, InterruptedException, TimeoutException {



        Callable<Integer>  task = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };

        ExecutorService executor = Executors.newWorkStealingPool();

        List<Callable<String>> callables = Arrays.asList(
                () -> "task1",
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
