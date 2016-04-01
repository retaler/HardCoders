/**
 * Created by retaler on 31.03.2016.
 */
public class TaskImplementation<T extends Number> implements Task {
    private T result;
    private T firstNumber;

    public TaskImplementation(T a) {
        firstNumber = a;
    }

    @Override
    public void execute() {
        result = firstNumber;
    }

    @Override
    public Object getResult() {
        return result;
    }
}
