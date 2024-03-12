package neueFische;

public class PasswordCheck {

    public static void main(String[] args) {
        // Set password global here
        String password = "sicher20";

        if (isPasswordValid(password)) {
            System.out.println("Password is valid. It has minimum length of 8 characters.");
        } else {
            System.out.println("Password is invalid. Should have a minimum length of 8 characters.");
        }
    }

    public static boolean isPasswordValid(String password) {
        return password != null && password.length() >= 8;
    }

}
