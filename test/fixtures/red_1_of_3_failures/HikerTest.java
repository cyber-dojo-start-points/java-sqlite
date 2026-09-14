import org.junit.*;
import static org.junit.Assert.*;

// The stored answer is 54, which is even and two digits long, so only the
// first of these three tests fails.
public class HikerTest {

    @Before
    public void setup_earth() {
        Hiker.setup();
    }

    @Test
    public void life_the_universe_and_everything() {
        assertEquals(42, Hiker.answer());
    }

    @Test
    public void the_answer_is_even() {
        assertEquals(0, Hiker.answer() % 2);
    }

    @Test
    public void the_answer_is_two_digits_long() {
        assertEquals(2, String.valueOf(Hiker.answer()).length());
    }
}
