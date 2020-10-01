package estruturas_repetitivas;

import java.util.Scanner;

public class Exe_For_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i=1; i<=N; i++) {
			int numeros = sc.nextInt();
			if(numeros >= 10 && numeros <= 20) {
				in += 1;
			}
			else {
				out += 1;  
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
