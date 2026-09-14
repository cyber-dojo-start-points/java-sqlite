import org.junit.*;
import static org.junit.Assert.*;

public class AnswerSizeTest {

    @Before
    public void setup_earth() {
        Hiker.setup();
    }

    @Test
    public void the_answer_is_three_digits_long() {
        assertEquals(3, String.valueOf(Hiker.answer()).length());
    }
}
