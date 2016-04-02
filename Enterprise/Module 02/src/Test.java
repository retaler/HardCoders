import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws ExecuteException {
        Executor tasksExecutor = new ExecutorIntegerImplementation();
        List<Task<Integer>> tasksList = new ArrayList();
        tasksList.add(new TaskIntegerSum(1, 2));
        tasksList.add(new TaskIntegerSum(-2, 1));
        tasksList.add(new TaskIntegerSum(15, 1897));
        tasksList.add(new TaskIntegerSum(-50, -2));

        try {
            for (Task<Integer> task : tasksList) {
                tasksExecutor.addTask(task);
            }

            tasksExecutor.addTask(new TaskIntegerSum(10, -15), new PositiveNegativeValidator());
            tasksExecutor.execute();
            List<Integer> validResult =tasksExecutor.getValidResults();

            for (Integer result:validResult ) {
                System.out.println(result);
            }
            List<Integer> invalidResult =tasksExecutor.getInvalidResults();

            for (Integer result:invalidResult ) {
                System.out.println(result);
            }
        } catch (ExecuteException e) {
            e.printStackTrace();
        }

    }
}
