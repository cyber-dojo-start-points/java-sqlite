import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

// The database is a file in the sandbox, so a row one test writes is still
// there for the next one. Nothing here resets it between tests: the first test
// creates the row and the second reads it, and the second passes only because
// the first ran before it. The order is fixed by name so that what the second
// test depends on is stated rather than left to the framework.
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HikerTest {

    @Test
    public void a_setting_up_the_earth_stores_the_answer() {
        Hiker.setup();
        assertEquals(42, Hiker.answer());
    }

    @Test
    public void b_the_row_is_still_there_with_no_setup_of_its_own() {
        assertEquals(42, Hiker.answer());
    }
}
