
public interface Validator<Object> {

    // Валидирует переданое значение
    boolean isValid(Object result);

}
