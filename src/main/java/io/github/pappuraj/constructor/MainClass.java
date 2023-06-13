package io.github.pappuraj.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("io/github/pappuraj/constructor/config.xml");
		Teacher teacher=(Teacher) context.getBean("teacher1");
		System.out.println(teacher);

	}

}
