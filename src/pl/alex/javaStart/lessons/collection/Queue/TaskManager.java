package pl.alex.javaStart.lessons.collection.Queue;


import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    private static final int ADD_TASK = 1;
    private static final int GET_TASK = 2;
    private static final int EXIT = 0;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Queue<Task> tasks = new PriorityQueue<>(Task::compareTo);

    public static void main(String[] args) {
        printMenu();

    }

    private static void printMenu() {
        try {
            int choice;
            do {
                printOptions();
                choice = getOption();
                switch (choice) {
                    case ADD_TASK -> addTask();
                    case GET_TASK -> getPriorityTask();
                    case EXIT -> exit();
                }
            } while (choice != EXIT);
        } catch (NumberFormatException e) {
            printLine("Tylko liczby!");
        }

    }

    private static void exit() {
        scanner.close();
        printLine("Bye!");
    }

    private static void getPriorityTask() {
        if (tasks.peek() != null) {
            printLine(tasks.poll().toString());
        } else{
            printLine("Brak tasków w kolejce!\n_____________________\n");
        }
    }

    private static void addTask() {
        Task task = getTaskDetails();
        tasks.offer(task);
    }

    private static Task getTaskDetails() {
        printLine("Name:");
        String name = scanner.nextLine();
        printLine("Description:");
        String description = scanner.nextLine();
        printLine("Priority:\nLOW, MEDIUM, HIGH");
        Task.Priority priority = Task.Priority.valueOf(scanner.nextLine());
        return new Task(name, description, priority);
    }

    private static int getOption() throws NumberFormatException {
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    private static void printOptions() {
        printLine("Dodać nowe zadanie -> " + ADD_TASK);
        printLine("Pobrać kolejne zadanie o najwyższym priorytecie  -> " + GET_TASK);
        printLine("Wyjść z aplikacji -> " + EXIT);

    }

    private static void printLine(String s) {
        System.out.println(s);
    }
}
