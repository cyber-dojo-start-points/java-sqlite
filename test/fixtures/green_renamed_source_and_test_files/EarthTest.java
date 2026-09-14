import org.junit.*;
import static org.junit.Assert.*;

public class EarthTest {

    @Before
    public void setup_earth() {
        Earth.setup();
    }

    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Earth.answer();
        assertEquals(expected, actual);
    }
}
