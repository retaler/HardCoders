package goIT.online;


public class CeckLauncher extends ArrayListChecker {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer();

        ArrayListChecker chekArray = new ArrayListChecker();
        buffer.append(chekArray.arrayListCheck());

        LinkedListChecker checkList = new LinkedListChecker();
        buffer.append(checkList.linkedListCheck());

        HashSetChecker setCheck = new HashSetChecker();
        buffer.append(setCheck.hashSetCheck());

        TreeSetCecker treeSet = new TreeSetCecker();
        buffer.append(treeSet.treeSetCheck());

        ResultFileWriter writer=new ResultFileWriter();
        writer.toFile(buffer);
    }
}
