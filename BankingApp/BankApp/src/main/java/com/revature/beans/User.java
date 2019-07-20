package com.revature.beans;

import java.util.ArrayList;

public class User {
	
	//person has String name, ArrayList<Account> accounts, String password, int role, 
	// constructors, getter setters, tostring
	String name;
	ArrayList<Account> accounts;
	String password;
	int role;
	
	public User(String name, ArrayList<Account> accounts, String password, int role) {
		this.name=name;
		this.accounts=accounts;
		this.password=password;
		this.role=role;
		
	}
	
	




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
}
