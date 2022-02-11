package task1;

public class PasswordLogin {
    String password = "Olenka";
    String login = "kisya705";
    final int LENGTH = 20;

    public boolean checkLogin (String someLogin) {
        boolean trueOrFalse = false;
        if (login.equals(someLogin)) {
            System.out.println("Your login is correct.");
            trueOrFalse = true;
        } else {
            System.out.println("Sorry, you have no more tries.");
        }
        return trueOrFalse;
    }

    public boolean checkPassword (String somePassword) {
        boolean trueOrFalse = false;
        if (password.equals(somePassword)) {
            System.out.println("Your password is correct.");
            trueOrFalse = true;
        } else {
            System.out.println("Sorry, you have no more tries.");
        }
        return trueOrFalse;
    }

    public boolean checkLoginLength (String someLogin) {
        boolean trueOrFalse = false;
        if (someLogin.length() <= LENGTH) {
            trueOrFalse = true;
        } else {
            System.out.println("The login length can't be more then 20 characters.");
        }
        return trueOrFalse;
    }

    public boolean matchingPassword (String someString) throws WrongPasswordException {
        final String PATTERN = "\\w{1,19}";
        boolean trueOrFalse = false;
        try {
            someString.matches(PATTERN);
            trueOrFalse = true;
        } catch (TypeNotPresentException tpe) {
            throw new WrongPasswordException("Error");
        }
        return trueOrFalse;
    }

    public boolean matchingLogin (String someString) throws WrongLoginException {
        final String PATTERN = "\\w{1,19}";
        boolean trueOrFalse = false;
        try {
            someString.matches(PATTERN);
            trueOrFalse = true;
        } catch (TypeNotPresentException tpe) {
            throw new WrongLoginException();
        }
        return trueOrFalse;
    }
}

