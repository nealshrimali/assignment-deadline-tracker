import java.time.LocalDate;

public class Assignment {
    private String courseName;
    private String assignmentName;
    private LocalDate dueDate;
    private boolean completed;

    public Assignment(String courseName, String assignmentName, LocalDate dueDate) {
        this.courseName = courseName;
        this.assignmentName = assignmentName;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }
}