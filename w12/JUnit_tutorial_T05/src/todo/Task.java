package todo;

public class Task {
    private static int idCounter = 0;
    private int id;
    private String description;
    private int priority; // 1 (High) to 5 (Low)
    private boolean completed;

    public Task(String description, int priority) {
        this.id = idCounter++;
        this.description = description;
        this.priority = priority;
        this.completed = false; // Default to false
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        // Intentional Error: Missing boundary check for priority
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return id + ": " + description + " (Priority: " + priority + ", Completed: " + completed + ")";
    }
}
