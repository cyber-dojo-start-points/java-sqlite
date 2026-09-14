import org.junit.*;
import static org.junit.Assert.*;

// The stored answer is 54321, which is neither 42, nor even, nor two digits
// long, so all three of these tests fail.
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
