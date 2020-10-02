package estruturas_repetitivas;

import java.util.Scanner;

public class Exe_For_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			
			int quad = (int) Math.pow(i, 2);
			int cub = (int) Math.pow(i, 3);
			System.out.printf("%d %d %d%n",i,quad,cub);
		}
		
		sc.close();
	}
}
