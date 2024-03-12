package neueFische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordCheckTest {
    @Test
    void shouldReturnCorrectOrIncorrect_WhenGiven_sicher20(){
        // Given
        String input = "sicher20";
        boolean expected = true ;
        //When
        boolean actual = PasswordCheck.isPasswordValid(input);
        //Then
        Assertions.assertEquals(true, actual);
    }
}