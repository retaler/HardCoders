package goIT.online;


import java.util.Formatter;
import java.util.LinkedList;
import java.util.List;

public class LinkedListChecker {
    int CAPACITY_TEN = 10000;
    int CAPACITY_HUNDRED = 100000;
    int CAPACITY_THOUSAND = 1000000;


    public String linkedListCheck() {
        List linkedListTen = new LinkedList();

        ListTimeEfficiencyChecker check = new ListTimeEfficiencyChecker();
        double populationTimeTen = check.populationTimeWorkChecker(linkedListTen, CAPACITY_TEN);
        double addTimeTen = check.addTimeWorkCecker(linkedListTen);
        double getTimeTen = check.getTimeWorkChecker(linkedListTen);
        double containsTimeTen = check.containsTimeWorkChecker(linkedListTen);
        double removeTimeTen = check.removeTimeWorkChecker(linkedListTen);
        double iteratorAddTimeTen = check.addIteratorTimeWorkChecker(linkedListTen);
        double iteratorRemoveTimeTen = check.removeIteratorTimeWorkChecker(linkedListTen);

        List linkedListHundred = new LinkedList();
        double populationTimeHunred = check.populationTimeWorkChecker(linkedListHundred, CAPACITY_HUNDRED);
        double addTimeHundred = check.addTimeWorkCecker(linkedListHundred);
        double getTimeHundred = check.getTimeWorkChecker(linkedListHundred);
        double containsTimeHundred = check.containsTimeWorkChecker(linkedListHundred);
        double removeTimeHundred = check.removeTimeWorkChecker(linkedListHundred);
        double iteratorAddTimeHundred = check.addIteratorTimeWorkChecker(linkedListHundred);
        double iteratorRemoveTimeHundred = check.removeIteratorTimeWorkChecker(linkedListHundred);


        List linkedListThousand = new LinkedList();
        double populationTimeThousand = check.populationTimeWorkChecker(linkedListThousand, CAPACITY_THOUSAND);
        double addTimeThousand = check.addTimeWorkCecker(linkedListThousand);
        double getTimeThousand = check.getTimeWorkChecker(linkedListThousand);
        double containsTimeThousand = check.containsTimeWorkChecker(linkedListThousand);
        double removeTimeThousand = check.removeTimeWorkChecker(linkedListThousand);
        double iteratorAddTimeThousand = check.addIteratorTimeWorkChecker(linkedListThousand);
        double iteratorRemoveTimeThousand = check.removeIteratorTimeWorkChecker(linkedListThousand);

        double averagePopulationTime = (populationTimeHunred + populationTimeTen + populationTimeThousand) / 3;
        double averageAddTime = (addTimeHundred + addTimeTen + addTimeThousand) / 3;
        double averageGetTime = (getTimeHundred + getTimeTen + getTimeThousand) / 3;
        double averageContainsTime = (containsTimeHundred + containsTimeTen + containsTimeThousand) / 3;
        double averageRemoveTime = (removeTimeHundred + removeTimeTen + removeTimeThousand) / 3;
        double averageIterAddTime = (iteratorAddTimeHundred + iteratorAddTimeTen + iteratorAddTimeThousand) / 3;
        double averageIterRemoveTime = (iteratorRemoveTimeHundred + iteratorRemoveTimeTen + iteratorRemoveTimeThousand) / 3;


        Formatter fr = new Formatter();

        fr.format("LinkedList \t %.3f \t %.3f \t %.3f     \t %.3f   " +
                "\t %.3f    \t %.3f     \t" +
                "     %.3f\n", averageAddTime, averageGetTime, averageRemoveTime, averageContainsTime, averagePopulationTime, averageIterAddTime, averageIterRemoveTime);
        String table = fr.toString();
        System.out.printf(table);

        return table;


    }

}
