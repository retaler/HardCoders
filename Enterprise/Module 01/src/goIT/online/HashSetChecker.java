package goIT.online;


import java.util.Formatter;
import java.util.HashSet;
import java.util.Set;

public class HashSetChecker {
    int[] capacity = {10000, 100000, 1000000};
    double[] populationTime = new double[capacity.length];
    double[] addTime = new double[capacity.length];
    double[] containsTime = new double[capacity.length];
    double[] removeTime = new double[capacity.length];


    public String hashSetCheck() {
        SetTimeEfficiencyChecker check = new SetTimeEfficiencyChecker();
        for (int i = 0; i < capacity.length; i++) {
        Set setSource = new HashSet();

            populationTime[i] = check.populationTimeWorkChecker(setSource, capacity[i]);
            addTime[i] = check.addTimeWorkCecker(setSource);
            containsTime[i] = check.containsTimeWorkChecker(setSource);
            removeTime[i] = check.removeTimeWorkChecker(setSource);

        }

        double averagePopulationTime = 0;
        double averageAddTime = 0;
        double averageContainsTime = 0;
        double averageRemoveTime = 0;

        for (int j = 0; j < capacity.length; j++) {

            averagePopulationTime += populationTime[j] / capacity.length;
            averageAddTime+=addTime[j]/capacity.length;
            averageContainsTime+=containsTime[j]/capacity.length;
            averageRemoveTime=removeTime[j]/capacity.length;

        }

        Formatter fr = new Formatter();
        fr.format("HashSet \t %.3f \t  - \t %.3f     \t %.3f   " +
                "\t %.3f    \t -     " +
                " \t     - \n", averageAddTime, averageRemoveTime, averageContainsTime, averagePopulationTime);
        String table = fr.toString();
        System.out.printf(table);
        return table;
    }
}

