package todo;

import java.util.List;

interface ToDoListInterface {
	// Adds a new task
	void addTask(String description, int priority);
	
    // Deletes a task by id
	void deleteTask(int id);
	
    // Updates the priority of a task
	void updateTaskPriority(int id, int newPriority);
	
	// Mark a task as completed
	void completeTask(int id);
	
	// Filters and returns completed tasks
	List<Task> getCompletedTasks();
	
	// Returns all tasks
	List<Task> getTasks();
}