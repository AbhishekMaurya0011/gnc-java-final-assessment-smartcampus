// Custom Exception class to handle invalid fee input
public class InvalidFeeException extends Exception {

    // Constructor that accepts error message
    public InvalidFeeException(String message) {
        super(message);
    }
}
