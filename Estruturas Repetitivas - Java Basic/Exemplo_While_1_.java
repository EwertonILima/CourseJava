package estruturas_repetitivas;

import java.util.Scanner;

public class Exemplo_While_1_ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while(x != 0) {
			x = sc.nextInt();
		}
		sc.close();
	}

}
