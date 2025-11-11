package model;

import java.time.LocalDateTime;

public class Task {
    private final int id;
    private final String title;
    private final String description;
    private boolean done;
    private final LocalDateTime createdAt;

    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = false;
        this.createdAt = LocalDateTime.now();
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public boolean isDone() { return done; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    public void markDone() { this.done = true; }

    @Override
    public String toString() {
        return String.format("[%d] %s - %s (feito=%s)", id, title, description, done);
    }
}
