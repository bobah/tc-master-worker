package com.terracota.mv;

import org.terracotta.executor.DistributedWorkerService;

/**
 * Created by vkatson
 * Date: 03.02.2009
 * Time: 17:30:03
 */
public class StartWorker {

    public static void main(String[] args) throws Exception {
        DistributedWorkerService worker = new DistributedWorkerService("myTopologyName");
        worker.start();
    }

}
