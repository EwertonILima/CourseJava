package outrosTopicosBasicos;

public class Exemplo_Substring_1_FuncoesParaString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG";
		
		String s04 = original.substring(2);
		
		System.out.println("Original: -" + original + "-");
		System.out.println("substring(2): -" + s04 + "-");
	}

}
