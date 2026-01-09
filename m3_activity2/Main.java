package m3_activity2;

import java.util.InputMismatchException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void menu() {
		System.out.println("Select an option:");
		System.out.println("1. Search products");
		System.out.println("2. Add products");
		System.out.println("3. Display all products");
		System.out.println("4. Exit");
		System.out.print("Type: ");
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Set<String> products = new HashSet<>();
		
		
		products.add("Lenovo");	
		products.add("Apple");
		products.add("Dell");
		products.add("HP");
		products.add("Acer");
		
		int userInp = 0;
		String productName;
		boolean isFound = false;
		
		do {
			menu();
			try {
				userInp = input.nextInt(); 
				input.nextLine().trim();              
			}catch (InputMismatchException  e) {
				 System.out.println("Please input an option from 1-4.");
				 input.nextLine().trim();
				 continue;
			}
			
			switch(userInp) {
			case 1:
				System.out.print("ENTER PRODUCT NAME TO SEARCH     : ");
				productName = input.nextLine().trim();
				for (String product : products) {
					if(product.equalsIgnoreCase(productName)) {
						isFound = true;
						break;
					}
				}
				if (isFound == true) {
					System.out.println("Product found. \n Product name:" + productName );
				}else {
					System.out.println("Product not found. \n Product name: " + productName + " not existing");
				}
				isFound = false;
				break;
				
			case 2:
				System.out.print("Enter product name: ");
				String addProductName = input.nextLine().trim();
				if(addProductName.isEmpty()) {
					System.out.println("Please input a product name that is not empty");
					break;
				}
				boolean exists = products.stream()
								 .anyMatch(p -> p.equalsIgnoreCase(addProductName));
				
				if (exists) {
					System.out.println("Error. " + addProductName + " is already existing.");
				}else {
					System.out.println(addProductName + " successfully added.");
					products.add(addProductName);
				}
				break;
			case 3:
				for (String product : products) {
					System.out.println(product);
				}
				System.out.println("Total numbers: " + products.size());
				break;
			case 4:
				System.out.println("Exiting program");
				break;
			default:
				 System.out.println("Error. Please input a value from 1-4.");
			}
			
		}while(userInp != 4 );
		input.close();
	}
}