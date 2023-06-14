package io.github.pappuraj.autowirering;

public class Robotic {
	private Microcontroller microcontroller;
	private int quantity;

	public Robotic() {
		super();
	}

	public Robotic(Microcontroller microcontroller, int quantity) {
		super();
		this.microcontroller = microcontroller;
		this.quantity = quantity;
	}

	public Microcontroller getMicrocontroller() {
		return microcontroller;
	}

	public void setMicrocontroller(Microcontroller microcontroller) {
		this.microcontroller = microcontroller;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Robotic [microcontroller=" + microcontroller + ", quantity=" + quantity + "]";
	}

	


	
}
