package outrosTopicosBasicos;

public class Exemplo_Replace_FuncoesParaString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG";
		
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		
		System.out.println("Original: " + original);
		System.out.println("replace('a', 'x'): " + s06);
		System.out.println("replace('abc', 'xy'): " + s07);
	}

}
