class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }
}

public class TrainConsistManagementApp {

    public static void bubbleSort(PassengerBogie[] bogies) {
        int n = bogies.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bogies[j].getCapacity() > bogies[j + 1].getCapacity()) {
                    PassengerBogie temp = bogies[j];
                    bogies[j] = bogies[j + 1];
                    bogies[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        PassengerBogie[] bogies = {
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 56),
                new PassengerBogie("First Class", 24),
                new PassengerBogie("Sleeper", 70),
                new PassengerBogie("AC Chair", 60)
        };

        System.out.println("Original Capacities:");
        for (PassengerBogie b : bogies) {
            System.out.print(b.getCapacity() + " ");
        }

        bubbleSort(bogies);

        System.out.println("\nSorted Capacities:");
        for (PassengerBogie b : bogies) {
            System.out.print(b.getCapacity() + " ");
        }
    }
}
