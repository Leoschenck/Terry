package com.revature.driver;

import java.util.ArrayList;
import java.util.Arrays;

import com.revature.beans.Account;
import com.revature.beans.User;
import com.revature.view.View;

public class Driver {
	static ArrayList<Account> applications = new ArrayList<Account>();
	static ArrayList<Account> accounts = new ArrayList<Account>();
	static ArrayList<User> users = new ArrayList<User>();

	// methods to checkPassword for a user who tried to login, to
	// withdraw,transfer,deposit (maybe
	// we should throw exceptions from model instead?)
	public static void main(String[] args) {
		// redirects into view;
		createMockUpData(); // later, this will read out our serialized files/file.
		// System.out.println(View.factorial(5));
		View.startView();

	}

	public static void loginUser(String userName, String password) {
		for (User user : users) {
			if (userName.equals(user.getName())) {
				if (password.equals(user.getPassword())) {
					System.out.println("hurray! " + user.getName() + ", u totally just logged in! Ameowzing. :3");
					View.startView();
				}
				System.out.println(
						"Your password did not match, if you forgot your pasword, please contact a system-admin, or register from the main menu!");
				View.loginView();
			}
		}
		System.out.println("We could not find a user named \"" + userName
				+ "\" in our Database. Please check the spelling and loggin again, or cancel with -c to register a new account.");
		View.loginView();

	}

	public static void getApplicationView() {
		// collect all applications here
		View.applicationView(applications);
	}

	public static void registerUser(String userName, String password) {
		for (User user : users) {
			if (userName.equals(user.getName())) {
				System.out.println(
						"The user you want to create already exists. Please chose another name and try again!");
				View.registerView();
			}
		}
		User newUser = new User(userName, password);
		users.add(newUser);
		// TODO Serialize the list (maybe extra method)
		System.out.println("Your account was created, congratulations! ");
		View.loginView();
	}

	public static void createMockUpData() {
		User terry = new User("Terry", "kittycat", 0);
		User leo = new User("Leo", "doggobark", 0);
		User mett = new User("Matt", "RollTide", 1);
		User BASTET = new User("BASTET", "lifat almada", 2);
		
		User[] userArray = new User[] { terry, leo, mett };
		users.addAll(Arrays.asList(userArray));
	}
	/*
	 * registerView 
	 * customerView -logout (as logoutView?) -a(ccountView) 
	 * accountView
	 * -w,d,t -a(pply) -logout 
	 * employeeView -logout -a(pplicationView) -c(ustomerInfo) 
	 * applicationView -a(ccept)/d(eny) -c 
	 * adminView -logout -a(pplicationView) -c(ustomerInfo for admins) 
	 * customerOverView(bool isAdmin for interactability) -c -e(dit: inputs would be: username as 
	 * unique key to find user, then 0/1/2/3 for which variable, then new value; -c to cancel, still check for same name,
	 * length,...)
	 * 
	 * 	MainFunctions: Login, Register
	 * 	UserFunctions: 
	 */
}
