package neueFische;

public class PasswordCheck {

    public static void main(String[] args) {
        // Set password global here
        String password = "Sicher20";
        // Set blacklist words here
        String[] blacklistArray = {"Geheim12", "A2345678", "Qwertzui"};


        isPasswordNullorEmpty(password);

        if (isPasswordLength(password)) {
            System.out.println("Password is valid. It has minimum length of 8 characters.");
        } else {
            System.out.println("Password is invalid. Should have a minimum length of 8 characters.");
        }

        hasUpperAndLowercaseChars(password);

        isInBlacklist(password, blacklistArray);
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

    public static boolean hasUpperAndLowercaseChars(String password) {
        boolean hasUppercase = false;
        boolean hasLowercase = false;

        for (char character : password.toCharArray()) {
            //System.out.println("Zeichen: " + character);
            if (Character.isLowerCase(character)) {
                hasLowercase = true;
            } else if(Character.isUpperCase(character)){
                hasUppercase = true;
            }
        }
        if (hasUppercase && hasLowercase) {
            return true;
        }
        return false;
    }

    public static boolean isInBlacklist(String inputPassword, String[] blacklistArray) {
        for (String entry : blacklistArray) {
            if (entry.equals(inputPassword)) {
                return true;
            }
        }
        return false;
    }
}
