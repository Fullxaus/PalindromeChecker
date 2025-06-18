
import org.junit.jupiter.api.Test;
import ru.mentee.power.PalindromeChecker;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PalindromeCheckerTest {
    private final PalindromeChecker checker = new PalindromeChecker();

    @Test
    void testPalindromeSimple() {
        assertThat(checker.isPalindrome("radar")).isTrue();
    }

    @Test
    void testPalindromeWithSpacesAndCase() {
        assertThat(checker.isPalindrome("A man a plan a canal Panama")).isTrue();
    }

    @Test
    void testNotPalindrome() {
        assertThat(checker.isPalindrome("hello")).isFalse();
    }

    @Test
    void testIsPalindromeWithNullInputThrowsException() {
        PalindromeChecker checker = new PalindromeChecker();

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            checker.isPalindrome(null);
        });

        assertEquals("Input must not be null", thrown.getMessage());
    }

}
