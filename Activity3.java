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
		System.out.println("Enter a second numer: ");
		String val2str = scanner.nextLine();
		int val2int = Integer.parseInt(val2str);
		System.out.println("Sum: " + getSum(val1int, val2int));
		System.out.println("Difference: " + getDifference(val1int, val2int));
		System.out.println("Product: " + getProduct(val1int, val2int));
	}
	public static int getSum(int x, int y) {
		return x + y;
	}
	public static int getDifference(int x, int y) {
		return x - y;
	}
	public static int getProduct(int x, int y) {
		return x * y;
	}
}
