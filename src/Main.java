
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Assignment Deadline Tracker ===");
            System.out.println("1. Add Assignment");
            System.out.println("2. View Assignments");
            System.out.println("3. Mark Assignment Complete");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Add Assignment - Coming Soon!");
                    break;

                case "2":
                    System.out.println("View Assignments - Coming Soon!");
                    break;

                case "3":
                    System.out.println("Mark Assignment Complete - Coming Soon!");
                    break;

                case "4":
                    System.out.println("Exiting Assignment Deadline Tracker...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please enter 1-4.");
            }
        }

        scanner.close();
    }
}
