package sub3;

/*
* ��¥: 2021/05/26
* �̸�: ��ο�
* ����: String Ŭ���� �ǽ��ϱ�
*/

public class StringTest {
	
	public static void main(String[] args) {
		
		// ���ڿ� = ���� + �迭
		String str = "Hello";
		char[] arr = {'H','e','l','l','o'};
		
		// ���ڿ� ��ü
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello";  // literal ���ڿ�
		String str4 = "Hello";
		
		// ���ڿ� ��
		if(str1 == str2) {
			System.out.println("str1�� str2�� �������� ���� ����.");
		}else {
			System.out.println("str1�� str2�� �������� ���� �ٸ���.");
		}
		
		if(str3 == str4) {
			System.out.println("str3�� str4�� �������� ���� ����.");
		}else {
			System.out.println("str3�� str4�� �������� ���� �ٸ���.");
		}
		
		if(str1.equals(str4)) {
			System.out.println("str1�� str4�� ���ڿ� ���� ���� ����.");
		}else {
			System.out.println("str1�� str4�� ���ڿ� ���� ���� �ٸ���.");
		}
		
	}

}
