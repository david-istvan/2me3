package todo;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        toDoList.addTask("Task 1", 2);
        toDoList.addTask("Task 2", 3);
        toDoList.addTask("Task 3", 5);
        displayTasks(toDoList);

        System.out.println("\nUpdating priority of the first task to 1:");
        toDoList.updateTaskPriority(0, 1);
        displayTasks(toDoList);

        System.out.println("\nDeleting the second task:");
        toDoList.deleteTask(2); 
        displayTasks(toDoList);

        System.out.println("\nCompleting the first task:");
        toDoList.completeTask(0);
        displayTasks(toDoList);

        System.out.println("\nDisplaying only completed tasks:");
        displayCompletedTasks(toDoList);
    }

    private static void displayTasks(ToDoList toDoList) {
        System.out.println("Current Tasks:");
        for (Task task : toDoList.getTasks()) {
            System.out.println(task);
        }
    }

    private static void displayCompletedTasks(ToDoList toDoList) {
        System.out.println("Completed Tasks:");
        for (Task task : toDoList.getCompletedTasks()) {
            System.out.println(task);
        }
    }
}
