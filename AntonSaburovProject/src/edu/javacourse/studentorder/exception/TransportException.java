package edu.javacourse.studentorder.exception;

public class TransportException extends Exception {

    private String code;


    public TransportException(String code, String message) {
        super(message);
        this.code = code;
    }

    public TransportException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
