package ch07;

public class p186 {
	
	public static void main(String[] args) {
		
		// Singleton s = new Singleton();  // 에러 발생
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
	}

}

class Singleton {
	
	// static 변수
	private static Singleton instance = new Singleton();
	
	// 생성자에 private 접근 제한자
	private Singleton() {
		System.out.println("객체 생성");
	}
	
	// static 메서드
	public static Singleton getInstance() {
		System.out.println("객체 리턴");
		return instance;
	}
	
}