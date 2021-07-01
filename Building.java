package project;

import java.util.ArrayList;

public class Building {

	private String name;
	private int id;
	private ArrayList<Suite> suites = new ArrayList<Suite>();
	
	public Building(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public void addSuite(Suite s) {
		suites.add(s);
	}
	
	public void removeSuite(Suite s) {
		suites.remove(s);
	}

	
}
