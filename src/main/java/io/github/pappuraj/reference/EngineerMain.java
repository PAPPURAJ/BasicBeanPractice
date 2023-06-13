package io.github.pappuraj.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EngineerMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("io/github/pappuraj/reference/config.xml");
		SeniorEngineer sEng=(SeniorEngineer) context.getBean("SEng1");
		System.out.println(sEng);
	}

}
