package pt.pa.adts;

public class EmptyStackException extends RuntimeException {
    public EmptyStackException(String message) {
        super(message);
    }

    public EmptyStackException() {
        super("The stack is empty.");
    }
}