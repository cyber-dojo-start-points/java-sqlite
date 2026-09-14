import org.junit.*;
import static org.junit.Assert.*;

// The test throws rather than asserting anything. JUnit 4 counts a thrown
// exception in the same tally as an assertion that did not hold, so the run
// still reaches a colour instead of stopping short of one.
public class HikerTest {

    @Before
    public void setup_earth() {
        Hiker.setup();
    }

    @Test
    public void life_the_universe_and_everything() {
        int zero = 0;
        assertEquals(42, Hiker.answer() / zero);
    }
}
