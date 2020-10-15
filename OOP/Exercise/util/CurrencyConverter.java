package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double topay(double coti, double qtd) {
		return (coti * qtd) * IOF + coti * qtd; 
	}
}
