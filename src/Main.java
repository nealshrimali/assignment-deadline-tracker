
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Assignment> assignments = new ArrayList<>();
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
                    System.out.print("Enter course name: ");
                    String courseName = scanner.nextLine();

                    System.out.print("Enter assignment name: ");
                    String assignmentName = scanner.nextLine();

                    LocalDate dueDate = null;

                    while (dueDate == null) {
                        System.out.print("Enter due date (YYYY-MM-DD): ");
                        String dateInput = scanner.nextLine();

                        try {
                            dueDate = LocalDate.parse(dateInput);
                        } catch (DateTimeParseException e) {
                            System.out.println("Invalid date. Use YYYY-MM-DD.");
                        }
                    }

                    Assignment assignment = new Assignment(
                        courseName, assignmentName, dueDate
                    );

                    assignments.add(assignment);
                    System.out.println("Assignment added successfully!");
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