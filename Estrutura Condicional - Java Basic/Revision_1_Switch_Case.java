package estrutura_condicional;

import java.util.Scanner;

public class Revision_1_Switch_Case {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int y = sc.nextInt();
		
		String cor;
		
		switch(y) {
			case 1:
				cor = "verde";
				break;
			case 2:
				cor = "azul";
				break;
			case 3:
				cor = "vermelho";
				break;
			default:
				cor = null;
				break;				
		}
		System.out.println();
		System.out.println("Cor: " + cor);
		
		System.out.println();
		String teste = sc.next();
		
		switch(teste) {
			case "green":
				cor = "verde";
				break;
			case "blue":
				cor = "azul";
				break;
			case "red":
				cor = "vermelho";
				break;
			default:
				cor = null;
				break;		
		}
		
		
		System.out.println();
		System.out.println("Cor:" + cor);
		
		System.out.println();
		sc.nextLine();
		String compound = sc.nextLine();
		
		switch(compound) {
		case "Green Gr":
			cor = "verde composto";
			break;
		case "Blue Bl":
			cor = "azul composto";
			break;
		case "Red Rd":
			cor = "vermelho composto";
			break;
		default:
			cor = null;
			break;
		}
		System.out.println();
		System.out.println("Cor:" + cor);
		
		sc.close();
	 }
	
}
