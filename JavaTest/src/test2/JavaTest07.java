package test2;

/*
날짜: 2021/05/20
이름: 김민우
내용: 자바 최대공약수 연습문제..
*/

public class JavaTest07 {
	
	public static void main(String[] args) {
		System.out.println("1과 5의 최대공약수:"+gcd(1, 5));
		System.out.println("3과 6의 최대공약수:"+gcd(3, 6));
		System.out.println("12과 18의 최대공약수:"+gcd(12, 18));
		System.out.println("60과 24의 최대공약수:"+gcd(60, 24));
	}
	
	public static int gcd(int a, int b) {
		
		int temp = 0;
		
		if (a < b) {
			temp = a;
		}else {
			temp = b;
		}
		
		while (true) {
			
			if (a % temp == 0 && b % temp == 0) {
				break;
			}
			temp--;
		}
		return temp;
	}
}
