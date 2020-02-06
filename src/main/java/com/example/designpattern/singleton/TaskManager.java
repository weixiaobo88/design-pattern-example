package com.example.designpattern.singleton;

public class TaskManager {
    private static TaskManager taskManager = null;

    private TaskManager() {
    }

    public static TaskManager getInstance() {
        if (taskManager == null) {
            taskManager = new TaskManager();
        }

        return taskManager;
    }

    public void displayProcesses() {

    }

    public void displayServices() {

    }
}
