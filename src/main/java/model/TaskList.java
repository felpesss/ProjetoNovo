package model;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private final List<Task> tasks = new ArrayList<>();

    public void add(Task t) { tasks.add(t); }

    public List<Task> all() { return new ArrayList<>(tasks); }

    public Task findById(int id) {
        return tasks.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    public boolean removeById(int id) {
        return tasks.removeIf(t -> t.getId() == id);
    }
}
