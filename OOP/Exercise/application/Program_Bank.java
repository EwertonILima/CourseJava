package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program_Bank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		String accountId = sc.next();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");	
		String check = sc.next();
		double transition = 0;
		if(check.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			transition = sc.nextDouble();
		}
		
		Bank bank = new Bank(accountId, holder, transition);
	
		bank.setAccountId("7777");
		System.out.println("Updated accountId: " + bank.getAccountId());
		bank.setHolder("Jorginho do Samba");
		System.out.println("Updated holder: " + bank.getHolder());
		
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		bank.addValue(value);
		
		System.out.println("Updated account data:");
		System.out.println(bank);
		
		bank.setAccountId("8532");
		System.out.println("Updated accountId: " + bank.getAccountId());
		bank.setHolder("Alex Green");
		System.out.println("Updated holder: " + bank.getHolder());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		bank.removeValue(value);
		
		System.out.println("Updated account data:");
		System.out.println(bank);
		
		sc.close();
	}

}


