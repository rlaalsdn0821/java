package ch07;

public class p158 {
	
	public static void main(String[] args) {
		
		// ���� ����
		Method.printName();
		
		// ��ü�� �����ؼ� ����
		Method m = new Method();
		m.printEmail();
		
	}

}

class Method {
	
	static void printName() {
		System.out.println("printName() ����");
	}
	
	void printEmail() {
		System.out.println("printEmail() ����");
		
		printID();  // �ٸ� �޼��� ����
	}
	
	void printID() {
		System.out.println("printID() ����");
	}
}