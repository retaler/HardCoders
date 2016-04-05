import java.util.Arrays;
import java.util.concurrent.ExecutionException;

/**
 * Created by retaler on 03.04.2016.
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayCreator array = new ArrayCreator();


        SquareSumCalculator calculator = new SquareSumCalculator();
        int[] values = array.createArray(10);
        System.out.println("Source array: "+ Arrays.toString(values));

        long sumSquare=calculator.getSquareSum(values,2);

        System.out.println("Total result: "+sumSquare);



    }
}
