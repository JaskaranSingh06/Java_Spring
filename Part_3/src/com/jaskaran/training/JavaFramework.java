package com.jaskaran.training;

import org.springframework.stereotype.Component;

import com.jaskaran.training.interfaces.Framework;

@Component("javaFramework")
public class JavaFramework implements Framework{

	@Override
	public String getFramework() {
		return "SpringBoot";
	}

}
