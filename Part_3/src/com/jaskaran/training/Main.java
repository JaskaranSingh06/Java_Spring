package com.jaskaran.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jaskaran.training.interfaces.Language;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		Language language = context.getBean("java", Language.class);
		
		language.learningLanguage();
		context.close();
	}

}
