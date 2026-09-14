import org.junit.*;
import static org.junit.Assert.*;

// The @Test annotation is missing, so the class holds no runnable methods.
// JUnit 4 rejects a class in that state before running anything and counts the
// rejection as a failure, which is what makes this red rather than green.
public class HikerTest {

    @Before
    public void setup_earth() {
        Hiker.setup();
    }

    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Hiker.answer();
        assertEquals(expected, actual);
    }
}
