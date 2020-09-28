package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		int id1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double preco1 = sc.nextDouble();
		
		int id2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double preco2 = sc.nextDouble();
		
		double total = preco1 * qtd1 + preco2 * qtd2;
		
		System.out.printf("%.2f%n", total);		
		
		sc.close();
	}

}
