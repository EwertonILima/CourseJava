package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program_Student {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Student name: ");
		student.name = sc.nextLine();
		
		System.out.println();
		System.out.println("Student grades: ");
		student.g1 = sc.nextDouble();
		student.g2 = sc.nextDouble();
		student.g3 = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n", student.total());
		
		if (student.total() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missing());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
