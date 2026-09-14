import org.junit.*;
import static org.junit.Assert.*;

// One test throws and one asserts something that does not hold. JUnit 4 puts
// both in the same tally, so the pair are told apart by what each one printed
// rather than by the summary line.
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
        int zero = 0;
        assertEquals(0, (Hiker.answer() / zero) % 2);
    }
}
