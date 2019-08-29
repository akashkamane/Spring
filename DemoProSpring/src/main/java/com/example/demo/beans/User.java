package com.example.demo.beans;

public class User {
	private String id;
	private String name;
	private String sirname;
	private String username;
	private String address;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String id, String name, String sirname, String username, String address) {
		super();
		this.id = id;
		this.name = name;
		this.sirname = sirname;
		this.username = username;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSirname() {
		return sirname;
	}
	public void setSirname(String sirname) {
		this.sirname = sirname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sirname=" + sirname + ", username=" + username + ", address="
				+ address + "]";
	}
	
	
}
