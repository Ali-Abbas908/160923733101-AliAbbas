package com.lordsbootcamp.task_manager.models;

public class Task {
    private long id; // primitive data type
    private String title; // non-primitive data type (Object)
    private String description; // non-primitive data type (Object)
    private Status status; // non-primitive data type (Enum)

    //Default Constructor
    // We can use this for "Factory Setting"
    public Task() {
        // Set a default status when a new task is created.
        this.status = Status.TODO;
    }

    //Parameterised Constructor
    public Task(long id, String title, String description, Status status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    // Pojo (getters & setters)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // toString Method
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }

}
