package com.bpi.helloworld.main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome Java");
		System.out.println("Enter your age");
		String name = scanner.nextLine();
		int nameint = Integer.parseInt(name);
		double namedbl = (double) nameint;
		System.out.println("Your age as int: " + nameint);
		System.out.println("Your age as double: " + namedbl);
		scanner.close();
		
	}

}
