package estruturas_repetitivas;

import java.util.Scanner;

public class Exe_While_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while(id != 4) {
			if(id == 1) {
				alcool += 1;
			}
			else if(id == 2) {
				gasolina += 1;
			}
			else if(id == 3) {
				diesel += 1;
			}
			id = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);		
		
		sc.close();
	}

}
