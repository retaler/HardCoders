import java.util.ArrayList;
import java.util.List;



public class ExecutorIntegerImplementation implements Executor<Task<Integer>, Validator<Integer>> {
    private List<Task<Integer>> notExecutedTasks = new ArrayList<>();
    private List<Integer> validResult = new ArrayList();
    private List<Integer> invalidResult = new ArrayList();
    private Validator<Integer> validator;
    private Task<Integer> task;
    private boolean executeCall = false;


    @Override
    public void addTask(Task<Integer> integerTask) throws ExecuteException {
        this.task=integerTask;
        if (executeCall) throw new ExecuteException("Method execute(); already launched!");
        else {

            notExecutedTasks.add(integerTask);
        }
    }

    @Override
    public void addTask(Task<Integer> integerTask, Validator<Integer> integerValidator) throws ExecuteException {
        this.task=integerTask;
        if (executeCall) throw new ExecuteException("Method execute() already launched!");
        else {

            this.validator=integerValidator;
            notExecutedTasks.add(integerTask);
        }
    }

    @Override
    public void execute() {
        executeCall = true;
        for (Task<Integer> forExecution : notExecutedTasks) {
            forExecution.execute();
            if(validator.isValid(forExecution.getResult())){
                validResult.add(forExecution.getResult());
            }else {
                invalidResult.add(forExecution.getResult());
            }
        }
    }

    @Override
    public List<Integer> getValidResults() throws ExecuteException {
        if (!executeCall)throw new ExecuteException("Method execute have not been launched !");
        return validResult;
    }

    @Override
    public List<Integer> getInvalidResults() throws ExecuteException{
        if (!executeCall)throw new ExecuteException("Method execute have not been launched !");
        return invalidResult;
    }
}
