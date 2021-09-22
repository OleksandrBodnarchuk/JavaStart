package pl.alex.javaStart.lessons.collection.Queue;

import java.util.Objects;

public class Task implements Comparable<Task> {
    private final String name;
    private String description;
    private final Priority priority;

    public Task(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }

    public Task(String name, String description, Priority priority) {
        this(name, priority);
        this.description = description;
    }

    @Override
    public int compareTo(Task t) {
        return priority.compareTo(t.priority);
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) && priority == task.priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }

    public enum Priority {
        HIGH, MEDIUM, LOW
    }
}

