package week09_review;

public class InvalidGenderException extends RuntimeException{

    public InvalidGenderException(String message) {
        super(message);
    }

    public InvalidGenderException() {
        super("Invalid gender is given");
    }
}
