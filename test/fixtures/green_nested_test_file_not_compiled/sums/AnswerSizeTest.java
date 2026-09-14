import org.junit.*;
import static org.junit.Assert.*;

// cyber-dojo.sh compiles *.java, which names the files in the sandbox dir and
// no deeper, so this file is never compiled and the assertion below is never
// made. It asks for nine hundred so that a run which did compile it would go
// red and say so.
public class AnswerSizeTest {

    @Before
    public void setup_earth() {
        Hiker.setup();
    }

    @Test
    public void the_answer_is_nine_hundred() {
        assertEquals(900, Hiker.answer());
    }
}
