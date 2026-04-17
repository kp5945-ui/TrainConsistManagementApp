import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    public void testSearch_ThrowsExceptionWhenEmpty() {
        TrainConsistManagementApp app = new TrainConsistManagementApp();
        assertThrows(IllegalStateException.class, () -> app.searchBogie("BG101"));
    }

    @Test
    public void testSearch_AllowsSearchWhenDataExists() {
        TrainConsistManagementApp app = new TrainConsistManagementApp();
        app.addBogie("BG101");
        app.addBogie("BG205");
        assertDoesNotThrow(() -> app.searchBogie("BG101"));
    }

    @Test
    public void testSearch_BogieFoundAfterValidation() {
        TrainConsistManagementApp app = new TrainConsistManagementApp();
        app.addBogie("BG101");
        app.addBogie("BG205");
        app.addBogie("BG309");
        assertTrue(app.searchBogie("BG205"));
    }

    @Test
    public void testSearch_BogieNotFoundAfterValidation() {
        TrainConsistManagementApp app = new TrainConsistManagementApp();
        app.addBogie("BG101");
        app.addBogie("BG205");
        app.addBogie("BG309");
        assertFalse(app.searchBogie("BG999"));
    }

    @Test
    public void testSearch_SingleElementValidCase() {
        TrainConsistManagementApp app = new TrainConsistManagementApp();
        app.addBogie("BG101");
        assertTrue(app.searchBogie("BG101"));
    }
}
