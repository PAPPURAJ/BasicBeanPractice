package io.github.pappuraj.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class RoboticsComponents implements InitializingBean,DisposableBean{

	private String name;
	private double price;
	
	public RoboticsComponents() {
		super();
	}

	public RoboticsComponents(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		System.out.println("Constructor!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Set name");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("Set price");
	}

	@Override
	public String toString() {
		return "RoboticsComponents [name=" + name + ", price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Init!");
		
	}

	public void destroy() throws Exception {
		System.out.println("Destroy!");
		
	}
	
	
	@PreDestroy
	public void classDestroy() {
		System.out.println("annotaion destroy");
	}
	
	@PostConstruct
	public void classInit() {
		System.out.println("annotation init!");
	}
	
	
	
	
}
