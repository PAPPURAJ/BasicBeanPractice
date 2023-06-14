package io.github.pappuraj.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("io/github/pappuraj/lifecycle/config.xml");
		RoboticsComponents rob=context.getBean("arduino",RoboticsComponents.class);
		System.out.println(rob);
		context.registerShutdownHook();
		


	}

}
