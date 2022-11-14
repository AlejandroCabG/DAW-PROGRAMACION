package EX_01;

public class NegativeNumberException extends Exception{
    //Constructor
    public NegativeNumberException() {
    }
    //Constructor con un parámetro de tipo String
    public NegativeNumberException(String message) {
        super(message);
    }
}
