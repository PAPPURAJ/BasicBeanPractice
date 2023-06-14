package io.github.pappuraj.autowirering;

public class Microcontroller {
	private String name;
	private String model;
	private double price;
	public Microcontroller() {
		super();
	}
	public Microcontroller(String name, String model, double price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Microcontroller [name=" + name + ", model=" + model + ", price=" + price + "]";
	}
	
	
}
