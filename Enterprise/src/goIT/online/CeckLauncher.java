package goIT.online;


public class CeckLauncher extends ArrayListChecker {
    public static void main(String[] args) {
        ArrayListChecker chekArray = new ArrayListChecker();
        chekArray.arrayListCheck();
        LinkedListChecker checkList = new LinkedListChecker();
        checkList.linkedListCheck();
        HashSetChecker setCheck = new HashSetChecker();
        setCheck.hashSetCheck();
        TreeSetCecker treeSet = new TreeSetCecker();
        treeSet.treeSetCheck();
    }
}
