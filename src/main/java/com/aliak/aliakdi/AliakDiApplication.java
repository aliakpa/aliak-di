package com.aliak.aliakdi;

import com.aliak.aliakdi.controllers.ConstructorInjectedController;
import com.aliak.aliakdi.controllers.MyController;
import com.aliak.aliakdi.controllers.PropertyInjectedController;
import com.aliak.aliakdi.controllers.SetterInjectedController;
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

		System.out.println("--------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------setter injected controller");

		SetterInjectedController setterInjectedController  = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------Constructor injected controller");

		ConstructorInjectedController constructorInjectedController  = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
