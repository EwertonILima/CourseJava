package funcoes_matematicas;

import java.util.Scanner;

public class Exemplo {

	// Incluindo funções em expressões maiores
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double delta;
		double x1;
		double x2;
		
		delta = Math.pow(b, 2.0) - 4*a*c; //Formula de Delta
		System.out.printf("Valor de Delta: %.2f%n", delta);
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a); /* Fórmula de Bhaskara */
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);    
		
		System.out.printf("x' = %.2f%n", x1);
		System.out.printf("x'' = %.2f%n", x2);
		
		sc.close();

	}

}
