package todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoList implements ToDoListInterface {
    private List<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description, int priority) {
        tasks.add(new Task(description, priority));
    }

    public void deleteTask(int id) {
        if (id < 0 || id > tasks.size()) { 
            return;
        }
        tasks.remove(id - 1); // Incorrectly removing by index
    }

    // Error: Does not handle task not found
    public void updateTaskPriority(int id, int newPriority) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setPriority(newPriority);
                break;
            }
        }
    }

    public void completeTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                break;
            }
        }
    }

    public List<Task> getCompletedTasks() {
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.isCompleted()) { // Error here!
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }
}
