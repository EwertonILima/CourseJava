package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle_attribute_and_method;

public class Program_Triangle_attribute_and_method {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle_attribute_and_method x, y;
		x = new Triangle_attribute_and_method();
		y = new Triangle_attribute_and_method();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		} 
		else {
			System.out.println("Larger area: Y");
		}		
		
		sc.close();

	}

}
