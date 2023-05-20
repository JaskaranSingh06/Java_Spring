package com.jaskaran.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
		JavaLanguage language = context.getBean("framework", JavaWorld.class);
		System.out.println(language.learningJava());
		context.close();
	}

}
