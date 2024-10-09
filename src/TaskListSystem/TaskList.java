package TaskListSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        tasks.add(newTask);
        System.out.println("Task added: " + description);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removedTask = tasks.remove(index);
            System.out.println("Task removed: " + removedTask.getDescription());
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + " - " + tasks.get(i).toString());
            }
        }
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).complete();
            System.out.println("Task " + tasks.get(index).getDescription() + " completed!");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Task List ---");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. List tasks");
            System.out.println("4. Complete task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Clear the input buffer.

            switch (option) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskList.addTask(description);
                    break;
                case 2:
                    taskList.listTasks();
                    System.out.print("Enter the index of the task to remove: ");
                    int removeIndex = scanner.nextInt();
                    taskList.removeTask(removeIndex);
                    break;
                case 3:
                    taskList.listTasks();
                    break;
                case 4:
                    taskList.listTasks();
                    System.out.print("Enter the index of the task to complete: ");
                    int completeIndex = scanner.nextInt();
                    taskList.completeTask(completeIndex);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
