package test1;

/*
날짜: 2021/05/20
이름: 김민우
내용: 자바 피나보치 수열 연습문제..
*/

public class JavaTest10 {

	public static void main(String[] args) {
		
		int n1 = 1;
		int n2 = 2;
		int n3;
		
		System.out.print(n1+", ");
		System.out.print(n2+", ");
		
		for(int i=1 ; i <=10 ; i++) {
			n3 = n1+ n2;
			System.out.print(n3+", ");
			
			n1 = n2;
			n1 = n3;
		}
	}
}
