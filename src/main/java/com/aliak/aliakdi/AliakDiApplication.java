package com.aliak.aliakdi;

import com.aliak.aliakdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AliakDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run((AliakDiApplication.class));

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
