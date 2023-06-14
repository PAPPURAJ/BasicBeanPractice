package io.github.pappuraj.constructor_ambiguity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("io/github/pappuraj/construction_ambiguity/config.xml");
		Calculation bean=context.getBean("in1",Calculation.class);
		context.registerShutdownHook();
	}

}
