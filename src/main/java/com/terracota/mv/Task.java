package com.terracota.mv;

import java.util.concurrent.Callable;
import java.util.Random;

/**
 * Created by vkatson
 * Date: 03.02.2009
 * Time: 16:09:37
 */
public class Task implements Callable<String> {

    private int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    synchronized public int getTaskId() {
        return taskId;
    }

    synchronized public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String call() throws Exception {
        System.out.println(taskId);
        Thread.sleep(40000);
        return "Task number: " + taskId;
    }
}
