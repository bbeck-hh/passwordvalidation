package neueFische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://openbook.rheinwerk-verlag.de/javainsel/22_002.html
class PasswordCheckTest {

    //String inputPassword = "sicher2";

    @Test
    void main_shouldReturnFalse_WhenGivenNullOrEmpty(){
        // Given
        String inputPassword = ""; // null or ""
        boolean expected = false;
        // When
        boolean actual = PasswordCheck.isPasswordNullorEmpty(inputPassword);
        // Then
        Assertions.assertEquals(false, actual);
    }
    @Test
    void main_shouldReturnTrue_WhenGivenNotNullOrNotEmpty(){
        // Given
        String inputPassword = "1"; // Give me a sign
        boolean expected = true;
        // When
        boolean actual = PasswordCheck.isPasswordNullorEmpty(inputPassword);
        // Then
        Assertions.assertEquals(true, actual);
    }
    //#######################

    @Test
    void main_shouldReturnTrueIsLengthGreater8Char_WhenGiven_sicher20(){
        // Given
        String inputPassword = "sicher20";
        boolean expected = true ;
        //When
        boolean actual = PasswordCheck.isPasswordLength(inputPassword);
        //Then
        Assertions.assertEquals(true, actual);
    }
    @Test
    void main_shouldReturnFalseIsLengthLess8Char_WhenGiven_sicher2(){
        // Given
        String inputPassword = "sicher2";
        boolean expected = false ;
        //When
        boolean actual = PasswordCheck.isPasswordLength(inputPassword);
        //Then
        Assertions.assertEquals(false, actual);
    }
    //#######################

    @Test
    void main_shouldReturnTrue_WhenGivenHasDigits(){
        // Given
        String inputPassword = "sicher20";
        boolean expected = true ;
        // When
        boolean actual = PasswordCheck.hasPasswordDigits(inputPassword);
        //Then
        Assertions.assertEquals(true, actual);
    }
    @Test
    void main_shouldReturnFalse_WhenGivenHasNoDigits(){
        // Given
        String inputPassword = "sicher";
        boolean expected = false ;
        // When
        boolean actual = PasswordCheck.hasPasswordDigits(inputPassword);
        //Then
        Assertions.assertEquals(false, actual);
    }
    //#######################

    @Test
    void main_shouldReturnTrue_WhenGivenHasUpperAndLowercaseCharacters(){
        // Given
        String inputPassword = "Psssst";
        boolean expected = true ;
        // When
        boolean actual = PasswordCheck.hasUpperAndLowercaseChars(inputPassword);
        // Then
        Assertions.assertEquals(true, actual);
    }
    @Test
    void main_shouldReturnFalse_WhenGivenHasNoUppercaseCharacters(){
        // Given
        String inputPassword = "sssst";
        boolean expected = false ;
        // When
        boolean actual = PasswordCheck.hasUpperAndLowercaseChars(inputPassword);
        // Then
        Assertions.assertEquals(false, actual);
    }
    @Test
    void main_shouldReturnFalse_WhenGivenHasNoLowercaseCharacters(){
        // Given
        String inputPassword = "PSST";
        boolean expected = false ;
        // When
        boolean actual = PasswordCheck.hasUpperAndLowercaseChars(inputPassword);
        // Then
        Assertions.assertEquals(false, actual);
    }
    //#######################

    @Test
    void main_shouldReturnTrue_WhenGivenisInBlacklist(){
        // Given
        String inputPassword = "A2345678";
        String[] blacklistArray = {"Geheim12", "A2345678", "Qwertzui"};
        boolean expected = false ;
        // When
        boolean actual = PasswordCheck.isInBlacklist(inputPassword, blacklistArray);
        // Then
        Assertions.assertEquals(false, actual);
    }
    @Test
    void main_shouldReturnTrue_WhenGivenisNotInBlacklist(){
        // Given
        String inputPassword = "AllesPrima1";
        String[] blacklistArray = {"Geheim12", "A2345678", "Qwertzui"};
        boolean expected = true ;
        // When
        boolean actual = PasswordCheck.isInBlacklist(inputPassword, blacklistArray);
        // Then
        Assertions.assertEquals(true, actual);
    }
    //#######################

    @Test
    void main_shouldReturnTrue_WhenGivenPasswordWithSpecialCharacters() {
        // Given
        String inputPassword = "AllesPrima!";
        String specialCharacters = "@!%?";
//		boolean expected = true ;
        // When
        boolean actual = PasswordCheck.hasSpecialCharacters(inputPassword, specialCharacters);
        // Then
        Assertions.assertEquals(true, actual);
    }
    // #######################
}