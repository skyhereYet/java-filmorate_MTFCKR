package Spring.Web.controller;

public class ValidationException extends IllegalArgumentException {

    public ValidationException(String message) {
        super(message);
    }
}
