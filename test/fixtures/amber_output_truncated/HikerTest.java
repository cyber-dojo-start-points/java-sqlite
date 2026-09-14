import org.junit.*;
import static org.junit.Assert.*;

// The runner keeps the first 50K of each stream and drops the rest. JUnit 4
// writes everything it has to say on stdout, the summary line last of all, so
// flooding stdout from inside a test pushes that line past the cut and leaves
// the lambda with nothing to read.
//
// JUnit 4 marks each test starting with a dot and no newline after it, so the
// first line printed below is the one that carries that dot.
public class HikerTest {

    @Before
    public void setup_earth() {
        Hiker.setup();
    }

    @Test
    public void life_the_universe_and_everything() {
        for (int i = 0; i != 20000; i++) {
            System.out.println("debug: i is " + i);
        }
        int expected = 42;
        int actual = Hiker.answer();
        assertEquals(expected, actual);
    }
}
