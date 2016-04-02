
public class PositiveNegativeValidator implements Validator<Integer> {


    @Override
    public boolean isValid(Integer result) {
        if(result>=0)return true;
        return false;
    }
}
