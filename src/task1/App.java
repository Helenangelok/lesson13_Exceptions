package task1;

public class App {
    public static void main(String[] args) throws WrongPasswordException, WrongLoginException {
        String login = "kisya705";
        String password = "Olenka";
        String confirmPassword = "Olenka";

        PasswordLogin passwordLogin = new PasswordLogin();

        if (passwordLogin.matchingLogin(login) && passwordLogin.checkLoginLength(login)) {
            passwordLogin.checkLogin(login);
        } else {
            System.out.println("Sorry, your login is not correct.");
            throw new WrongLoginException();
        }

        if (passwordLogin.matchingPassword(password) && passwordLogin.checkLoginLength(password)) {
            passwordLogin.checkPassword(password);
        } else {
            System.out.println("Sorry, your pass is not correct.");
            throw new WrongLoginException();
        }

        if (passwordLogin.checkPassword(confirmPassword)) {
            System.out.println("Congratulations!");
        }
    }
}
