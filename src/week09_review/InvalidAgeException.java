package week09_review;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException() {
        super("Invalid age is given");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
