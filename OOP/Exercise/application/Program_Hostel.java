package application;

import java.util.Scanner;

import entities.Hostel;

public class Program_Hostel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Hostel[] rooms = new Hostel[9];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1; i<n + 1; i++) {
			System.out.println();
			System.out.println("Rent #"+ i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rooms[room] = new Hostel(name, email);
		}
		
		System.out.println("Busy rooms:");
		for (int i=1; i<rooms.length; i++) {
			
			if ( rooms[i] != null) {
				System.out.println(i + ": " + rooms[i].getName() + ", " + rooms[i].getEmail());
			}
		} 
		
		sc.close();
	}

}
