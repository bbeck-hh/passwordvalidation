package neueFische;

public class PasswordCheck {

    public static void main(String[] args) {
        // Set password global here
        String password = "Psssst12@";
        // Set blacklist words here
        String[] blacklistArray = { "Geheim12", "A2345678", "Qwertzui" };
        // Sets of special characters
        String specialCharacters = "@!%?";
        // Set default for validPassword
        boolean validPassword = true;

        // Call each method
        validPassword = isPasswordNullorEmpty(password);

        if (validPassword) {
            validPassword = isPasswordLength(password);
        }

        if (validPassword) {
            validPassword = hasUpperAndLowercaseChars(password);
        }

        if (validPassword) {
            validPassword = isInBlacklist(password, blacklistArray);
        }

        if (validPassword) {
            validPassword = hasSpecialCharacters(password, specialCharacters);
        }

        passwordValid(validPassword);

    }

    // For User Experience -> Display the information if the password is valid
    public static void passwordValid(Boolean validPassword) {
        if (validPassword) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.\n" +
                    " - Länge 8 Zeichen\n" +
                    " - Groß und Kleinbuchstaben\n" +
                    " - Muss ein Sonderzeichen \" @, !,  %, ? \" enthalten \n" +
                    " - Mindestens eine Zahl\n" +
                    " - Sicheres Passwort");
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

    public static boolean hasUpperAndLowercaseChars(String password) {
        boolean hasUppercase = false;
        boolean hasLowercase = false;

        for (char character : password.toCharArray()) {
            // System.out.println("Zeichen: " + character);
            if (Character.isLowerCase(character)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(character)) {
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
            // System.out.println("Wort: " + entry);
            if (entry.equals(inputPassword)) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasSpecialCharacters(String password, String specialCharacters) {
        for (int i = 0; i < password.length(); i++) {
            //System.out.println("Zeichen: " + password.charAt(i));
            char letter = password.charAt(i);

            // Check if the character is a special character
            if (specialCharacters.contains(String.valueOf(letter))) {
                return true; // Special character found
            }
        }
        return false; // No digit found
    }
}
