package practise.lesson_12_exceptions.lessoncode.banksystem;

public class UserInputMismatchException extends RuntimeException {

    public UserInputMismatchException(String message) {
        super(message);
    }
}
