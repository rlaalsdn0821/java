package sub3;

/*
날짜: 2021/05/24
이름: 김민우
내용: 정적(클래스) 변수, 정적(클래스) 메서드 실습하기
*/

public class StaticTest {
	
	public static void main(String[] args) {
		
		Increment int1 = new Increment();
		Increment int2 = new Increment();
		Increment int3 = new Increment();
		
		/*
		 -정적변수는 하나의 인스턴스로 관리되어 참조된다.
		 -정적변수는 고정 할당영역(Method Area)에 생성되어 있기 때문에 객체 생성 없이 바로 참조할 수 있다.
		 */
		Increment.num2 += 3;
		Increment.add();
		
		//싱글톤 객체 - 교제 - p.185 (pdf 파일)
		Calc c = Calc.getInstance();
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(3, 2);
		int r4 = c.div(4, 2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
	}

}
