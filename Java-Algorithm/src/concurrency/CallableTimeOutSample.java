package concurrency;

import java.util.concurrent.*;

public class CallableTimeOutSample {

    public static  void main( String arg[]) throws ExecutionException, InterruptedException, TimeoutException {



        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };


        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(task);

        System.out.println("future done? " + future.isDone());

//        executor.shutdownNow();
        Integer result = future.get(2, TimeUnit.SECONDS);

        System.out.println("future done? " + future.isDone());
        System.out.println("result: " + result);


        System.out.println("yes.");
    }
}
