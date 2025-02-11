package gr.aueb.cf.exercises.ch18.easyDAOServiceModel.exceptions;

public class NameAlreadyExistsException extends RuntimeException {
    public NameAlreadyExistsException(String message) {
        super(message);
    }
}
