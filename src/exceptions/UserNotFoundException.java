package exceptions;

public class UserNotFoundException extends DiaryException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
