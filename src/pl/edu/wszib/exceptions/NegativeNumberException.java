package pl.edu.wszib.exceptions;

public class NegativeNumberException extends Exception{

    public NegativeNumberException() {
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}
