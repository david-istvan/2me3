package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import todo.Task;
import todo.ToDoList;

class ToDoListTest {
    private ToDoList toDoList;

    @BeforeEach
    void setUp() {
        toDoList = new ToDoList();
        toDoList.addTask("Task 1", 3);
        toDoList.addTask("Task 2", 2);
        toDoList.addTask("Task 3", 1);
    }

    @Test
    @Order(1)
    void testAddTask() {
        int initialSize = toDoList.getTasks().size();
        toDoList.addTask("New Task", 4);
        assertEquals(initialSize + 1, toDoList.getTasks().size(), "Adding a task should increase the list size.");
    }

    @Test
    @Order(2)
    void testDeleteTask() {
        int initialSize = toDoList.getTasks().size();
        toDoList.deleteTask(2);
        assertEquals(initialSize - 1, toDoList.getTasks().size(), "Deleting a task should decrease the list size.");
    }

    @Test
    @Order(3)
    void testDeleteInvalidTask() {
        int initialSize = toDoList.getTasks().size();
        toDoList.deleteTask(4);
        assertEquals(initialSize, toDoList.getTasks().size(), "Deleting with an invalid id should not change the list size.");
    }

    @Order(4)
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5})
    void testUpdatePriority(int newPriority) {
        toDoList.updateTaskPriority(0, newPriority);
        Task task = toDoList.getTasks().get(0);
        assertEquals(newPriority, task.getPriority(), "The priority should be updated correctly.");
    }

    @Test
    @Order(5)
    void testCompleteTask() {
        toDoList.completeTask(1);
        assertTrue(toDoList.getTasks().get(0).isCompleted(), "The task should be marked as completed.");
    }

    @Test
    @Order(6)
    void testGetCompletedTasks() {
        toDoList.completeTask(1);
        List<Task> completedTasks = toDoList.getCompletedTasks();
        assertEquals(1, completedTasks.size(), "Should return only completed tasks.");
        assertTrue(completedTasks.get(0).isCompleted(), "Returned tasks should be completed.");
    }

    @Test
    @Order(7)
    void testGetNoCompletedTasks() {
        List<Task> completedTasks = toDoList.getCompletedTasks();
        assertTrue(completedTasks.isEmpty(), "Should return an empty list when no tasks are completed.");
    
    }
}
