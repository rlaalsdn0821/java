package sub1;

/*
* ��¥: 2021/05/25
* �̸�: ��ο�
* ����: �ڹ� ����Ŭ����(�⺻ API Ŭ����) �ǽ��ϱ�
*/

public class ObjectTest {
	
	public static void main(String[] args) {
		
		/*
		 * Object Ŭ����
		 * - �ڹ��� �ֻ��� Ŭ����.
		 * - �ڹ��� ��� Ŭ������ Object Ŭ������ ��� �޴´�.
		 * - �������� Ȱ��
		 */
		
		Apple apple = new Apple("�ѱ�", 3000);
		Banana banana = new Banana("�븸", 5000);
		
		apple.toString();
		banana.toString();
		
	}

}
