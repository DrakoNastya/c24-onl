package Lesson11;

public class CheckInformation extends UsersInformation {
    public CheckInformation(String login, String password, String confirmPassword) {
        super(login, password, confirmPassword);
    }

    public static boolean checkUsersInformation(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 19) {
            throw new WrongLoginException("Login length > 19");
        }
        if (password.length() > 19) {
            throw new WrongPasswordException("Password length > 19");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirmPassword don't match");
        }
        if (login.contains(" ")) {
            throw new WrongLoginException("Login mustn't contain a space");
        }
        if (password.contains(" ")) {
            throw new WrongLoginException("Password mustn't contain a space");
        }
        if (password.contains(" ")) {
            throw new WrongLoginException("Password mustn't contain a space");
        }
        if (!presenceOfADigit(password)) {
            throw new WrongLoginException("Password must contain a digit");
        }
        return true;
    }

}
