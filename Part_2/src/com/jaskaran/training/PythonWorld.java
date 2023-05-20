package com.jaskaran.training;

import com.jaskaran.training.interfaces.JavaLanguage;
import com.jaskaran.training.interfaces.PythonLanguage;

public class PythonWorld implements PythonLanguage{
	private JavaLanguage javaLanguage;
	
	public PythonWorld(JavaLanguage javaLanguage) {
		this.javaLanguage = javaLanguage;
	}
	
	@Override
	public String learningPython() {
		return "I am Learning Python";
	}
	
	public String learningJava () {
		return javaLanguage.learningJava();
	}
}
