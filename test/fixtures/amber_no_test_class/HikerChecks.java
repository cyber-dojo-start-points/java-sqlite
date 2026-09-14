import org.junit.*;
import static org.junit.Assert.*;

// The test itself is sound, but the class name holds no "Test", and that is
// how cyber-dojo.sh finds the classes to hand JUnitCore. It is handed none, so
// it announces a clean run of nothing at all, and the colour rests on that
// announcement rather than on anything having been checked.
public class HikerChecks {

    @Before
    public void setup_earth() {
        Hiker.setup();
    }

    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Hiker.answer();
        assertEquals(expected, actual);
    }
}
