package sub1;

/*
날짜: 2021/05/20
이름: 김민우
내용: 자바 오버로드 메서드(함수) 실습하기..
*/

public class MethodOverloadTest {

	public static void main(String[] args) {
		
		int r1 = add(1);
		int r2 = add(2, 3);
		String r3 = add("홍길동");
		
		System.out.println("r1:"+r1);
		System.out.println("r2:"+r2);
		System.out.println("r3:"+r3);
		
	} // main end.
	
	public static int add(int num) {
		return num++;
	}
	public static int add(int x, int y) {
		return x + y;
	}
	public static String add(String str) {
		return str+"님 반갑습니다.";
	}
	
}
