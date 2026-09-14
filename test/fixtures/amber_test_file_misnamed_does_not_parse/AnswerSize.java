import org.junit.*;
import static org.junit.Assert.*;

// The name holds no "Test", so JUnitCore would never be handed this class.
// javac is handed it all the same, and stops the compilation here, so the
// misnaming never gets as far as mattering.
public class AnswerSize {

    @Before
    public void setup_earth() {
        Hiker.setup();
    }

    @Test
    public void the_answer_is_two_digits_long() {
        int expected = 2
        assertEquals(expected, String.valueOf(Hiker.answer()).length());
    }
}
