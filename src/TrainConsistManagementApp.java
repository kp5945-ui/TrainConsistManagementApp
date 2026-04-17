import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Map<String, Integer> bogieCapacity = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of bogies to add: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter bogie name: ");
            String name = scanner.nextLine();

            System.out.print("Enter capacity for " + name + ": ");
            int capacity = scanner.nextInt();
            scanner.nextLine();

            bogieCapacity.put(name, capacity);
        }

        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " seats");
        }

        scanner.close();
    }
}