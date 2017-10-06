package com.pk.hs.runner;

import com.pk.hellospring.HelloWorld;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		//objA.getMessage();
		//objA.setMessage("I'm object A");
		objA.getMessage();

		//HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		//objB.getMessage();

		context.registerShutdownHook();
	      
	   }

}
