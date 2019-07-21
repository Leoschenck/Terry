package com.revature.view;

import java.util.Scanner;

/*
 * Scanner = new Scanner() to reset.
 * input = sc.nextLine() to read the next input.
 * switch(input.toCharArray()[1]){ case(l): ...;break; case(r):...  to interpret the input
 *
 * 	 
 */

public class View {
	static String input = "";

	public static void startView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the banking bash! To log in, enter -l, or to register an account, enter -r");

		input = sc.nextLine();
		if (input.length() < 2) {
			startView();
		}

		switch (input.toCharArray()[1]) {
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

	}

	public static void registerView() {

	}
}
