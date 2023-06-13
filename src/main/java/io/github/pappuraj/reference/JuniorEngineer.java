package io.github.pappuraj.reference;

public class JuniorEngineer {
	private String name;
	private String framework;

	
	
	public JuniorEngineer() {
		super();
	}



	public JuniorEngineer(String name, String framework) {
		super();
		this.name = name;
		this.framework = framework;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getFramework() {
		return framework;
	}



	public void setFramework(String framework) {
		this.framework = framework;
	}



	@Override
	public String toString() {
		return "JuniorEngineer [name=" + name + ", framework=" + framework + "]";
	}

	
	
	 


	
}
