package entities;

public class Student {
	
	public String name;
	public double g1;
	public double g2;
	public double g3;
	
	public double total() {
		return g1 + g2 + g3;
	}
	
	public double missing() {
		if(total() < 60.0) {
			return 60.0 - total();
		}
		else {
			return 0.0;		
		}
	}
		
}
