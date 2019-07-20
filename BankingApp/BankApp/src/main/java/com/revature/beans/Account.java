package com.revature.beans;

import java.util.ArrayList;

public class Account {

	// acc has ArrayList<User>, current balance, boolean isJoint, boolean isApproved
	// constructor, getter & setter, AND toString
	ArrayList<User> User;
	float CurrentBalance;
	boolean isJoint;
	boolean isApproved;
	
	public Account (ArrayList<User>User, float CurrentBalance, boolean isJoint, boolean isApproved) {
		this.User=User;
		this.CurrentBalance=CurrentBalance;
		this.isJoint=isJoint;
		this.isApproved=isApproved;
	}
	
	
}
