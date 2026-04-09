import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testSort_BasicSorting() {
        PassengerBogie[] bogies = {
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 56),
                new PassengerBogie("First Class", 24),
                new PassengerBogie("Sleeper", 70),
                new PassengerBogie("AC Chair", 60)
        };
        TrainConsistManagementApp.bubbleSort(bogies);
        int[] sorted = {24, 56, 60, 70, 72};
        for (int i = 0; i < bogies.length; i++) {
            assertEquals(sorted[i], bogies[i].getCapacity());
        }
    }

    @Test
    void testSort_AlreadySortedArray() {
        PassengerBogie[] bogies = {
                new PassengerBogie("First Class", 24),
                new PassengerBogie("AC Chair", 56),
                new PassengerBogie("AC Chair", 60),
                new PassengerBogie("Sleeper", 70),
                new PassengerBogie("Sleeper", 72)
        };
        TrainConsistManagementApp.bubbleSort(bogies);
        int[] sorted = {24, 56, 60, 70, 72};
        for (int i = 0; i < bogies.length; i++) {
            assertEquals(sorted[i], bogies[i].getCapacity());
        }
    }

    @Test
    void testSort_DuplicateValues() {
        PassengerBogie[] bogies = {
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 56),
                new PassengerBogie("AC Chair", 56),
                new PassengerBogie("First Class", 24)
        };
        TrainConsistManagementApp.bubbleSort(bogies);
        int[] sorted = {24, 56, 56, 72};
        for (int i = 0; i < bogies.length; i++) {
            assertEquals(sorted[i], bogies[i].getCapacity());
        }
    }

    @Test
    void testSort_SingleElementArray() {
        PassengerBogie[] bogies = { new PassengerBogie("Sleeper", 50) };
        TrainConsistManagementApp.bubbleSort(bogies);
        assertEquals(50, bogies[0].getCapacity());
    }

    @Test
    void testSort_AllEqualValues() {
        PassengerBogie[] bogies = {
                new PassengerBogie("Sleeper", 40),
                new PassengerBogie("AC Chair", 40),
                new PassengerBogie("First Class", 40)
        };
        TrainConsistManagementApp.bubbleSort(bogies);
        int[] sorted = {40, 40, 40};
        for (int i = 0; i < bogies.length; i++) {
            assertEquals(sorted[i], bogies[i].getCapacity());
        }
    }
}
