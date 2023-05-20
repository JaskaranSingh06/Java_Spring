package com.jaskaran.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.jaskaran.training.interfaces.Framework;
import com.jaskaran.training.interfaces.Language;

@Component("java")
public class JavaWorld implements Language{
	
	private Framework framework;
	
	@Autowired
	public JavaWorld(@Qualifier("javaFramework") Framework framework) {
		this.framework = framework;
	}
	
	@Override
	public void learningLanguage() {
		System.out.println("I am Learning Java");
		System.out.println("Framework: " + framework.getFramework());
	}

}
