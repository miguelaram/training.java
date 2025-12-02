package com.bpi.helloworld.main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome Java");
		System.out.println("Please choose an option: ");
		System.out.print("===== STUDENT GRADING SYSTEM ===== \n" + "");
		System.out.println("Sum = " + loopSum());
	}
	public static int loopSum(){
		int y = 0;
		for(int x = 0; x <= 50; x++) {
			y = x + y;
		}
		return y;
	}
}
