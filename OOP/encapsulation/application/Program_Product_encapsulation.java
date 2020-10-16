package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_encapsulation;

public class Program_Product_encapsulation {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product_encapsulation p = new Product_encapsulation();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price:");
		Double price = sc.nextDouble();
		Product_encapsulation product = new Product_encapsulation(name, price);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated name: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);		
		
		sc.close();
	}

}