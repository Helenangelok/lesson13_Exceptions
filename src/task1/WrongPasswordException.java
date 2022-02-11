package task1;

public class WrongPasswordException extends Exception{


    public boolean WrongPasswordException() {
        System.out.println("Sorry, your password is incorrect.");
        return false;
    }

    public WrongPasswordException(String message) {
        super(message);
    }

}


