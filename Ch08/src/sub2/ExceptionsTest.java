package sub2;

/*
* 날짜: 2021/05/25
* 이름: 김민우
* 내용: 자바 예외종류 실습하기
*/

public class ExceptionsTest {
	
	public static void main(String[] args) {
		
		// 배열 인덱스 참조 에러
		int arr[] = new int[3];
		
		for(int i=0; i<=3; i++) {
			try {
				arr[i] = i+1;
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int num : arr) {
			System.out.println("num: "+num);
		}
		
		// NullPointer 에러
		try {
			Tiger tiger = null;
		
			tiger.move();
			tiger.hunt();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// Casting
		try {
			Animal a1 = new Eagle();
			Animal a2 = new Shark();
			
			Eagle eagle = (Eagle) a1;
			Shark shark = (Shark) a1;
		}catch (ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}

}
