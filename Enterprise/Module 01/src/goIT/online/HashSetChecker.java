package goIT.online;


import java.util.HashSet;
import java.util.Set;

public class HashSetChecker {
    int CAPACITY_TEN = 10000;
    int CAPACITY_HUNDRED = 100000;
    int CAPACITY_THOUSAND = 1000000;


    public void hashSetCheck() {
        Set setTen = new HashSet();

        SetTimeEfficiencyChecker check = new SetTimeEfficiencyChecker();
            double populationTimeTen = check.populationTimeWorkChecker(setTen, CAPACITY_TEN);
            double addTimeTen = check.addTimeWorkCecker(setTen);
            double containsTimeTen = check.containsTimeWorkChecker(setTen);
            double removeTimeTen = check.removeTimeWorkChecker(setTen);

        Set setHundred = new HashSet();
            double populationTimeHunred = check.populationTimeWorkChecker(setHundred, CAPACITY_HUNDRED);
            double addTimeHundred = check.addTimeWorkCecker(setHundred);
            double containsTimeHundred = check.containsTimeWorkChecker(setHundred);
            double removeTimeHundred = check.removeTimeWorkChecker(setHundred);

        Set setThousand = new HashSet();
        double populationTimeThousand = check.populationTimeWorkChecker(setThousand, CAPACITY_THOUSAND);
        double addTimeThousand = check.addTimeWorkCecker(setThousand);
        double containsTimeThousand = check.containsTimeWorkChecker(setThousand);
        double removeTimeThousand = check.removeTimeWorkChecker(setThousand);

        double averagePopulationTime = (populationTimeHunred + populationTimeTen + populationTimeThousand) / 3;
        double averageAddTime = (addTimeHundred + addTimeTen + addTimeThousand) / 3;
        double averageContainsTime = (containsTimeHundred + containsTimeTen + containsTimeThousand) / 3;
        double averageRemoveTime = (removeTimeHundred + removeTimeTen + removeTimeThousand) / 3;

        System.out.printf("HashSet \t %.3f \t  - \t %.3f     \t %.3f   " +
                "\t %.3f    \t -     " +
                " \t     - \n",averageAddTime, averageRemoveTime, averageContainsTime, averagePopulationTime);

    }
}

