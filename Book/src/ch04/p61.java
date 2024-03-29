package ch04;

public class p61 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		// And 연산
		System.out.println(a > b && a == 10);  // true
		System.out.println(a > b && a == b);  // false
		
		// OR 연산
		System.out.println(a > b || a == b);  // true
		System.out.println(a < b || a == b);  // false
		
		// XOR 연산
		System.out.println(a > b ^ a == 10);  // false
		System.out.println(a > b ^a == b);  // true
		
		// NOT 연산
		System.out.println(!(a > b));  // false
		System.out.println(!(a < b));  // true
	}

}
