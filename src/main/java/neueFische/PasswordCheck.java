package neueFische;

public class PasswordCheck {

    public static void main(String[] args) {
        // Set password global here
        String password = "sicher20";

        isPasswordNullorEmpty(password);

        if (isPasswordLength(password)) {
            System.out.println("Password is valid. It has minimum length of 8 characters.");
        } else {
            System.out.println("Password is invalid. Should have a minimum length of 8 characters.");
        }
    }

    public static boolean isPasswordNullorEmpty(String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }
        return true; // Password is not NULL or empty
    }

    public static boolean isPasswordLength(String password) {
        return password != null && password.length() >= 8;
    }

    public static boolean hasPasswordDigits(String password) {
        for (char character : password.toCharArray()) {
            if (Character.isDigit(character)) {
                return true; // At least one digit found
            }
        }

        return false; // No digit found
    }


}
