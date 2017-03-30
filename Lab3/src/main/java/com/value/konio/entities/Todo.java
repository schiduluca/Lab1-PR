package com.value.konio.entities;

/**
 * Created by lschidu on 3/30/17.
 */
public class Todo {

    private String todoText;
    private Integer priority;
    private Boolean done;

    public Todo(String todoText, Integer priority, Boolean done) {
        this.todoText = todoText;
        this.priority = priority;
        this.done = done;
    }

    public String getTodoText() {
        return todoText;
    }

    public void setTodoText(String todoText) {
        this.todoText = todoText;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todoText='" + todoText + '\'' +
                ", priority=" + priority +
                ", done=" + done +
                '}';
    }
}
