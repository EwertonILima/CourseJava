package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe_4_plus {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o número do Funcionário?");
		int id = sc.nextInt();
		System.out.println("Quantas horas trabalhadas?");
		int ht = sc.nextInt();
		System.out.print("Informe o valor da hora U$: ");
		
		double vh = sc.nextDouble();
		double sal = ht * vh;
		
		System.out.println();
		System.out.println("Number = " + id);
		System.out.printf("Salary = U$ %.2f%n ",sal);		
		
		sc.close();
	}

}
