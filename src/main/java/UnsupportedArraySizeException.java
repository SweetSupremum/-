public class UnsupportedArraySizeException extends NegativeArraySizeException {
    public UnsupportedArraySizeException(String size) {
        super("Must have 4*4, but " + size);
    }
}
