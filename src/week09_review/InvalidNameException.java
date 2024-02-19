package week09_review;

public class InvalidNameException extends RuntimeException {
    public InvalidNameException() {
        super("Invalid name is given");

    }

    public InvalidNameException(String message) {
        super(message);
    }
}
