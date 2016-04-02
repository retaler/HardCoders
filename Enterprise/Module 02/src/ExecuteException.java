
public class ExecuteException extends Exception {

    public ExecuteException(String s) {
        super(s);
        System.out.print("Execute exception! \n" + s);
    }


}
