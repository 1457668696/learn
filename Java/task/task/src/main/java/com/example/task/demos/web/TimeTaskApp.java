package com.example.task.demos.web;

import java.util.Timer;
import java.util.TimerTask;

public class TimeTaskApp {

    public static void main(String[] args) {

        Timer time = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("你好");
            }
        };

        time.schedule(task, 0, 2000);

    }
}
