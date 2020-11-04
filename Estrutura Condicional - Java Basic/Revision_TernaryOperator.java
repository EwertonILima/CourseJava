package estrutura_condicional;

import java.util.Scanner;

public class Revision_TernaryOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		String face = (age < 45) ? "young" : "old";
		
		System.out.println(face);
		
		System.out.println();
		System.out.println("More than 16? (y/n)");
		char check = sc.next().charAt(0);
		
		String permission = (check == 'y') ? "you can drive" : "Access Denied";
		System.out.println(permission);
		
		sc.close();
	 }
}
