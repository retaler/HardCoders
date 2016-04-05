import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SquareSumCalculator implements SquareSum {


    @Override
    public long getSquareSum(int[] values, int numberOfThreads) throws InterruptedException, ExecutionException {
        List<Callable<Long>> callable = new ArrayList<>();
        Phaser phaser = new Phaser(numberOfThreads);

        IntStream.range(0, numberOfThreads).forEach(i -> callable.add(() -> {

            int partLength = values.length / numberOfThreads;
            phaser.register();
            long tempResult = 0;
            int start = i * partLength;
            int end = (i + 1 == numberOfThreads) ? values.length : ((i + 1) * partLength);

            tempResult = calculator(Arrays.copyOfRange(values, start, end));

            phaser.arrive();
            phaser.arriveAndAwaitAdvance();
            System.out.println(Thread.currentThread().getName() + " calculate temporary result " + tempResult);
            return tempResult;
        }));
        ExecutorService service = Executors.newFixedThreadPool(numberOfThreads);
        long result = 0L;
        List<Future<Long>> results = service.invokeAll(callable);
        for (Future<Long> tempResults : results) {
            result += tempResults.get();
            service.shutdown();
        }
        return result;
    }


    public long calculator(int[] arrayPart) {

        long result = 0;
        for (int i = 0; i < arrayPart.length; i++) {
            result += Math.pow(arrayPart[i], 2);
        }
        return result;
    }
}


