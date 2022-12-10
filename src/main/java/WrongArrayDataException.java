import java.io.IOException;

public class WrongArrayDataException extends IOException {
    public WrongArrayDataException(String message) {
        super("wrong array data " + message);
    }
}
