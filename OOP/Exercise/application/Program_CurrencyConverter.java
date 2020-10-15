package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program_CurrencyConverter {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("What is the dollar price? ");
		double coti = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double qtd = sc.nextDouble();
		
		double payment = CurrencyConverter.topay(coti, qtd);
		System.out.printf("Amount to be paid in reais = %.2f%n", payment);
		
		sc.close();
	}

}
