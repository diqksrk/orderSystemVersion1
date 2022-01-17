package jpabook.jpashop.exception;

public class NotEnouthStockException extends RuntimeException {

    public NotEnouthStockException() {
        super();
    }

    public NotEnouthStockException(String message) {
        super(message);
    }

    public NotEnouthStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnouthStockException(Throwable cause) {
        super(cause);
    }

    protected NotEnouthStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
