package com.jaskaran.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
		PythonWorld language = context.getBean("framework", PythonWorld.class);
		
		System.out.println(language.learningPython());
		System.out.println(language.learningJava());
		context.close();
	}

}
