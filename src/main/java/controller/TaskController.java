package controller;

import model.Task;
import persistence.TaskRepository;

/**
 * Controller (padrão GRASP: Controller + Creator)
 * Responsável por coordenar as operações de criação, listagem,
 * atualização e exclusão de tarefas.
 */
public class TaskController {
    private final TaskRepository repo;

    public TaskController(TaskRepository repo) {
        this.repo = repo;
    }

    public Task createTask(String title, String description) {
        return repo.saveNew(title, description);
    }

    public Iterable<Task> listTasks() {
        return repo.findAll();
    }

    public boolean markTaskDone(int id) {
        Task t = repo.findById(id);
        if (t == null) return false;
        t.markDone();
        return true;
    }

    public boolean deleteTask(int id) {
        return repo.deleteById(id);
    }
}
