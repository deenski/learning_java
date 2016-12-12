public class EvenNumberException extends Exception {
    public EvenNumberException() {
        super("Only even numbers are allowed here");
    }
    public EvenNumberException(String msg) {
        super(msg);
    }
    
}