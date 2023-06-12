package io.github.pappuraj.properties;
import java.util.*;

public class Employee {
	private String name; 
	private List<String> friends;
	private Set<String> skills;
	private Map<String, String> workExp;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, List<String> friends, Set<String> skills, Map<String, String> workExp) {
		super();
		this.name = name;
		this.friends = friends;
		this.skills = skills;
		this.workExp = workExp;
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
	
	
		
	
}
