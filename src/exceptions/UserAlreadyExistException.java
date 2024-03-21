package exceptions;

public class UserAlreadyExistException extends DiaryException {
    public UserAlreadyExistException(String message) {
        super(message);
    }
}
