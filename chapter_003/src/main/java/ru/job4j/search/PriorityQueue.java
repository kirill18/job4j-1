package ru.job4j.search;

import java.util.LinkedList;

/**
 * Queue of task with sorting by priority.
 * @author Roman Bednyashov (hipnorosva@gmail.com).
 * @since 0.1
 * @version 0.1
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Method add Tasks in queue and sort by priority.
     * 1 - higher priority.
     * 9 - lower priority.
     * @param task input Task
     */
    public void put(Task task) {
        int size = tasks.size();
        for (int index = 0; index < tasks.size(); index++) {
            if (task.getPriority() < tasks.get(index).getPriority()) {
                size = tasks.indexOf(tasks.get(index));
                break;
            }
        }
        tasks.add(size, task);
    }

    /**
     * Takes first task and remove it from queue.
     * @return first task in queue.
     */
    public Task take() {
        return this.tasks.poll();
    }

    public Task takeLast() {
        Task task = this.tasks.getLast();
        this.tasks.removeLast();
        return task;
    }

    public Task getTask(int id) {
        return this.tasks.get(id);
    }
}