

import java.util.Locale;
public class concatenar_elementos {

	public static void main(String[] args) {
		
		double x = 93.66914;
		String nome = "Maria";
		int idade = 31; 
		double renda = 4000.0;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("Resultado = %.2f metros%n", x);
		System.out.println("UTILIZANDO MARCADORES DE VARIAVEIS:");
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
