package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exe_8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sal = sc.nextDouble();
		double imposto = 0.0;
		
		if (sal <= 2000.00) {
			System.out.println("Isento");
		}
		else if (sal <= 3000.00) {
			imposto = 1000 *  0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}
		else if (sal <= 4500.00) {
			imposto = (1000 * 0.08) + ((sal - 3000) * 0.18);
			System.out.printf("R$ %.2f%n", imposto);
		}
		else {
			imposto = (1000 * 0.08) + (1500 * 0.18) + ((sal - 4500) * 0.28);
			System.out.printf("R$ %.2f%n", imposto);
		}		
		
		sc.close();
	}

}
