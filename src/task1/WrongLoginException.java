package task1;

public class WrongLoginException extends Exception{
    public boolean WrongLoginException() {
        System.err.println("Sorry, your login is incorrect.");
        return false;
    }

    public WrongLoginException() {
        super();
    }
}
