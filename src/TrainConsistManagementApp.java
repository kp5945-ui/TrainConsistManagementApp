import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of bogies to initialize: ");
        int bogieCount = scanner.nextInt();

        for (int i = 1; i <= bogieCount; i++) {
            trainConsist.add("Bogie-" + i);
        }

        System.out.println("Train initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());
        System.out.println("System ready for further operations.");

        scanner.close();
    }
}