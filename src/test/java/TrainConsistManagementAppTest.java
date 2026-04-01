import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * JUnit tests for TrainConsistManagementApp
 * UC9: Group Bogies by Capacity Range Using Streams
 */
public class TrainConsistManagementAppTest {

    @Test
    public void testBogieCreation() {
        Bogie bogie = new Bogie("Test Bogie", 100);
        assertEquals("Test Bogie", bogie.getName());
        assertEquals(100, bogie.getCapacity());
    }

    @Test
    public void testBogieToString() {
        Bogie bogie = new Bogie("Sleeper", 72);
        assertEquals("Sleeper (72 seats)", bogie.toString());
    }

    @Test
    public void testStreamGrouping() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("First Class", 48));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 96));
        bogies.add(new Bogie("General", 120));

        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(b -> {
                    if (b.getCapacity() <= 50) return "Small (≤50)";
                    else if (b.getCapacity() <= 100) return "Medium (51-100)";
                    else return "Large (>100)";
                }));

        assertEquals(1, grouped.get("Small (≤50)").size());
        assertEquals(2, grouped.get("Medium (51-100)").size());
        assertEquals(1, grouped.get("Large (>100)").size());
    }

    @Test
    public void testEmptyListGrouping() {
        List<Bogie> bogies = new ArrayList<>();
        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(b -> "Group"));
        assertTrue(grouped.isEmpty());
    }
}