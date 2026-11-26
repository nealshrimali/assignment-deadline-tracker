import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Assignment assignment = new Assignment(
            "CS193",
            "Homework 1",
            LocalDate.of(2026, 12, 1)
        );

        System.out.println("Course: " + assignment.getCourseName());
        System.out.println("Assignment: " + assignment.getAssignmentName());
        System.out.println("Due Date: " + assignment.getDueDate());
        System.out.println("Completed: " + assignment.isCompleted());

        assignment.markCompleted();

        System.out.println("Completed after update: " + assignment.isCompleted());
    }
}