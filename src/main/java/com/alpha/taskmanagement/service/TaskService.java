package com.alpha.taskmanagement.service;

import com.alpha.taskmanagement.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        // TODO DBからタスクを取得する
        if(tasks.size() > 0) {
            return tasks;
        }
        Task task1 = new Task();
        task1.setTaskName("タスク１");
        task1.setOverview("タスク１の概要");
        task1.setTaskStatus(1);
        tasks.add(task1);
        Task task2 = new Task();
        task2.setTaskName("タスク２");
        task2.setOverview("タスク２の概要");
        task2.setTaskStatus(2);
        tasks.add(task2);
        return tasks;
    }

    public void addTask(Task task) {
        // TODO DBにタスクを追加する
        tasks.add(task);
        return;
    }
}
