package sub2;

/*
��¥: 2021/05/17
�̸�: ��ο�
����: �ڹ� ���� �ǽ��ϱ�
*/

public class DataTypeTest {
	public static void main(String[] args) {
		
		// ������(4�� ��� ������ - ���� ũ�⿡ ���� ����)
		byte num1 = 127;  // byte�� 127������ ������ �� ����.(1����Ʈ)
		short num2 = 32767;  // short�� 32767������ ������ �� ����.(2����Ʈ)
		int num3 = 2147483647;  // int�� 2147473647������ ������ �� ����.(4����Ʈ)
		long num4 = 1000L;  // long�� ��û�� ���� ������ �� ����.(8����Ʈ)   ������ �ڿ� L�� �ٿ���.
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		System.out.println("num3:"+num3);
		System.out.println("num4:"+num4);
		
		
		// �Ǽ���
		float var1 = 1.123456789f;	// �Ҽ���: 7�ڸ����� ����.
		double var2 = 1.1234567890123456789;	// �Ҽ���: 16�ڸ����� ����.
		
		System.out.println("var1:"+var1);
		System.out.println("var2:"+var2);
		
		
		// ����
		boolean value1 = true;
		boolean value2 = false;
		
		System.out.println("value1:"+value1);
		System.out.println("value2:"+value2);
		
		
		// ������
		char ch1 = 'A';
		char ch2 = '��';
		
		System.out.println("ch1:"+ch1);
		System.out.println("ch1:"+ch2);
		
		
		// ���ڿ�
		String str1 = "Apple";
		String str2 = "����";
		String str3 = "A";
		String str4 = "��";
		
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
		System.out.println("str4:"+str4);
	}
}
