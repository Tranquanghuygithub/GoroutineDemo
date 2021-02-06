package com.demo.goroutine;

import org.fusesource.hawtdispatch.Dispatch;

import java.util.concurrent.TimeUnit;

public interface AsyncUtils {

    default public void async(Runnable runnable) {
        Dispatch.getGlobalQueue().execute(runnable);
    }

    default public void asyncAfter(long duration, TimeUnit unit, Runnable runnable) {
        Dispatch.getGlobalQueue().executeAfter(duration, unit, runnable);
    }

}
