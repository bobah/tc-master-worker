package com.terracota.mv;

import org.terracotta.executor.DistributedExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;

/**
 * Created by vkatson
 * Date: 03.02.2009
 * Time: 17:27:21
 */
public class Scheduler {
    public static void main(String[] args) {
        ExecutorService executor = new DistributedExecutorService("myTopologyName");
        for (int i = 0; i < 1000; i++) {
            Callable<String> myTask = new Task(i);
            executor.submit(myTask);
        }
    }
}
