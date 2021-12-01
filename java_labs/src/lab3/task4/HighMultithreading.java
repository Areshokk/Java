package lab3.task4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HighMultithreading {
    public static void main(final String[] args) {
        final ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(()->Operations.sum(5,5));
        executor.submit(()->Operations.sub(5,5));
        executor.submit(()->Operations.mult(5,5));

        try{
            executor.shutdown();
        } catch (final Exception e){
            executor.shutdown();
        }

    }
}
/*submit поверта обєкт інтерфейса Future*/