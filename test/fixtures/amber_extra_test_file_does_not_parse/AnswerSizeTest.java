import org.junit.*;
import static org.junit.Assert.*;

public class AnswerSizeTest {

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
