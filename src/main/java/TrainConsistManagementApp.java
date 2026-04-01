import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Train Consist Management App
 * UC9: Group Bogies by Capacity Range Using Streams
 */

/**
 * Bogie class to represent a train bogie with name and capacity.
 */
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Print welcome message
        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        // UC9: Group Bogies by Capacity Range Using Streams
        System.out.println("--- UC9: Group Bogies by Capacity Range Using Streams ---");
        System.out.println();

        // Create a List<Bogie> to store bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 96));
        bogies.add(new Bogie("First Class", 48));
        bogies.add(new Bogie("General", 120));
        bogies.add(new Bogie("Economy", 80));

        // Display all bogies
        System.out.println("All bogies:");
        for (int i = 0; i < bogies.size(); i++) {
            System.out.println((i + 1) + ". " + bogies.get(i));
        }
        System.out.println();

        // Group bogies by capacity range using streams
        System.out.println("Grouping bogies by capacity range...");
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> {
                    if (b.getCapacity() <= 50) return "Small (≤50)";
                    else if (b.getCapacity() <= 100) return "Medium (51-100)";
                    else return "Large (>100)";
                }));
        System.out.println("Grouping completed.");
        System.out.println();

        // Display grouped bogies
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("Group: " + entry.getKey());
            for (Bogie bogie : entry.getValue()) {
                System.out.println("  - " + bogie);
            }
            System.out.println();
        }

        System.out.println("Key Benefits of Stream Grouping:");
        System.out.println("✓ Efficient data categorization");
        System.out.println("✓ Declarative grouping logic");
        System.out.println("✓ Easy to extend with multiple criteria");
        System.out.println("✓ Integrates with other stream operations");
        System.out.println("✓ Improves data analysis capabilities");
        System.out.println();

        System.out.println("Program continues...");
    }
}