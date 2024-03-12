package neueFische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordCheckTest {

    //String inputPassword = "sicher2";

    @Test
    void shouldReturnFalse_WhenGivenNullOrEmpty(){
        // Given
        String inputPassword = ""; // null or ""
        boolean expected = false;
        // When
        boolean actual = PasswordCheck.isPasswordNullorEmpty(inputPassword);
        // Then
        Assertions.assertEquals(false, actual);
    }
    @Test
    void shouldReturnTrue_WhenGivenNotNullOrNotEmpty(){
        // Given
        String inputPassword = "1"; // Give me a sign
        boolean expected = true;
        // When
        boolean actual = PasswordCheck.isPasswordNullorEmpty(inputPassword);
        // Then
        Assertions.assertEquals(true, actual);
    }

    @Test
    void shouldReturnTrueIsLengthGreater8Char_WhenGiven_sicher20(){
        // Given
        String inputPassword = "sicher20";
        boolean expected = true ;
        //When
        boolean actual = PasswordCheck.isPasswordLength(inputPassword);
        //Then
        Assertions.assertEquals(true, actual);
    }
    @Test
    void shouldReturnFalseIsLengthLess8Char_WhenGiven_sicher2(){
        // Given
        String inputPassword = "sicher2";
        boolean expected = false ;
        //When
        boolean actual = PasswordCheck.isPasswordLength(inputPassword);
        //Then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void shouldReturnTrue_WhenGivenHasDigits(){
        // Given
        String inputPassword = "sicher20";
        boolean expected = true ;
        // When
        boolean actual = PasswordCheck.hasPasswordDigits(inputPassword);
        //Then
        Assertions.assertEquals(true, actual);
    }
    @Test
    void shouldReturnFalse_WhenGivenHasNoDigits(){
        // Given
        String inputPassword = "sicher";
        boolean expected = false ;
        // When
        boolean actual = PasswordCheck.hasPasswordDigits(inputPassword);
        //Then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void shouldReturnTrue_WhenGivenHasUpperAndLowercaseCharacters(){
        // Given
        String inputPassword = "Psssst";
        boolean expected = true ;
        // When
        boolean actual = PasswordCheck.hasUpperAndLowercaseChars(inputPassword);
        // Then
        Assertions.assertEquals(true, actual);
    }
    @Test
    void shouldReturnFalse_WhenGivenHasNoUppercaseCharacters(){
        // Given
        String inputPassword = "sssst";
        boolean expected = false ;
        // When
        boolean actual = PasswordCheck.hasUpperAndLowercaseChars(inputPassword);
        // Then
        Assertions.assertEquals(false, actual);
    }
    @Test
    void shouldReturnFalse_WhenGivenHasNoLowercaseCharacters(){
        // Given
        String inputPassword = "PSST";
        boolean expected = false ;
        // When
        boolean actual = PasswordCheck.hasUpperAndLowercaseChars(inputPassword);
        // Then
        Assertions.assertEquals(false, actual);
    }
}