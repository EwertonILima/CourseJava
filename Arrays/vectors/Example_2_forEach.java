package vetores;

public class Example_2_forEach {

	public static void main(String[] args) {
		
		
		String[] vectString = new String[] {"Maria","Bob", "Alex"};
		
		for (int i=0;i<vectString.length;i++) {
			System.out.println(vectString[i]);
		}
		
		System.out.println("------------String----------------");
		
		System.out.println();
		System.out.println("For Each:");
		for(String forEach : vectString) {
			System.out.println(forEach);
		}
		
		System.out.println();
		System.out.println("--------------Character--------------");
		Character[] vectChar = new Character[] {'Z','Y','X','W','V'};
		
		System.out.println("Boxing:");
		char text = 'T';
		Character boxingString = text;
		System.out.println(boxingString);
		System.out.println();
		System.out.println("Unboxing:");
		char text2 = boxingString;
		System.out.println(text2);
		System.out.println();
		
		System.out.println("For Each:");
		for(Character forEach : vectChar) {
			System.out.println(forEach);
		}
		
		System.out.println();
		System.out.println("--------------Integer--------------");
		Integer[] vectInt = new Integer[] {1, 3, 5, 7, 9};
		
		System.out.println("Boxing:");
		int n1 = 10;
		Integer boxingInt = n1;
		System.out.println(boxingInt);
		System.out.println();
		System.out.println("Unboxing:");
		int n2 = boxingInt;
		System.out.println(n2);
		System.out.println();
		
		System.out.println("For Each:");
		for(Integer forEach : vectInt) {
			System.out.println(forEach);
		}
		
		System.out.println();
		System.out.println("---------------Double--------------");
		Double[] vectDouble = new Double[] {1.0, 2.0, 3.0, 4.0, 5.0};
		
		System.out.println("Boxing:");
		double n3 = 5.0;
		Double boxingDouble = n3;
		System.out.println(boxingDouble);
		System.out.println();
		System.out.println("Unboxing:");
		double n4 = boxingDouble;
		System.out.println(n4);
		System.out.println();
		
		System.out.println("For Each:");
		for(Double forEach : vectDouble) {
			System.out.println(forEach);
		}
	}

}
