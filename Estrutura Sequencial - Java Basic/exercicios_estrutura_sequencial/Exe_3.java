package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exe_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dif,D,C,B,A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		dif = A * B - C * D;
		
		System.out.println("Diferenca = " + dif);
		
		sc.close();
	}

}
