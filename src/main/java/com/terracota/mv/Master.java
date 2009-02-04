package com.terracota.mv;

import java.util.concurrent.*;
import java.util.List;
import java.util.Collection;

/**
 * Created by vkatson
 * Date: 03.02.2009
 * Time: 11:42:58
 */
public class Master implements ExecutorService {

    private final ExecutorService m_executor;

    public Master(BlockingQueue workQueue) {
        m_executor = new ThreadPoolExecutor(
                10, 100, 300L, TimeUnit.SECONDS, workQueue);
    }

    public Master(int corePoolSize, int maximumPoolSize, long keepAliveTime, BlockingQueue workQueue) {
        m_executor = new ThreadPoolExecutor(
                corePoolSize, maximumPoolSize,
                keepAliveTime, TimeUnit.SECONDS, workQueue);
    }

    public <T> List<Future<T>> invokeAll(Collection<Callable<T>> work) throws InterruptedException {
        return m_executor.invokeAll(work);
    }

    public <T> List<Future<T>> invokeAll(Collection<Callable<T>> work, long timeout, TimeUnit unit) throws InterruptedException {
        return m_executor.invokeAll(work);
    }

    public void shutdown() {

    }

    public List<Runnable> shutdownNow() {
        return null;
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }

    public <T> Future<T> submit(Callable<T> task) {
        return null;
    }

    public <T> Future<T> submit(Runnable task, T result) {
        return null;
    }

    public Future<?> submit(Runnable task) {
        return null;
    }

    public <T> T invokeAny(Collection<Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return null;
    }

    public <T> T invokeAny(Collection<Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    public void execute(Runnable command) {

    }
}
