package entrada_de_dados;

import java.util.Scanner;

public class Exemplo_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		
		sc.close();
	}

}
