package ch07;

public class p162 {
	
	public static void main(String[] args) {
		
		Operator1 op = new Operator1();
		
		System.out.println(op.multiply(4,3));
		
	}

}

class Operator1 {
	
	int multiply(int x, int y) {
		return x * y;
	}
}
