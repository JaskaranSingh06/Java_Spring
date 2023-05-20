package com.jaskaran.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.jaskaran.training.interfaces.Framework;
import com.jaskaran.training.interfaces.Language;

@Component("python")
public class PythonWorld implements Language{
	
private Framework framework;
	
	@Autowired
	public PythonWorld(@Qualifier("pythonFramework") Framework framework) {
		this.framework = framework;
	}
	
	@Override
	public void learningLanguage() {
		System.out.println("I am Learning Python");
		System.out.println("Framework: " + framework.getFramework());
	}
}
