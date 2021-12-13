package com.frank.types;

//Custom Exception class is a subclass of the RuntimeException
public class NonNumericInputException extends RuntimeException {
    public NonNumericInputException() {}
    public NonNumericInputException(String aMessage) {
        super(aMessage);
    }

}
