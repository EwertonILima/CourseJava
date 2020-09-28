package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe_4_ {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		int ht = sc.nextInt();
		
		double vh = sc.nextDouble();
		double sal = ht * vh;
		
		System.out.println();
		System.out.println("Number = " + id);
		System.out.printf("Salary = U$ %.2f%n ", sal);		
		
		sc.close();

	}

}
