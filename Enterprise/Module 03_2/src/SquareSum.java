import java.util.concurrent.ExecutionException;

/**
 * Created by retaler on 03.04.2016.
 */
public interface SquareSum {
    long getSquareSum(int[] values, int numberOfThreads) throws InterruptedException, ExecutionException;

}
