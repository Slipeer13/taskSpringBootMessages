package com.example.taskSpringBoot;

public class Messages {
    private int id;
    private String message;
    private String name;

    public Messages() {
    }

    public Messages(int id, String message, String name) {
        this.id = id;
        this.message = message;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Messages{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
