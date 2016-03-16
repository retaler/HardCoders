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
        double containsTimeTen = check.containsTimeWorkChecker(arrTen);
        double removeTimeTen = check.removeTimeWorkChecker(arrTen);
        double iteratorAddTimeTen = check.addIteratorTimeWorkChecker(arrTen);
        double iteratorRemoveTimeTen = check.removeIteratorTimeWorkChecker(arrTen);

        List arrHundred = new ArrayList(CAPACITY_HUNDRED);
        double populationTimeHunred = check.populationTimeWorkChecker(arrHundred, CAPACITY_HUNDRED);
        double addTimeHundred = check.addTimeWorkCecker(arrHundred);
        double getTimeHundred = check.getTimeWorkChecker(arrHundred);
        double containsTimeHundred = check.containsTimeWorkChecker(arrHundred);
        double removeTimeHundred = check.removeTimeWorkChecker(arrHundred);
        double iteratorAddTimeHundred = check.addIteratorTimeWorkChecker(arrHundred);
        double iteratorRemoveTimeHundred = check.removeIteratorTimeWorkChecker(arrHundred);


        List arrThousand = new ArrayList(CAPACITY_THOUSAND);
        double populationTimeThousand = check.populationTimeWorkChecker(arrThousand, CAPACITY_THOUSAND);
        double addTimeThousand = check.addTimeWorkCecker(arrThousand);
        double getTimeThousand = check.getTimeWorkChecker(arrThousand);
        double containsTimeThousand = check.containsTimeWorkChecker(arrThousand);
        double removeTimeThousand = check.removeTimeWorkChecker(arrThousand);
        double iteratorAddTimeThousand = check.addIteratorTimeWorkChecker(arrThousand);
        double iteratorRemoveTimeThousand = check.removeIteratorTimeWorkChecker(arrThousand);

        double averagePopulationTime = (populationTimeHunred + populationTimeTen + populationTimeThousand) / 3;
        double averageAddTime = (addTimeHundred + addTimeTen + addTimeThousand) / 3;
        double averageGetTime = (getTimeHundred + getTimeTen + getTimeThousand) / 3;
        double averageContainsTime = (containsTimeHundred + containsTimeTen + containsTimeThousand) / 3;
        double averageRemoveTime = (removeTimeHundred + removeTimeTen + removeTimeThousand) / 3;
        double averageIterAddTime=(iteratorAddTimeHundred+iteratorAddTimeTen+iteratorAddTimeThousand)/3;
        double averageIterRemoveTime=(iteratorRemoveTimeHundred+iteratorRemoveTimeTen+iteratorRemoveTimeThousand)/3;

        System.out.printf("          \t add \t get \t remove \t contains \t populate \t iterator.add \t iterator.remove \t\n");
        System.out.printf("ArrayList \t %.3f \t %.3f \t %.3f     \t %.3f   " +
                "\t %.3f    \t %.3f     \t" +
                "     %.3f \n",averageAddTime, averageGetTime, averageRemoveTime, averageContainsTime, averagePopulationTime, averageIterAddTime, averageIterRemoveTime);


    }


}
