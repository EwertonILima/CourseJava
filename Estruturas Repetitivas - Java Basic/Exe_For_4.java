package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exe_For_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		for(int i=0; i<N; i++) {
			
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			double resultado = (double) n1 / n2;
			
			if (n2 == 0) {
				System.out.println("Divisão Impossivel");
			}
			else {
				System.out.printf("%.1f%n", resultado);
			}			
		}
		
		sc.close();
	}

}
