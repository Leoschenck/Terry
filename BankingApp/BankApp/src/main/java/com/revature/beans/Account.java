package com.revature.beans;

import java.util.HashMap;
import java.util.Set;

import com.revature.driver.Driver;

public class Account {

	// acc has ArrayList<User>, current balance, boolean isJoint, boolean isApproved
	// constructor, getter & setter, AND toString
	HashMap<User, Boolean> userApproval = new HashMap<User, Boolean>();
	final int accountNumber;
	float CurrentBalance;
	static int accountCount;

	private Account(User user, float currentBalance, int accountNumber) {
		userApproval.put(user, false);
		this.CurrentBalance = currentBalance;
		this.accountNumber = accountNumber;
		accountCount++;
	}

	public Account(User user, float CurrentBalance) {
		this(user, CurrentBalance, accountCount);
	}

	public Account(User user) {
		this(user, 0);
	}
	public void addUser(User user) {
		userApproval.put(user, false);
	}
	public static int getAccountCount() {
		return accountCount;
	}
	
	
	public void setApproval(User user) {
		userApproval.replace(user, true);
	}
	
	public void rejectApplication(User user) {
		userApproval.remove(user);
	}
	
	public boolean checkApprovals() {
		return userApproval.containsValue(false);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public boolean isApproved(User user) {
		return userApproval.get(user);
	}

	public Set<User> getUsers() {
		return userApproval.keySet();
	}

	public float getCurrentBalance() {
		return CurrentBalance;
	}

	public void setCurrentBalance(float currentBalance) {
		CurrentBalance = currentBalance;
	}

	@Override
	public String toString() {
		try {
			return "[Account Owner= " + userApproval.keySet().toArray()[0] + ", CurrentBalance= " + CurrentBalance
					+ ", isJoint= " + (userApproval.size() > 1) + ", AccountIndex= " + this.accountNumber +"]";
		} catch (Exception e) {
			return  "CurrentBalance= " + CurrentBalance
					+  ", AccountIndex= " + this.accountNumber +"]";
	
		}

	}

}
