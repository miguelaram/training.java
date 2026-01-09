package m3_activity3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, Integer> products = new HashMap<>();
        products.put("Tumbler", 800);
        products.put("Coffee", 200);
        products.put("Pie", 500);
        products.put("Shirt", 1000);
        products.put("Jacket", 2000);

        int choice;

        do {
        	
                System.out.println("Select an option:");
                System.out.println("1. Search product");
                System.out.println("2. Add a product");
                System.out.println("3. Print all products and prices");
                System.out.println("4. Find the cheapest product");
                System.out.println("5. Exit");
                System.out.print("Type: ");

                choice = input.nextInt();
                input.nextLine().trim();

                switch (choice) {

                        case 1:
                                System.out.print("Enter product name to search: ");
                                String search = input.nextLine().trim();

                                if (products.containsKey(search)) {
                                	
                                        System.out.println("Product found! " + "Product Name: " + search + "\n" + "Price: " + products.get(search));
                                        
                                } else {
                                	
                                        System.out.println("Product does not exist");
                                        
                                }
                                
                                break;

                        case 2:
                                System.out.print("Enter product name: ");
                                String name = input.nextLine();

                                System.out.print("Enter price of product: ");
                                int price = input.nextInt();
                                input.nextLine().trim();

                                products.put(name, price);
                                System.out.println("Product added: " + name);
                                break;

                        case 3:
                                System.out.println("Total list of all product names and prices:");
                                for (Map.Entry<String, Integer> entry : products.entrySet()) {
                                	
                                        System.out.println(entry.getKey() + " - " + entry.getValue());
                                        
                                }
                                
                                System.out.println("Total count: " + products.size());
                                break;

                        case 4:
                                String cheapestProduct = null;
                                int cheapestPrice = Integer.MAX_VALUE;
                                for (int priceCheap : products.values()) {
                                	if (priceCheap < cheapestPrice){
                                		cheapestPrice = priceCheap;
                                	}
                                }
                                for (Map.Entry<String, Integer> entry : products.entrySet()) {
                                	
                                        if (entry.getValue() < cheapestPrice) {
                                        	
                                                cheapestPrice = entry.getValue();
                                                cheapestProduct = entry.getKey();
                                                
                                        }
                                        
                                }

                                System.out.println("Cheapest Product name: " + cheapestProduct + "\n Cheapest Price: " + cheapestPrice);
                                break;

                        case 5:
                                System.out.println("Exiting program.");
                                break;

                        default:
                                System.out.println("Error. Please input a valid option from 1-5.");
                                
                }

        } while (choice != 5);

        input.close();
	}

}
