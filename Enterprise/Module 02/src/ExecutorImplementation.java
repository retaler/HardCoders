import java.util.ArrayList;
import java.util.List;


public class ExecutorImplementation implements Executor {
    private List<Task> notExecutedTasks = new ArrayList<>();
    private List validResult = new ArrayList();
    private List invalidResult = new ArrayList();
    private boolean executeCall = false;




    @Override
    public void addTask(Object task) throws ExecuteException {
        if (executeCall) throw new ExecuteException("Method execute(); already launched!");
        else {

            notExecutedTasks.add((Task) task);
        }

    }

    @Override
    public void addTask(Object task, Object validator) throws ExecuteException {
        if (executeCall) throw new ExecuteException("Method execute(); already launched!");
        else {

            notExecutedTasks.add((Task) task);
            
        }

    }

    @Override
    public void execute() {
        // Выполнить все добавленые таски
        Number result;
        executeCall = true;
        for (Task forExecution : notExecutedTasks) {
            forExecution.execute();

        }

    }

    @Override
    public List getValidResults() {

        return validResult;
    }

    @Override
    public List getInvalidResults() {
        return invalidResult;
    }
}
