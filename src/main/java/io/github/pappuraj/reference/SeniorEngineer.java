package io.github.pappuraj.reference;

public class SeniorEngineer {

	private String name;
	private JuniorEngineer juniorEngineer;

	public SeniorEngineer() {
		super();
	}

	public SeniorEngineer(String name, JuniorEngineer juniorEngineer) {
		super();
		this.name = name;
		this.juniorEngineer = juniorEngineer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JuniorEngineer getJuniorEngineer() {
		return juniorEngineer;
	}

	public void setJuniorEngineer(JuniorEngineer juniorEngineer) {
		this.juniorEngineer = juniorEngineer;
	}

	@Override
	public String toString() {
		return "SeniorEnginner [name=" + name + ", juniorEngineer=" + juniorEngineer + "]";
	}

}
