package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe_6 {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double tgl = (A * C) / 2;
		double ccl = Math.PI * Math.pow(C, 2);
		double tpz = ((A+B) * C) / 2;
		double qdd = Math.pow(B, 2);
		double rtgl = A * B;
		
		System.out.printf("Triangulo: %.3f%n", tgl);
		System.out.printf("Circulo: %.3f%n", ccl);
		System.out.printf("Trapezio: %.3f%n", tpz);
		System.out.printf("Quadrado: %.3f%n", qdd);
		System.out.printf("Retangulo: %.3f%n", rtgl);		
		
		sc.close();
	}

}
