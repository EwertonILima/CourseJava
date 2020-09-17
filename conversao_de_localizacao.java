

import java.util.Locale;

public class conversao_de_localizacao {

	public static void main(String[] args) {
	
		double x =  54.86724;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);

	}

}
