package concurrency;

import java.util.concurrent.*;

public class ScheduledExecutorSample {

    public static  void main( String arg[]) throws  InterruptedException {


        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());


        int initialDelay = 0;
        int period = 1;


        ScheduledFuture<?> future = executor.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);

        TimeUnit.MILLISECONDS.sleep(1337);

        long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
        System.out.printf("Remaining Delay: %sms", remainingDelay);



        System.out.println("yes.");
    }
}
