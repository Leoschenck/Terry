package com.revature.beans;

import java.util.ArrayList;

public class Account {

	// acc has ArrayList<User>, current balance, boolean isJoint, boolean isApproved
	// constructor, getter & setter, AND toString
	ArrayList<User> User;
	float CurrentBalance;
	boolean isJoint;
	boolean isApproved;

	public Account(ArrayList<User> User, float CurrentBalance, boolean isJoint, boolean isApproved) {
		this.User = User;
		this.CurrentBalance = CurrentBalance;
		this.isJoint = isJoint;
		this.isApproved = isApproved;
	}

	public ArrayList<User> getUser() {
		return User;
	}

	public void setUser(ArrayList<User> user) {
		User = user;
	}

	public float getCurrentBalance() {
		return CurrentBalance;
	}

	public void setCurrentBalance(float currentBalance) {
		CurrentBalance = currentBalance;
	}

	public boolean isJoint() {
		return isJoint;
	}

	public void setJoint(boolean isJoint) {
		this.isJoint = isJoint;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	@Override
	public String toString() {
		return "Account [User=" + User + ", CurrentBalance=" + CurrentBalance + ", isJoint=" + isJoint + ", isApproved="
				+ isApproved + "]";
	}

}
