package ru.netology.exсeption;

public class NotFoundExсeption extends RuntimeException {

    public NotFoundExсeption() {
    }

    public NotFoundExсeption(String message) {
        super(message);
    }

    public NotFoundExсeption(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundExсeption(Throwable cause) {
        super(cause);
    }

    public NotFoundExсeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}





