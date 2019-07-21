package com.revature.driver;

import java.util.ArrayList;

import com.revature.beans.Account;
import com.revature.beans.User;
import com.revature.view.View;

public class Driver {
	static ArrayList<Account> application;
	static ArrayList<Account> accounts;
	static ArrayList<User> users;
	
	//methods to checkPassword for a user who tried to login, to withdraw,transfer,deposit (maybe 
	//we should throw exceptions from model instead?)
	public static void main(String[] args) {
	//redirects into view; 	
		System.out.println(View.factorial(5));
		View.startView();
		
	}
	public static void loginUser(String userName, String password) {
		System.out.println("no match, sorriiyii");
	}
	public static void getApplicationView() {
		//collect all applications here
		View.applicationView(application);
	}
}
