package com.terracota.mv;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;


public class App {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");

        // get the master from the application context
        ExecutorService master = (ExecutorService) ctx.getBean("master");

        // create a collection with some work
        Collection<Callable<String>> work = new ArrayList<Callable<String>>();
        for (int i = 0; i < 2000; i++) {
            work.add(new Task(i));
        }

        // schedule the work and wait until all work is done
        List<Future<String>> result = master.invokeAll(work);
/*
        for (Future<String> f : result) {
            System.out.println(f.get());
        }
*/
    }
}
