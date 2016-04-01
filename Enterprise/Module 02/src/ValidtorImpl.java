/**
 * Created by retaler on 01.04.2016.
 */
public class ValidtorImpl implements Validator {

    @Override
    public boolean isValid(Object result) {
        if ((Double)result >=0)return true;
        return false;
    }
}
