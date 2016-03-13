package goOnline;

public class ParseException extends Exception {

	@Override
    public String getMessage() {
        return "Something wrong in parsing function! ";
    }
}
