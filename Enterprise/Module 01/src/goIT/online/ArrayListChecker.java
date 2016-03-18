package goIT.online;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;


public class ArrayListChecker {
    int[] capacity = {10000, 100000, 1000000};
    double[] populationTime = new double[capacity.length];
    double[] addTime = new double[capacity.length];
    double[] getTime = new double[capacity.length];
    double[] containsTime = new double[capacity.length];
    double[] removeTime = new double[capacity.length];
    double[] iteratorAddTime = new double[capacity.length];
    double[] iteratorRemoveTime = new double[capacity.length];



    public String arrayListCheck() {
        ListTimeEfficiencyChecker check = new ListTimeEfficiencyChecker();
        for (int i = 0; i < capacity.length; i++) {
            List arraySource = new ArrayList(capacity[i]);

            populationTime[i] = check.populationTimeWorkChecker(arraySource, capacity[i]);
            addTime[i] = check.addTimeWorkCecker(arraySource);
            getTime[i] = check.getTimeWorkChecker(arraySource);
            containsTime[i] = check.containsTimeWorkChecker(arraySource);
            removeTime[i] = check.removeTimeWorkChecker(arraySource);
            iteratorAddTime[i] = check.addIteratorTimeWorkChecker(arraySource);
            iteratorRemoveTime[i] = check.removeIteratorTimeWorkChecker(arraySource);
        }

            double averagePopulationTime = 0;
            double averageAddTime = 0;
            double averageGetTime = 0;
            double averageContainsTime = 0;
            double averageRemoveTime = 0;
            double averageIterAddTime=0;
            double averageIterRemoveTime = 0;

        for (int j = 0; j < capacity.length; j++) {
            averagePopulationTime += populationTime[j] / capacity.length;
            averageAddTime+=addTime[j]/capacity.length;
            averageGetTime+=getTime[j]/capacity.length;
            averageContainsTime+=containsTime[j]/capacity.length;
            averageRemoveTime=removeTime[j]/capacity.length;
            averageIterAddTime += iteratorAddTime[j]/capacity.length;
            averageIterRemoveTime+=iteratorRemoveTime[j]/capacity.length;
        }
        Formatter fr = new Formatter();
        fr.format("          \t add \t get \t remove \t contains \t populate \t iterator.add \t iterator.remove \t\n");
        fr.format("ArrayList \t %.3f \t %.3f \t %.3f     \t %.3f   " +
                "\t %.3f    \t %.3f     \t" +
                "     %.3f \n", averageAddTime, averageGetTime, averageRemoveTime, averageContainsTime,
                averagePopulationTime, averageIterAddTime, averageIterRemoveTime);

        String table = fr.toString();
        System.out.printf(table);
        return table;


    }


}
