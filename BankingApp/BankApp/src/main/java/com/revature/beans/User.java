package com.revature.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

	// person has String name, ArrayList<Account> accounts, String password, int
	// role,
	// constructors, getter setters, tostring
	String name;
	ArrayList<Account> accounts;
	String password;
	int role;

	public User(String name, ArrayList<Account> accounts, String password, int role) {
		this.name = name;
		this.accounts = accounts;
		this.password = password;
		this.role = role;
	}

	public User(String name, String password, int role) {
		this(name, null, password, role);
	}
	public User(String name, String password) {
		this(name, null, password, 0);
	}

	@Override
	public String toString() {
		String roleString = "";
		switch(this.role) {
		case(0): roleString = "Customer" ;break;
		case(1): roleString = "Employee" ;break;
		case(2): roleString = "cAtmin" ;break;

		}
		return "User [name=" + name + ", accounts=" + accounts + ", password=" + password + ", role= " + roleString + "]";
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
