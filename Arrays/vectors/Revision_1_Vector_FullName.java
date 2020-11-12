package vetores;

import java.util.Scanner;

public class Revision_1_Vector_FullName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] vect = new String[n];
		
		sc.nextLine();
		for(int i=0; i<vect.length; i++) {
			vect[i] = sc.nextLine();
		}
		
		for (int i=vect.length -1; i>=0;i--) {
			System.out.println(vect[i]);
		}
		
		sc.close();
  }

}
	
		

