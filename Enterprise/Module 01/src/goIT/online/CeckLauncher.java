package goIT.online;

import java.util.ArrayList;
import java.util.List;

public class CeckLauncher {
    public static void main(String[] args) {
        int CAPACITY_TEN=10000;
        int CAPACITY_HUNDRED=100000;
        int CAPACITY_THOUSAND=1000000;
        double ITERATIONS=0.005;
        List arrTen = new ArrayList(CAPACITY_TEN);

        CollectionEfficiencyComparator check = new CollectionEfficiencyComparator();
        for(int i=0;i<CAPACITY_TEN;i++)arrTen.add(i);

        System.out.printf("add %d elements complexity: %.3f %n",CAPACITY_TEN,check.addTimeArrayListCecker(arrTen)*ITERATIONS);
        System.out.printf("get %d elements complexity: %.3f %n",CAPACITY_TEN,check.getTimeArrayListChecker(arrTen)*ITERATIONS);

        List arrHundred = new ArrayList(CAPACITY_HUNDRED);
        for(int i=0;i<CAPACITY_HUNDRED;i++)arrHundred.add(i);

        System.out.printf("add %d elements complexity: %.3f %n",CAPACITY_HUNDRED,check.addTimeArrayListCecker(arrHundred)*ITERATIONS);
        System.out.printf("get %d elements complexity: %.3f %n",CAPACITY_HUNDRED,check.getTimeArrayListChecker(arrHundred)*ITERATIONS);
        List arrThousand = new ArrayList(1000000);
        for(int i=0;i<1000000;i++)arrThousand.add(i);
        System.out.printf("add %d elements complexity: %.3f %n",CAPACITY_THOUSAND,check.addTimeArrayListCecker(arrThousand)*ITERATIONS);
        System.out.printf("get %d elements complexity: %.3f %n",CAPACITY_THOUSAND,check.getTimeArrayListChecker(arrThousand)*ITERATIONS);
    }
}
