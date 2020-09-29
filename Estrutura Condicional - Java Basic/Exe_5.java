package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author digital.team23
 *
 */
public class Exe_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id, qtd;
		double total;
		id = sc.nextInt();
		qtd = sc.nextInt();
		
		if (id == 1) {
			total = qtd * 4.00;
		}
		else if (id == 2) {
			total = qtd * 4.50;	
		}
		else if (id == 3) {
			total = qtd * 5.00;			
		}
		else if (id == 4) {
			total = qtd * 2.00;			
		}
		else {
			total = qtd * 1.50;	
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}
