package entrada_de_dados;

import java.util.Scanner;

public class Exemplo_3_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		System.out.printf("Voce digitou: %.2%n", x);
		
		sc.close();

	}

}
