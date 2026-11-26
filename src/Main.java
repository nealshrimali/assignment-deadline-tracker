
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
                    if (assignments.isEmpty()) {
                        System.out.println("No assignments found.");
                    } else {
                        System.out.println("\n=== Your Assignments ===");

                        for (int i = 0; i < assignments.size(); i++) {
                            Assignment current = assignments.get(i);

                            System.out.println("\nAssignment #" + (i + 1));
                            System.out.println("Course: " + current.getCourseName());
                            System.out.println("Assignment: " + current.getAssignmentName());
                            System.out.println("Due Date: " + current.getDueDate());

                            if (current.isCompleted()) {
                                System.out.println("Status: Completed");
                            } else {
                                System.out.println("Status: Incomplete");
                            }
                        }
                    }
                    break;


                
                case "3":
                    if (assignments.isEmpty()) {
                        System.out.println("No assignments available to complete.");
                        break;
                    }

                    System.out.println("\n=== Mark Assignment Complete ===");

                    for (int i = 0; i < assignments.size(); i++) {
                        Assignment current = assignments.get(i);

                        String status = current.isCompleted()
                                ? "Completed" : "Incomplete";

                        System.out.println((i + 1) + ". "
                                + current.getAssignmentName()
                                + " (" + current.getCourseName() + ")"
                                + " - " + status);
                    }

                    System.out.print("Enter assignment number to complete: ");
                    String input = scanner.nextLine();

                    try {
                        int assignmentNumber = Integer.parseInt(input);

                        if (assignmentNumber < 1 ||
                                assignmentNumber > assignments.size()) {
                            System.out.println("Invalid assignment number.");
                        } else {
                            Assignment selected =
                                    assignments.get(assignmentNumber - 1);

                            if (selected.isCompleted()) {
                                System.out.println("This assignment is already completed.");
                            } else {
                                selected.markCompleted();
                                System.out.println("Assignment marked as completed!");
                            }
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                    }
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