package stream;

import java.util.concurrent.*;

public class Interfaces {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = ()-> "Hello from Callable!";
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(callable);
        String result = future.get();
        System.out.println(result);
        executor.shutdown();

        Runnable runnable = () -> System.out.println("Hello from Runnable");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
