package com.bpi.helloworld.main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome Java");
		System.out.println("Enter a number: ");
		String val1str = scanner.nextLine();
		int val1int = Integer.parseInt(val1str);
		String name = "";
		if (val1int < 18) {
			name = "Minor";
		} else if (val1int >= 18 && val1int < 60) {
			name = "Adult";
		} else if (val1int > 60) {
			name = "Senior";
		}
		System.out.println("You are a: " + name);
		scanner.close();
	}
}
