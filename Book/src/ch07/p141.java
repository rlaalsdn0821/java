package ch07;

class Member  {

}

public class p141{
	
	public static void main(String[] args) {
		
		Member m = new Member();
		Member m2 = new Member();
		
		if (m == m2) {
			System.out.println("m개체와 m2객체는 같다.");
		}else {
			System.out.println("m개체와 m2객체는 같지 않다.");
		}
	}
}

