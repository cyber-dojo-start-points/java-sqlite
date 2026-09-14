import org.junit.*;
import static org.junit.Assert.*;

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
}
