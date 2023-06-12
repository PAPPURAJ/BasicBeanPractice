package io.github.pappuraj.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("io/github/pappuraj/properties/employee_info.xml");
		Employee emp=(Employee)context.getBean("Emp1");
		System.out.println(emp.getName());
		System.out.println(emp.getSkills());
		System.out.println(emp.getFriends());
		System.out.println(emp.getWorkExp());
	}

}
