package com.jaskaran.training;

import org.springframework.stereotype.Component;

import com.jaskaran.training.interfaces.Framework;

@Component("pythonFramework")
public class PythonFramework implements Framework{

	@Override
	public String getFramework() {
		return "Django";
	}

}
