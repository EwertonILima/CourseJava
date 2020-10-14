package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator_StaticMembers;

public class Program_With_StaticMembers {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator_StaticMembers calc = new Calculator_StaticMembers();

		System.out.println("Enter radius:");
		double radius = sc.nextDouble();

		double c = Calculator_StaticMembers.circunference(radius);

		double v = Calculator_StaticMembers.volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator_StaticMembers.PI);

		sc.close();
	}
}
