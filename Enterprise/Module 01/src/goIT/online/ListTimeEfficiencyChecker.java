package goIT.online;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTimeEfficiencyChecker {
    private int ITERATIONS_NUMBER = 200;
    private double ITERATIONS = 0.005;



    public double addTimeWorkCecker(List arraySource) {
        Random rn = new Random();
        int position = rn.nextInt(arraySource.size());
        long result = 0;
        for (int i = 0; i < ITERATIONS_NUMBER; i++) {
            position = rn.nextInt(arraySource.size());

            long startTime = System.currentTimeMillis();
            arraySource.add(position);
            long executingTime = System.currentTimeMillis() - startTime;

            result += executingTime;
        }

        return result*ITERATIONS;
    }

    public double getTimeWorkChecker(List arraySource) {
        Random rn = new Random();
        int position = rn.nextInt(arraySource.size());
        long result = 0;
        for (int i = 0; i < ITERATIONS_NUMBER; i++) {
            position = rn.nextInt(arraySource.size());

            long startTime = System.currentTimeMillis();
            arraySource.get(position);
            long executingTime = System.currentTimeMillis() - startTime;

            result += executingTime;
        }

        return result*ITERATIONS;
    }

    public double removeTimeWorkChecker(List arraySource) {
        Random rn = new Random();
        int position = rn.nextInt(arraySource.size());
        long result = 0;
        for (int i = 0; i < ITERATIONS_NUMBER; i++) {
            position = rn.nextInt(arraySource.size());

            long startTime = System.currentTimeMillis();
            arraySource.remove(position);
            long executingTime = System.currentTimeMillis() - startTime;

            result += executingTime;
        }

        return result*ITERATIONS;
    }

    public double containsTimeWorkChecker(List arraySource) {
        Random rn = new Random();
        int position = rn.nextInt(arraySource.size());
        long result = 0;
        for (int i = 0; i < ITERATIONS_NUMBER; i++) {
            position = rn.nextInt(arraySource.size());

            long startTime = System.currentTimeMillis();
            arraySource.contains(position);
            long executingTime = System.currentTimeMillis() - startTime;

            result += executingTime;
        }

        return result*ITERATIONS;
    }

    public double populationTimeWorkChecker(List arraySource, int capacity) {

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

        return result*ITERATIONS;
    }
}
