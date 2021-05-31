package com.six.finger.leetcode.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/5/28 14:41
 */
class MyScheduledExecutor implements Runnable {

    private String jobName;

    MyScheduledExecutor() {

    }

    MyScheduledExecutor(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public void run() {

        System.out.println(jobName + " is running");
    }

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

        long initialDelay = 10;
        long period = 5;
        // 从现在开始1秒钟之后，每隔1秒钟执行一次job1
        service.scheduleAtFixedRate(new MyScheduledExecutor("job1"), initialDelay, period, TimeUnit.SECONDS);

        // 从现在开始2秒钟之后，每隔2秒钟执行一次job2
        service.scheduleWithFixedDelay(new MyScheduledExecutor("job2"), initialDelay, period, TimeUnit.SECONDS);

        System.out.println("完成");
    }


}
