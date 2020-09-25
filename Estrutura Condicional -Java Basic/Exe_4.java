package estrutura_condicional;

import java.util.Scanner;

public class Exe_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ini, fim, hora;
		ini = sc.nextInt();
		fim = sc. nextInt();
		
		if(ini > fim) {
			hora = 24 - ini + fim;
			System.out.printf("O jogo durou %d%n hora(s)", hora);			
		}
		else {
			hora = fim - ini;
			System.out.printf("O jogo durou %d%n hora(s)", hora);
		}
		
		sc.close();
	}

}
