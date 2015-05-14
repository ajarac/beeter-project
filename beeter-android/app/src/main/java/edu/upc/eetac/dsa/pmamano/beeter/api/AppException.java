package edu.upc.eetac.dsa.pmamano.beeter.api;

public class AppException extends Exception {
    public AppException() {
        super();
    }

    public AppException(String detailMessage) {
        super(detailMessage);
    }
}