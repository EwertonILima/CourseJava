package outrosTopicosBasicos;

import java.util.Scanner;

public class Exemplo_2_OperadoresBitwise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b00100000;//número 32 em binário
		int n = sc.nextInt();
		
		if((n & mask) != 0) { 
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false");
		}
		
		sc.close();
	}

}
