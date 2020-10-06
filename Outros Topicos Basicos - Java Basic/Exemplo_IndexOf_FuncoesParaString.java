package outrosTopicosBasicos;

public class Exemplo_IndexOf_FuncoesParaString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG";
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
	}

}
