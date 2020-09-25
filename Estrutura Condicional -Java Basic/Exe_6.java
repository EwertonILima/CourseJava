package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exe_6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		
		if (N < 0 || N > 100) {
			System.out.printf("Fora de Intervalo");
		}
		else if (N <= 25) {
			System.out.printf("Intervalo [0,25]");
		}
		else if (N <= 50) {
			System.out.printf("Intervalo [25,50]");
		}
		else if (N <= 75) {
			System.out.printf("Intervalo [50,75]");
		}
		else {
			System.out.printf("Intervalo [75,100]");
		}
		
		sc.close();
	}

}
