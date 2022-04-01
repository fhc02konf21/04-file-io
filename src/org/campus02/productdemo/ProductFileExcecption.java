package org.campus02.productdemo;

public class ProductFileExcecption extends Exception {
    public ProductFileExcecption() {
    }

    public ProductFileExcecption(String message) {
        super(message);
    }

    public ProductFileExcecption(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductFileExcecption(Throwable cause) {
        super(cause);
    }

    public ProductFileExcecption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
