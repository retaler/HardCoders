package goIT.online;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionEfficiencyComparator {
    private int ITERATIONS_NUMBER = 200;


    public long addTimeArrayListCecker(List arraySource) {
        Random rn = new Random();
        int position = rn.nextInt(arraySource.size());
        long result = 0;
        for (int i = 0; i < ITERATIONS_NUMBER; i++) {
            position=rn.nextInt(arraySource.size());

            long startTime = System.currentTimeMillis();
            arraySource.add(position);
            long executingTime = System.currentTimeMillis() - startTime;

            result += executingTime;
        }

        return result;
    }

    public long getTimeArrayListChecker(List arraySource) {
        Random rn = new Random();
        int position = rn.nextInt(arraySource.size());
        long result = 0;
        for (int i = 0; i < ITERATIONS_NUMBER; i++) {
            position=rn.nextInt(arraySource.size());

            long startTime = System.currentTimeMillis();
            arraySource.get(position);
            long executingTime = System.currentTimeMillis() - startTime;

            result += executingTime;
        }

        return result;
    }
}
