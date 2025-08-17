package com.lordsbootcamp.task_manager.services;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.lordsbootcamp.task_manager.models.Task;

@Service
public class TaskService {

    // Using Map
    private final Map<Long, Task> taskWarehouse = new ConcurrentHashMap<>();

    // Class level variable to generate unique IDs.
    private final AtomicLong idCounter = new AtomicLong();

    // POST Operation
    public Task createTask(Task task) {
        // Generate a new unique ID
        long newId = idCounter.incrementAndGet();
        task.setId(newId);
        // Store the new task in our map
        taskWarehouse.put(newId, task);
        return task;
    }

    //GET operation
    public Collection<Task> getAllTasks() {
        return taskWarehouse.values();
    }

    public Task getTaskById(Long id) {
        return taskWarehouse.get(id);
    }

    //PUT operation
    public Task updateTask(Long id, Task updatedTask) {
        if (taskWarehouse.containsKey(id)) {
            updatedTask.setId(id);
            taskWarehouse.put(id, updatedTask);
            return updatedTask;
        }
        return null;
    }

    //DELETE operation
    public boolean deleteTask(Long id) {
        return taskWarehouse.remove(id) != null;
    }
}
