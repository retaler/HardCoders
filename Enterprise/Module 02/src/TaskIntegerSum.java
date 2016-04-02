
public class TaskIntegerSum implements Task<Integer> {
    private Integer result = 0;
    private Integer firstNumber;
    private Integer secondNumber;

    public TaskIntegerSum(Integer first, Integer second) {
        firstNumber = first;
        secondNumber = second;
    }

    @Override
    public void execute() {
        result = firstNumber + secondNumber;
    }

    @Override
    public Integer getResult() {
        return result;
    }
}
