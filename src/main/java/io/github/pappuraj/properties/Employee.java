package io.github.pappuraj.properties;
import java.util.*;

public class Employee {
	private String name; 
	private List<String> friends;
	private Set<String> skills;
	private Map<String, String> workExp;
	private Properties prop;
	public Employee() {
		super();
	}
	public Employee(String name, List<String> friends, Set<String> skills, Map<String, String> workExp,
			Properties prop) {
		super();
		this.name = name;
		this.friends = friends;
		this.skills = skills;
		this.workExp = workExp;
		this.prop = prop;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	public Map<String, String> getWorkExp() {
		return workExp;
	}
	public void setWorkExp(Map<String, String> workExp) {
		this.workExp = workExp;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
	
	
		
	
}
