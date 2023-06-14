package io.github.pappuraj.autowirering;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("io/github/pappuraj/autowirering/config.xml");
		Robotic robotic=context.getBean("mc1",Robotic.class);
		System.out.println(robotic);
	}
}
