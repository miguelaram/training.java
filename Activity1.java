package com.bpi.helloworld.main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome Java");
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("Hello, " + name + "!");
		scanner.close();
		
	}

}
