package estrutura_condicional;

import java.util.Scanner;

public class Exe_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Não Negativo");
		}
		
		sc.close();
	}

}
