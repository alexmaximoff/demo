package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestTaskB {
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void printMessages() throws InterruptedException {
        System.out.println(Thread.currentThread().toString() + " Task B " +  dateFormat.format(new Date()));
    }
}
