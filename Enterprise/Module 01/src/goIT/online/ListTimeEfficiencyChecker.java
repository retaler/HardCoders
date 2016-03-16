package goIT.online;


import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListTimeEfficiencyChecker {
    private int ITERATIONS_NUMBER = 200;
    private double ITERATIONS = 0.005;
    Random rn = new Random();


    public double addTimeWorkCecker(List arraySource) {
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

    public double getTimeWorkChecker(List arraySource) {

        long result = 0;

        for (int i = 0; i < ITERATIONS_NUMBER; i++) {
            int position = rn.nextInt(arraySource.size());
            long startTime = System.currentTimeMillis();
            arraySource.get(position);
            long executingTime = System.currentTimeMillis() - startTime;

            result += executingTime;
        }

        return result * ITERATIONS;
    }

    public double removeTimeWorkChecker(List arraySource) {
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

    public double containsTimeWorkChecker(List arraySource) {
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

        return result * ITERATIONS;
    }

    public double addIteratorTimeWorkChecker(List arraySource) {
        long result = 0;
        ListIterator arrayIterator = arraySource.listIterator();

        for (int i = 0; i < ITERATIONS_NUMBER; i++) {
            long startTime = System.currentTimeMillis();
             arrayIterator.add(i);
            result += (System.currentTimeMillis() - startTime);
        }


        return result * ITERATIONS;
    }

    public double removeIteratorTimeWorkChecker(List arraySource) {
        long result = 0;
        ListIterator arrayIterator = arraySource.listIterator();

        for (int i = 0; i < ITERATIONS_NUMBER; i++) {

            long startTime = System.currentTimeMillis();
            arrayIterator.next();
            arrayIterator.remove();
            result += (System.currentTimeMillis() - startTime);
        }


        return result * ITERATIONS;
    }
}
