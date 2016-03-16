package goIT.online;


import java.util.Random;
import java.util.Set;

public class SetTimeEfficiencyChecker {

    private int ITERATIONS_NUMBER = 200;
    private double ITERATIONS = 0.005;
    Random rn = new Random();


    public double addTimeWorkCecker(Set arraySource) {
        long result = 0;

        for (int i = 0; i < ITERATIONS_NUMBER; i++) {
            int position = rn.nextInt(arraySource.size());

            long startTime = System.currentTimeMillis();
            arraySource.add(position);
            long executingTime = System.currentTimeMillis() - startTime;

            result += executingTime;
        }

        return result * ITERATIONS;
    }

    public double removeTimeWorkChecker(Set arraySource) {
        long result = 0;

        for (int i = 0; i < ITERATIONS_NUMBER; i++) {
            int position = rn.nextInt(arraySource.size());

            long startTime = System.currentTimeMillis();
            arraySource.remove(position);
            long executingTime = System.currentTimeMillis() - startTime;

            result += executingTime;
        }

        return result * ITERATIONS;
    }

    public double containsTimeWorkChecker(Set arraySource) {
        long result = 0;
        for (int i = 0; i < ITERATIONS_NUMBER; i++) {
            int position = rn.nextInt(arraySource.size());

            long startTime = System.currentTimeMillis();
            arraySource.contains(position);
            long executingTime = System.currentTimeMillis() - startTime;

            result += executingTime;
        }

        return result * ITERATIONS;
    }

    public double populationTimeWorkChecker(Set arraySource, int capacity) {
        long result = 0;

        for (int i = 0; i < ITERATIONS_NUMBER; i++) {

            long startTime = System.currentTimeMillis();

            for (int j = 0; j < capacity; j++)
                arraySource.add(j);
            ;
            long executingTime = System.currentTimeMillis() - startTime;
            if (i < ITERATIONS_NUMBER - 1) {
                arraySource.clear();
            }
            result += executingTime;
        }

        return result * ITERATIONS;
    }

}
