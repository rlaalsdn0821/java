package ch07;

public class p186 {
	
	public static void main(String[] args) {
		
		// Singleton s = new Singleton();  // ���� �߻�
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
	}

}

class Singleton {
	
	// static ����
	private static Singleton instance = new Singleton();
	
	// �����ڿ� private ���� ������
	private Singleton() {
		System.out.println("��ü ����");
	}
	
	// static �޼���
	public static Singleton getInstance() {
		System.out.println("��ü ����");
		return instance;
	}
	
}