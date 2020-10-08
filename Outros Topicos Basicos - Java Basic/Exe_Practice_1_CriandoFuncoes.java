package outrosTopicosBasicos;

import java.util.Scanner;

public class Exe_Practice_1_CriandoFuncoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira duas notas: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		double media = calculoMedia(n1, n2);
		
		mostraMedia(media);
		
		sc.close();
	}

		public static double calculoMedia(double x, double y) {
			
			double aux = (x + y) / 2;
			
			return (double) aux;
		}
		
		public static void mostraMedia(double value) {
			System.out.println("A média é: " + value);
		}
}
