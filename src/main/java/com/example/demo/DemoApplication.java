package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients("com.example.demo")
@EnableScheduling
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		System.out.println(Thread.currentThread().toString());

		//TelegramRestClient client = (TelegramRestClient) ctx.getBean("com.example.demo.TelegramRestClient");

		//System.out.println(client.getMe().getBody().toString());

		SmLabbot bot = (SmLabbot) ctx.getBean("SmLabbot");

		System.out.println(bot.getme().getBody().toString());

		//TestTask task = ctx.getBean(TestTask.class);
		//task.printMessages();

		SpringApplication.exit(ctx);
	}
}
