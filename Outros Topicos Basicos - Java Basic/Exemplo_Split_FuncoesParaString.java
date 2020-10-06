package outrosTopicosBasicos;

public class Exemplo_Split_FuncoesParaString {

	public static void main(String[] args) {
		
		String s = "potato apple lemon 12345";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);

	}

}
