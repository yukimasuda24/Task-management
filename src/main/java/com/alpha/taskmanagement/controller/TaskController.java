package com.alpha.taskmanagement.controller;

import com.alpha.taskmanagement.model.Task;
import com.alpha.taskmanagement.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getTasks();
        model.addAttribute("taskForm", new Task());
        model.addAttribute("tasks", tasks);
        return "index";
    }

    @PostMapping("/task")
    public String addTask(@ModelAttribute("taskForm") Task task) {
        taskService.addTask(task);
        return "redirect:/tasks";
    }
}
