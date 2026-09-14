import org.junit.*;
import static org.junit.Assert.*;

// This class compiles, and its method is annotated, but cyber-dojo.sh hands
// JUnitCore the classes whose names hold "Test", and this one does not. It
// asks for nine hundred so that a run which did discover it would go red and
// say so.
public class AnswerSize {

    @Before
    public void setup_earth() {
        Hiker.setup();
    }

    @Test
    public void the_answer_is_nine_hundred() {
        assertEquals(900, Hiker.answer());
    }
}
