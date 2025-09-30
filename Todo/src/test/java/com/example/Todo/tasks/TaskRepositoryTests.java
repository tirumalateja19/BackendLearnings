package com.example.Todo.tasks;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class TaskRepositoryTests {
    @Autowired private TaskRepository taskRepository;

    @Test
    public void canCreateTask() {
        TaskEntity task = new TaskEntity();
        task.name = "test task";
        task.dueDate = new Date();
        taskRepository.save(task);

        TaskEntity savedTask = taskRepository.findAll().get(0);

        assertEquals("test task", savedTask.name);

        System.out.println(savedTask);
    }
}
