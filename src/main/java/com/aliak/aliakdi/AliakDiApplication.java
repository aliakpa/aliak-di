package com.aliak.aliakdi;

import com.aliak.aliakdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AliakDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run((AliakDiApplication.class));

		I18NController i18NController = (I18NController) ctx.getBean("i18NController");

		System.out.println(i18NController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("-------Primary Bean");

		System.out.println(myController.sayHello());


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
