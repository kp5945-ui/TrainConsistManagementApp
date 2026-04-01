import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * JUnit tests for TrainConsistManagementApp
 * UC8: Filter Passenger Bogies Using Streams
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
    public void testStreamFiltering() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 96));
        bogies.add(new Bogie("First Class", 48));

        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        assertEquals(2, filtered.size());
        assertEquals("Sleeper", filtered.get(0).getName());
        assertEquals("AC Chair", filtered.get(1).getName());
    }

    @Test
    public void testStreamFilteringNoMatch() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("First Class", 48));

        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        assertTrue(filtered.isEmpty());
    }

    @Test
    public void testEmptyListFiltering() {
        List<Bogie> bogies = new ArrayList<>();
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        assertTrue(filtered.isEmpty());
    }
}