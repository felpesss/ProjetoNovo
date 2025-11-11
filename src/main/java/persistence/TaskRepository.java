package persistence;

import model.Task;
import model.TaskList;

public class TaskRepository {
    private final TaskList store = new TaskList();
    private int nextId = 1;

    public TaskRepository() {}

    public Task saveNew(String title, String description) {
        Task t = new Task(nextId++, title, description);
        store.add(t);
        return t;
    }

    public Task findById(int id) {
        return store.findById(id);
    }

    public Iterable<Task> findAll() {
        return store.all();
    }

    public boolean deleteById(int id) {
        return store.removeById(id);
    }
}
