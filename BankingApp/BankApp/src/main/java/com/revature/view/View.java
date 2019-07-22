package com.revature.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.driver.Driver;

/*
 * Scanner = new Scanner() to reset.
 * input = sc.nextLine() to read the next input.
 * switch(input.toCharArray()[1]){ case(l): ...;break; case(r):...  to interpret the input
 *
 * 	 
 */

public class View {
	static String input = "";
	static final int MINIMUMNAMELENGTH = 3;
	static final int MAXIMUMNAMELENGTH = 3;
	static final int MINIMUMPASSLENGTH = 3;

	public static void startView() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Welcome to the banking bash! To log in, enter -l, or to " + "register an account, enter -r \n\n");

		input = sc.nextLine();
		if (input.length() < 2 || input.charAt(0) != '-') {
			System.out.println("Choose -r or -l   (^_^)");
			startView();
		}

		switch (input.charAt(1)) {
		case ('l'):
			loginView();
			break;
		case ('r'):
			registerView();
			break;
		default:
			System.out.println("Choose -r or -l   (^_^)");
			startView();
			break;

		}
	}

	public static void loginView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("To login, enter your user name now. To cancel, enter -c");

		input = sc.nextLine();
		if (input.equals("-c")) {
			System.out.println("You cancelled the login and are back at the start screen.");
			startView();
		}
		if (input.length() < MINIMUMNAMELENGTH) {
			System.out.println("Usernames are longer than two character. To cancel, enter -c");
			loginView();
		}
		String userName = input;
		System.out.println("please now gief password or cancel with -c");
		sc = new Scanner(System.in);
		input = sc.nextLine();
		if (input.equals("-c")) {
			System.out.println("You cancelled the login and are back at the start screen.");  // extract that method? ("login", redirectViewIndex)
			startView();
		}
		if(input.length() < MINIMUMPASSLENGTH) {
			System.out.println("Too short of a password - please try again!");
			loginView();
		}
		String password = input;
		Driver.loginUser(userName, password);
	}

	public static void registerView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome! Please enter a Username, longer than one character. "
				+ "You may not choose a name that already exists. -c to return to the main menu.");
		input = sc.nextLine();
		if (input.equals("-c")) {
			System.out.println("You cancelled the registration and are back at the start screen.");
			startView();
		}
		if (MAXIMUMNAMELENGTH > input.length() && input.length() < MINIMUMNAMELENGTH) {
			System.out.println("Your name should consist of 3 to 10 characters. Please try again.");
			registerView();
		}
		String userName = input;
		System.out.println("Now please enter a strong password with at least 3 characters. enter -c to return to the main menu");
		sc = new Scanner(System.in);
		input = sc.nextLine();
		if (input.equals("-c")) {
			System.out.println("You cancelled the registration and are back at the start screen.");
			startView();
		}
		if(input.length()<MINIMUMPASSLENGTH) {
			System.out.println("Password should be longer! Please enter more than 3 letters.");
			registerView();
		}
		String password = input;
		Driver.registerUser(userName, password);
	}

	public static void applicationView(ArrayList<Account> accounts) {
		for (Account account : accounts) {
			System.out.println("Name: " + account.getUser());
		}
	}
	/*
	 * registerView customerView -logout (as logoutView?) -a(ccountView) accountView
	 * -w,d,t -a(pply) -logout employeeView -logout -a(pplicationView)
	 * -c(ustomerInfo) applicationView -a(ccept)/d(eny) -c adminView -logout
	 * -a(pplicationView) -c(ustomerInfo for admins) customerView(bool isAdmin) -c
	 * -e(dit: inputs would be: username as unique key to find user, then 0/1/2/3
	 * for which variable, then new value; -c to cancel, still check for same name,
	 * length,...)
	 * 
	 * 
	 */

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
