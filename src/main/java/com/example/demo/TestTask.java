package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;


@Component
public class TestTask{
    public static final Logger logger = LoggerFactory.getLogger(TestTask.class);
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void printMessages() throws InterruptedException {
        //System.out.println("Task A " +  dateFormat.format(new Date()));
        logger.info("Task A " +  dateFormat.format(new Date()));
        System.out.println(Thread.currentThread().toString());
    }
}
