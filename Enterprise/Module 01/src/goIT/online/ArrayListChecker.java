package goIT.online;

import java.util.ArrayList;
import java.util.List;


public class ArrayListChecker {
    int CAPACITY_TEN = 10000;
    int CAPACITY_HUNDRED = 100000;
    int CAPACITY_THOUSAND = 1000000;


    public void arrayListCheck() {
        List arrTen = new ArrayList(CAPACITY_TEN);

        ListTimeEfficiencyChecker check = new ListTimeEfficiencyChecker();
        double populationTimeTen = check.populationTimeWorkChecker(arrTen, CAPACITY_TEN);
        double addTimeTen = check.addTimeWorkCecker(arrTen);
        double getTimeTen = check.getTimeWorkChecker(arrTen);
        double containsTimeTen=check.containsTimeWorkChecker(arrTen);
        double removeTimeTen=check.removeTimeWorkChecker(arrTen);

        List arrHundred = new ArrayList(CAPACITY_HUNDRED);
        double populationTimeHunred = check.populationTimeWorkChecker(arrHundred, CAPACITY_HUNDRED);
        double addTimeHundred = check.addTimeWorkCecker(arrHundred);
        double getTimeHundred = check.getTimeWorkChecker(arrHundred);
        double containsTimeHundred=check.containsTimeWorkChecker(arrHundred);
        double removeTimeHundred=check.removeTimeWorkChecker(arrHundred);


        List arrThousand = new ArrayList(CAPACITY_THOUSAND);
        double populationTimeThousand = check.populationTimeWorkChecker(arrThousand, CAPACITY_THOUSAND);
        double addTimeThousand = check.addTimeWorkCecker(arrThousand);
        double getTimeThousand = check.getTimeWorkChecker(arrThousand);
        double containsTimeThousand=check.containsTimeWorkChecker(arrThousand);
        double removeTimeThousand=check.removeTimeWorkChecker(arrThousand);

        double averagePopulationTime = (populationTimeHunred+populationTimeTen+populationTimeThousand)/3;
        double averageAddTime = (addTimeHundred+addTimeTen+addTimeThousand)/3;
        double averageGetTime = (getTimeHundred+getTimeTen+getTimeThousand)/3;
        double averageContainsTime=(containsTimeHundred+containsTimeTen+containsTimeThousand)/3;
        double averageRemoveTime=(removeTimeHundred+removeTimeTen+removeTimeThousand)/3;

        System.out.printf("add elements complexity:  %.3f %n", averageAddTime );
        System.out.printf("population elements complexity:  %.3f %n", averagePopulationTime );
        System.out.printf("get elements complexity:  %.3f %n", averageGetTime );
        System.out.printf("contains elements complexity:  %.3f %n", averageContainsTime );
        System.out.printf("remove elements complexity:  %.3f %n", averageRemoveTime );

    }


}
